#!/bin/bash
if [ -z "$1" ]
  then
    echo "serviceName (service name) not supplied"
    exit 1
fi
if [ -z "$2" ]
  then
    echo "serviceVersion (desired version number) not supplied"
    exit 1
fi
if [ -z "$3" ]
  then
    echo "teamAccountNumber (desired team account number) not supplied"
    exit 1
fi

serviceName=$1
serviceVersion=$2
teamAccountNumber=$3

s3ServiceVersionPath="https://s3-eu-west-1.amazonaws.com/service.${teamAccountNumber}.lsdg.com/version/"

s3Response=$(curl -w %{http_code} -s ${s3ServiceVersionPath}${serviceName})
s3HTTPCode=$(echo ${s3Response} | tail -c 4)

echo "S3 HTTP code is ${s3HTTPCode}"

if [ ${s3HTTPCode} = "404" ];
  then
    echo "The S3 versioning bucket returned a 404 response. This means a file was not found. Please upload a file named: ${serviceName}, containing a version number in the format MAJOR.MINOR.PATCH (e.g. 1.0.0 or 0.5.2), in order to continue."
    exit 1
fi
if [ ${s3HTTPCode} != "200" ];
  then
    echo "An error ${s3HTTPCode} occurred. S3 versioning file cannot be reached."
    exit 1
fi
if [ ${s3HTTPCode} = "200" ];
  then
    serviceDeployedVersion=$(echo ${s3Response} | rev | cut -c 4- | rev)

    #serviceGreatestVersion holds the greatest of serviceDeployedVersion and serviceVersion
    serviceGreatestVersion=$(printf "${serviceVersion}\n${serviceDeployedVersion}" | sort -Vr | head -1)

    if [ ${serviceVersion} = ${serviceDeployedVersion} ];
    then
      echo "Error: The desired version number, ${serviceVersion} is identical to the current version number ${serviceDeployedVersion} present at ${s3ServiceVersionPath}${serviceName}."
      exit 1
    elif [ ${serviceVersion} = ${serviceGreatestVersion} ];
    then
      echo "Success: The desired version number, ${serviceVersion} is greater than the current version number ${serviceDeployedVersion} present at ${s3ServiceVersionPath}${serviceName}."
      exit 0
    elif [ ${serviceVersion} != ${serviceGreatestVersion} ];
    then
      echo "Error: The desired version number, ${serviceVersion} is less than the current version number ${serviceDeployedVersion} present at ${s3ServiceVersionPath}${serviceName}."
      exit 1
    fi
fi