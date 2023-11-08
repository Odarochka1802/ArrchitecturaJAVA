package Presenters;

import Models.Table;
import Views.BookingView;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {
    private Model model;
    private BookingView view;

    public BookingPresenter(Model model, BookingView view) {
        this.model = model;
        this.view = view;
        this.view.registerObserver(this);
    }

    public void updateTables() {
        Collection<Table> tables = model.getTables();
        if (tables != null) {
            view.showTables(tables);
        } else {
            System.out.println("Error: Table collection is null");
        }
    }


    @Override
    public void onReservationTable(Date reservationDate, int tableNo, String name) {
        int reservationNo = model.reserveTable(reservationDate, tableNo, name);
        view.showReservationTableResult(reservationNo);
    }

    @Override
    public void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        boolean success = model.changeReservation(oldReservation, reservationDate, tableNo, name);
        if (success) {
            view.showReservationTableResult(oldReservation);
            updateTables();
        } else {
            System.out.println("Ошибка при изменении резервации.");
        }
    }
}
