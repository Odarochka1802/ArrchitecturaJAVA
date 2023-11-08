package Models;

import Presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {

    private Collection<Table> tables;

    @Override
    public Collection<Table> loadTables() {
        if (tables == null){
            tables = new ArrayList<>();
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    @Override
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table : tables){
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(tableNo, reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика");
    }

    @Override
    public Collection<Table> getTables() {
        return null;
    }

    @Override
    public int reserveTable(Date reservationDate, int tableNo, String name) {
        return 0;
    }

    @Override
    public boolean changeReservation(int oldReservation, Date reservationDate, int tableNo, String name) {
        return false;
    }

    public int changeReservationTable(){
        return -1;
    }
}
