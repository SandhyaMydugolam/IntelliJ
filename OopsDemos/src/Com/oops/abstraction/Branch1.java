package Com.oops.abstraction;

public abstract class Branch1 extends Bank{
    @Override
    void carloan() {
        System.out.println("car loan in branch1");
    }
    void educationloan(){
        System.out.println("edu loan in branch1");
    }
    void staffdetails(){
        System.out.println("staff in branch1");
    }
}
