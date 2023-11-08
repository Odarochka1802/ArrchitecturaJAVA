import application.ConcreteNoteEditor;
import application.interfaces.NoteEditor;
import application.interfaces.NotesDatabaseContext;
import database.NotesDatabase;
import infrastructure.persistance.Database;
import infrastructure.persistance.DatabaseContext;
import presentation.queries.controllers.NotesController;
import presentation.queries.views.NotesConsolePresenter;

public class Program {

    /**
     * CQRS
     * @param args
     */
    public static void main(String[] args) {
        Database database = new NotesDatabase();
        NotesDatabaseContext context = new DatabaseContext(database);
        NotesConsolePresenter notesConsolePresenter = new NotesConsolePresenter();
        NoteEditor noteEditor = new ConcreteNoteEditor(notesConsolePresenter, context);

        NotesController notesController = new NotesController(noteEditor);

        notesController.routeGetAll();

        // Добавление записи
        notesController.routeAdd("Это новая запись");

        // Удаление записи (предположим, что у нас есть идентификатор записи с именем noteId)
        int noteId = 0;
        notesController.routeDelete(noteId);
    }


}
