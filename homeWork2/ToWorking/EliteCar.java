package homeWork2.doWork;

public class EliteCar extends CarDecorator {

    public EliteCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }
}