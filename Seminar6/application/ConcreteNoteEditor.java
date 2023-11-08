package application;

import application.interfaces.NoteEditor;
import application.interfaces.NotesDatabaseContext;
import application.interfaces.NotesPresenter;
import domain.Note;
import presentation.queries.views.NotesConsolePresenter;

import java.util.Collection;
import java.util.Optional;

public class ConcreteNoteEditor implements NoteEditor {

    private NotesConsolePresenter presenter;
    private NotesDatabaseContext context;

    public ConcreteNoteEditor(NotesConsolePresenter presenter, NotesDatabaseContext context) {
        this.presenter = presenter;
        this.context = context;
    }

    @Override
    public void printAll() {

    }

    @Override
    public void addNote(String noteContent) {
        // Implement the logic to add a note to the database using the context
        // For example:
        context.addNoteToDatabase(noteContent);
        presenter.displayNoteAddedSuccessfully();
    }

    @Override
    public void deleteNote(int noteId) {
        // Implement the logic to delete a note from the database using the context
        // For example:
        context.deleteNoteFromDatabase(noteId);
        presenter.displayNoteDeletedSuccessfully();
    }

    @Override
    public boolean add(Note item) {
        return false;
    }

    @Override
    public boolean edit(Note item) {
        return false;
    }

    @Override
    public boolean remove(Note item) {
        return false;
    }

    @Override
    public Optional<Note> getById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public Collection<Note> getAll() {
        return null;
    }
}

