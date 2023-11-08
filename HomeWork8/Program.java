
import Models.TableModel;
import Presenters.BookingPresenter;
import Presenters.Model;
import Views.BookingView;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Model model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter presenter = new BookingPresenter(model, view);
        presenter.updateTables();

        view.reservationTable(new Date(), 3, "Stanislav");
        view.changeReservationTable(1001, new Date(), 2, "Stanislav");
    }
}
