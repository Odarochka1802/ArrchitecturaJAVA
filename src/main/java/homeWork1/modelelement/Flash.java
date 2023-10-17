package homeWork1.modelelement;

import java.awt.*;

public class Flash {
    //TODO: Доработать в рамках домашней работы
    private Point3D location;
    private Angle3D angle;
    private Color color;
    private float power;

    public Flash(Point3D location, Angle3D angle, Color color, float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public void rotate(Angle3D angle) {
        // код для поворота объекта вокруг своей оси
    }

    public void move(Point3D point) {
        // код для перемещения объекта в указанную точку
    }
}
