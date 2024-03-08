package Com.objects.Inheritance;

public class Project {
    String projectName;
    int durationinMonths;
    String domain;
    String projectManager;

    public Project(String projectName, int durationinMonths, String domain, String projectManager) {
        this.projectName = projectName;
        this.durationinMonths = durationinMonths;
        this.domain = domain;
        this.projectManager = projectManager;
    }

    void showprojectDetails(){
        System.out.println("project name: "+projectName);
        System.out.println("project duration in months : "+durationinMonths);
        System.out.println("project Domain: "+domain);
        System.out.println("project Manager: "+projectManager);
    }}


