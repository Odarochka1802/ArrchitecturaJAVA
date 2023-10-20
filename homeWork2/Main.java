package homeWork2;
public class Main {
    public static void main(String[] args) {
        // Создаем объект ConcreteComponent
        Component component = new ConcreteComponent();

        // Оборачиваем объект в декораторы
        component = new ConcreteDecorator(component);

        // Вызываем операцию
        component.operation();
    }
}