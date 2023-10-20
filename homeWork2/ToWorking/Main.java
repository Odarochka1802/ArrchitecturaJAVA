package homeWork2.doWork;

public class Main {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new EliteCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
