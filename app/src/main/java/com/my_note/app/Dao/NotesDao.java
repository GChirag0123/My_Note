package com.my_note.app.Dao;


import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.my_note.app.Model.Notes;

import java.util.List;

@androidx.room.Dao


public interface NotesDao {

    @Query("SELECT * FROM NotesDatabase")
    LiveData<List<Notes>> getallNotes();

    // List<Notes> getallNotes();

    @Insert
    void insertNotes(Notes... Notes);

    @Query("DELETE FROM NotesDatabase WHERE id=:id")
    void deleteNotes(int id);

    @Update
    void updateNotes(Notes notes);

}
