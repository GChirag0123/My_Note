package com.my_note.app.ViewModel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.my_note.app.Model.Notes;
import com.my_note.app.Repository.NotesRepository;

import java.util.List;

public class NotesViewModel extends AndroidViewModel {

    public NotesRepository repository;
    public LiveData<List<Notes>> getAllNotes;

    public NotesViewModel(Application application){
        super((application));

        repository = new NotesRepository(application);
        getAllNotes = repository.getallNotes;

    }
    public void insertNote(Notes notes)
    {
        repository.insertNotes(notes);
    }
    public void deleteNotes(int id)
    {
        repository.deleteNotes(id);
    }
    public void updateNotes(Notes notes)
    {
        repository.updateNotes(notes);
    }
}
