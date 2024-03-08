package Com.oops.abstraction;

public class SubBranch extends Branch2 {
    @Override
    void carloan() {
        System.out.println("car loan in sub branch");
    }
    void subpay(){
        System.out.println("payment in subbranch");
    }
}
