public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2020, 120.5);
        System.out.println("The car's name is " + car1.getName());
        System.out.println("The car's year of make is "+ car1.getYear());
        System.out.println("The car's max speed is "+ car1.getMaxSpeed());
        car1.welcomeMessage();
        car1.calculateYear();
    }
}