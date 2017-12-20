package file

class GrafanaDashboardRenamer {

    private String projectRoot

    public static final String DASHBOARD_FILE_NAME = "/init/Dashboard.json"
    public static final String ORIGINAL_SERVICE_NAME = "microservice-template"
    public static final String ORIGINAL_SERVICE_NAME_DISPLAYABLE = "Microservice Template"

    GrafanaDashboardRenamer (projectRoot){
        this.projectRoot = projectRoot
    }

    def rename(String serviceName, String serviceNameDisplayable) {

        File file = new File(projectRoot + DASHBOARD_FILE_NAME)
        String contents = file.getText('UTF-8')
        contents = contents.replace(ORIGINAL_SERVICE_NAME, serviceName)
        contents = contents.replace(ORIGINAL_SERVICE_NAME_DISPLAYABLE, serviceNameDisplayable)
        file.setText(contents)
    }
}