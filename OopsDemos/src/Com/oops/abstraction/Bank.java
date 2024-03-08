package Com.oops.abstraction;

public abstract class Bank {
    abstract void carloan();
    abstract void housingLoan();
    abstract void educationloan();

    void admin(){
        System.out.println("Admin details in Bank");
    }
}
