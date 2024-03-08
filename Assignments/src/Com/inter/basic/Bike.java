package Com.inter.basic;

public class Bike extends Vechile implements IExternal{
    String Capacity;

    public Bike(String brand, String model, double price, String capacity) {
        super(brand, model, price);
        Capacity = capacity;
    }

    @Override
    public void showAcc() {
        System.out.println("Show Accessories");

    }

    @Override
    public void exterior() {
        System.out.println("Car Exterior");

    }

    @Override
    void getMileage() {
        System.out.println("Car Mileage");

    }

    @Override
    public Void ShowAcc() {
        return null;
    }
}
