package Presenters;

import Models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();

    int reservationTable(Date reservationDate, int tableNo, String name);

    Collection<Table> getTables();

    int reserveTable(Date reservationDate, int tableNo, String name);

    boolean changeReservation(int oldReservation, Date reservationDate, int tableNo, String name);
}
