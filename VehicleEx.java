class Vehicle {
    public void display() {
        System.out.println("Vehicle's display method");
    }

    public void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    public void start(String key) {
        System.out.println("Car started with " + key);
    }
}

public class VehicleEx {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.display();  
        vehicle.start(); 

        Car car = new Car();
        car.display();
        car.start();        
        car.start("Key");
    }
}
