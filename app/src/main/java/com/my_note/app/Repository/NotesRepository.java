package com.my_note.app.Repository;

import android.app.Application;
import android.provider.ContactsContract;

import androidx.lifecycle.LiveData;

import com.my_note.app.Dao.NotesDao;
import com.my_note.app.Database.NotesDatabase;
import com.my_note.app.Model.Notes;

import java.util.List;

public class NotesRepository {

    public NotesDao notesDao;
    public LiveData<List<Notes>> getallNotes;

    public NotesRepository(Application application)
    {
        NotesDatabase database = NotesDatabase.getDatabaseInstance(application);
        notesDao = database.notesDao();
        getallNotes = notesDao.getallNotes();

    }
   public void  insertNotes(Notes notes)
    {
         notesDao.insertNotes(notes);
    }
    public void deleteNotes(int id){
        notesDao.deleteNotes(id);
    }
    public void updateNotes(Notes notes){
        notesDao.updateNotes(notes);

    }
}
