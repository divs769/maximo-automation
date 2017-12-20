package file

class ReadMeRenamer {

    private String projectRoot

    public static final String README_FILE_NAME = "/README.md"
    public static final String ORIGINAL_SERVICE_NAME_DISPLAYABLE = "Microservice Template"

    ReadMeRenamer (projectRoot){
        this.projectRoot = projectRoot
    }

    def rename(String serviceNameDisplayable) {

        File file = new File(projectRoot + README_FILE_NAME)
        String contents = file.getText('UTF-8')
        contents = contents.replace(ORIGINAL_SERVICE_NAME_DISPLAYABLE, serviceNameDisplayable)
        file.setText(contents)
    }
}
