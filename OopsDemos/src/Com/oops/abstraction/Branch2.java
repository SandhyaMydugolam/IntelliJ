package Com.oops.abstraction;

public abstract class Branch2 extends Bank{
    @Override
    void housingLoan() {
        System.out.println("housing loan in branch2");

    }

    @Override
    void educationloan() {
        System.out.println("education loan in branch2");
    }
    void loanType(){
        System.out.println("Easy EMI loans in branch2");
    }
}
