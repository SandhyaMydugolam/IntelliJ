package Com.objects.Inheritance;

public class TeamOne extends Project {
   String techStack;

    public TeamOne(String projectName, int durationinMonths, String domain, String projectManager, String techStack) {
        super(projectName, durationinMonths, domain, projectManager);
        this.techStack = techStack;
    }

    String[] showTechStack(){
        String[] arr1 = {"java","python","maven"};
        return arr1;
}
}
