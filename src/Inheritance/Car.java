package Inheritance;

public class Car extends Machine {

    public void drive() {
        System.out.println("Crazy to drive!");
    }

    @Override
    public void start() {
        System.out.println("Car started thanks to methods overriding");
    }

    public void displayName() {
        System.out.println(new StringBuilder().append("Car's name is ").append(name).toString());
    }


}
