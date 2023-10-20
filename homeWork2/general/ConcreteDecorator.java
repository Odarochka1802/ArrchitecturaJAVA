package homeWork2.example;

public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    // Additional operation
    public void additionalOperation() {
        System.out.println("Performing additional operation in ConcreteDecorator");
    }

    public void operation() {
        super.operation();
        additionalOperation();
    }
}