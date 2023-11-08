package presentation.queries.controllers;

import application.interfaces.NoteEditor;

public class NotesController {
    private NoteEditor noteEditor;

    public NotesController(NoteEditor noteEditor) {
        this.noteEditor = noteEditor;
    }

    public void routeGetAll() {
        // Implement the logic for getting all notes
    }

    public void routeAdd(String noteContent) {
        noteEditor.addNote(noteContent);
    }

    public void routeDelete(int noteId) {
        noteEditor.deleteNote(noteId);
    }
}

