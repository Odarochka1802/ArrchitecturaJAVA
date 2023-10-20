package homeWork2.example;

import homeWork2.example.Component;
import homeWork2.example.ConcreteComponent;
import homeWork2.example.ConcreteDecorator;

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