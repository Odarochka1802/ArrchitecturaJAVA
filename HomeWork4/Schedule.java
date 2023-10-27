package task3;

import java.util.List;

public class Schedule {
    private List<Bus> buses;

    public Schedule(List<Bus> buses) {
        this.buses = buses;
    }

    public List<Bus> getBuses() {
        return buses;
    }

    public void setBuses(List<Bus> buses) {
        this.buses = buses;
    }
}