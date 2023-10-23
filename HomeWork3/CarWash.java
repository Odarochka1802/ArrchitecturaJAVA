package Seminar3;

public class CarWash implements Wiping {

    @Override
    public void wipMirrors() {
        System.out.println("Помыты зеркала");
    }

    @Override
    public void wipWindshield() {
        System.out.println("Помыто ветровое стекло");
    }

    @Override
    public void wipHeadlights() {
        // Implement the specific wiping behavior for headlights
        System.out.println("Очистка фар");
    }
}