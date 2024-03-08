package Com.inter.basic;

public class Car extends Vechile implements IExternal,IInternal {
    String type;

    public Car(String brand, String model, double price, String type) {
        super(brand, model, price);
        this.type = type;
    }

    @Override
    public void showAcc() {
        System.out.println("Car Accessories :");

    }

    @Override
    public void exterior() {
        System.out.println("Car exterior :");

    }

    @Override
    void getMileage() {
        System.out.println("Mileage Details");

    }

    @Override
    public void showacc() {
        System.out.println("Accessories");

    }

    @Override
    public void interior() {
        System.out.println("Car Interior");

    }
}



