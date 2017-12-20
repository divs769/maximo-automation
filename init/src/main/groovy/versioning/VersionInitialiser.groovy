package versioning

import com.amazonaws.services.s3.AmazonS3Client
import com.amazonaws.services.s3.AmazonS3ClientBuilder

class VersionInitialiser {

    private String AWS_BUCKET_FORMAT = "service.%s.lsdg.com/version"
    private String awsSourceFileName = "RENAME-ME"

    def copyFile(String destinationFileName, String accountNumber) {

        AmazonS3Client amazonS3Client = AmazonS3ClientBuilder.defaultClient()
        String awsBucketName = String.format(AWS_BUCKET_FORMAT, accountNumber)

        amazonS3Client.copyObject(awsBucketName, awsSourceFileName, awsBucketName, destinationFileName)

    }

}