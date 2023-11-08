package Views;

import Models.Table;
import Presenters.View;
import Presenters.ViewObserver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class BookingView implements View {
    private Collection<ViewObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(ViewObserver observer) {
        observers.add(observer);
    }

    @Override
    public void showTables(Collection<Table> tables) {
        for (Table table : tables){
            System.out.println(table);
        }
    }

    @Override
    public void showReservationTableResult(int reservationNo) {
        if (reservationNo > 0)
            System.out.printf("Table successfully reserved. Reservation number #%d\n", reservationNo);
        else
            System.out.println("Unable to reserve table.\nPlease try again later.");
    }

    public void reservationTable(Date reservationDate, int tableNo, String name){
        for (ViewObserver observer : observers)
            observer.onReservationTable(reservationDate, tableNo, name);
    }

    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        for (ViewObserver observer : observers)
            observer.onChangeReservationTable(oldReservation, reservationDate, tableNo, name);
    }
}
