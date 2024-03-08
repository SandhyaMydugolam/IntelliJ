package Com.objects.basics;

public class Employee {
    String employeeName;
    String desgination;
    public Employee(String employeeName, String desgination){
        this.employeeName = employeeName;
        this.desgination = desgination;

    }
    double calcBonus(double basicAllowance){
        return basicAllowance;
    }
    double calcBonus(double basicAllowance,double houseAllowance,String gift){
        System.out.println(" : "+gift);
        return basicAllowance;
    }
    double calcBonus(double basicAllowance,String gift,double houseAllowance,double carAllowance){
        System.out.println(" : "+gift);
        double totalAllowance = basicAllowance+houseAllowance;
        return basicAllowance;

    }


}
