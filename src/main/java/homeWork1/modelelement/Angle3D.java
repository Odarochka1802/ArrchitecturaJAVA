package homeWork1.modelelement;

public class Angle3D {
    private double yaw;
    private double pitch;
    private double roll;

    public Angle3D(double yaw, double pitch, double roll) {
        this.yaw = yaw;
        this.pitch = pitch;
        this.roll = roll;
    }

    public double getYaw() {
        return yaw;
    }

    public double getPitch() {
        return pitch;
    }

    public double getRoll() {
        return roll;
    }

    public void setYaw(double yaw) {
        this.yaw = yaw;
    }

    public void setPitch(double pitch) {
        this.pitch = pitch;
    }

    public void setRoll(double roll) {
        this.roll = roll;
    }
}

