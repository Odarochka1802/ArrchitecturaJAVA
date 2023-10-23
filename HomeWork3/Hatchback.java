package Seminar3;


import java.awt.*;

public class Hatchback extends Car {
    public Hatchback(String make, String model, Color color) {
        super(make, model, color);
        this.type = CarType.Hatchback;
    }

    @Override
    public void movement() {
        // Implement the specific movement behavior for a pickup truck
    }

    @Override
    public void maintenance() {
        // Implement the specific maintenance behavior for a pickup truck
    }

    @Override
    public boolean gearShifting() {
        // Implement the specific gear shifting behavior for a pickup truck
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        // Implement the specific headlight switching behavior for a pickup truck
        return false;
    }

    @Override
    public boolean switchWipers() {
        // Implement the specific wiper switching behavior for a pickup truck
        return false;
    }


}