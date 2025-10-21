class Car {
    private String brand;
    private int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Manufacturing Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla", 2024);
        Car car2 = new Car("BMW", 2020);

        // Calling methods
        car1.displayInfo();
        car2.displayInfo();
    }
}