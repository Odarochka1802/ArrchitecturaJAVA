package Seminar3;

import java.awt.*;

public class Sedan extends Car {
    public Sedan(String make, String model, Color color) {
        super(make, model, color);
        this.type = CarType.Sedan;
    }

    @Override
    public void movement() {
        // Implement the specific movement behavior for a sedan
    }

    @Override
    public void maintenance() {
        // Implement the specific maintenance behavior for a sedan
    }

    @Override
    public boolean gearShifting() {
        // Implement the specific gear shifting behavior for a sedan
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        // Implement the specific headlight switching behavior for a sedan
        return false;
    }

    @Override
    public boolean switchWipers() {
        // Implement the specific wiper switching behavior for a sedan
        return false;
    }


}
