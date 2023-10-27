package task3;

import java.util.Date;
import java.util.List;

public interface ScheduleProvider {
    void updateSchedule(Schedule schedule);

    List<Bus> getBusSchedule(Date date);
}