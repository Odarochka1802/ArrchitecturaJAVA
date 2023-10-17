package homeWork1.modelelement;

public class Camera {
    //TODO: Доработать в рамках домашней работы
    private Point3D location;
    private Angle3D angle;

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public void rotate(Angle3D rotation) {
        // код для поворота камеры на заданный угол
        this.angle = rotation;
    }

    public void move(Point3D movement) {
        // код для перемещения камеры в заданную точку
        this.location = movement;
    }
}
