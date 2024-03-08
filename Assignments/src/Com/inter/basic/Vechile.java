package Com.inter.basic;

abstract public class Vechile implements IInsurance {
    String brand;
    String model;
    double price;

    public Vechile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void getDetails(){
        System.out.println("brand :"+brand);
        System.out.println("model :"+model);
        System.out.println("price :"+price);
    }

    abstract void getMileage();



    @Override
    public void insuranceDetails() {
        System.out.println("vechile Insurance");

    }

    public void printDetails() {
    }

    public void showMileage() {
    }
}

