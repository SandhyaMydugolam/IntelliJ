package Com.inter.basic;

public class MainVechile {
    public static void main(String[] args) {
        Vechile Car = new Car("Honda","2022",300000,"Luxury");
        Car.printDetails();
        Car.showMileage();
        Car.insuranceDetails();

    }
}
