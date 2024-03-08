package Com.oops.stat;

import static Com.oops.stat.Trail.getMessage;


public class Sample {
    public static void main(String[] args) {
        System.out.println("main demo");
        int x=10,y=20;
        getMessage();
        System.out.println(Trail.x+Trail.y);
    }
}
