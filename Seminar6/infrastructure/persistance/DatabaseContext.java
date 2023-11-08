package infrastructure.persistance;

import application.interfaces.NotesDatabaseContext;
import database.NotesDatabase;
import database.NotesRecord;
import domain.Note;
import infrastructure.persistance.Database;
import infrastructure.persistance.DbContext;
import infrastructure.persistance.ModelBuilder;
import infrastructure.persistance.entityconfiguration.NoteConfiguration;

import java.util.ArrayList;
import java.util.Collection;

public class DatabaseContext extends DbContext implements NotesDatabaseContext {

    public Collection<Note> getAll(){
        Collection<Note> notes = new ArrayList<>();
        for (NotesRecord record : ((NotesDatabase)database).getNotesTable().getRecords()){
            notes.add(new Note(
                    record.getId(),
                    record.getTitle(),
                    record.getDetails()
            ));
        }
        return notes;
    }

    @Override
    public void addNoteToDatabase(String noteContent) {

    }

    @Override
    public void deleteNoteFromDatabase(int noteId) {

    }


    public DatabaseContext(Database database) {
        super(database);
    }

    @Override
    protected void onModelCreating(ModelBuilder builder) {
        builder.applyConfiguration(new NoteConfiguration());
    }
}
