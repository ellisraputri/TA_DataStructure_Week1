public class Car {
    String name;
    int year;
    double maxSpeed;

    public Car(String name, int year, double maxSpeed){
        this.name = name;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public String getName(){
        return this.name;
    }
    public int getYear(){
        return this.year;
    }
    public double getMaxSpeed(){
        return this.maxSpeed;
    }

    public void welcomeMessage(){
        System.out.printf("Welcome User. \nCar name: %s. \nYear of make: %d \nMax speed: %.2f\n", this.name, this.year, this.maxSpeed);
    }
    public void calculateYear(){
        System.out.println("Your car is " + (2024 - this.year) + " years old.");
    }

}
