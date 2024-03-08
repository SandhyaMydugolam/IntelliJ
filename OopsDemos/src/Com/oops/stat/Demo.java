package Com.oops.stat;

public class Demo {
    static {
        System.out.println("In demo static block");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("main demo");
        Class.forName("Com.oops.stat.Trail");

        Trail.getMessage();
        }
    }

