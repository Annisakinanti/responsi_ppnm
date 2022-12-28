package com.example.a203110017_annisakinanti_responsi;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import java.util.List;


// kelas ViewModel
public class CatViewModel extends AndroidViewModel {

    // menginisialisasi kelas repository
    private Repository repository;

    // untuk mendapatkan list data
    public LiveData<List<Model>> getAllCats;

    // untuk mengembalikan ViewModel ke repository
    public CatViewModel(@NonNull Application application) {
        super(application);
        repository=new Repository(application);
        getAllCats=repository.getAllCats();
    }

    // untuk mengembalikan ViewModel
    public LiveData<List<Model>> getAllCats()
    {
        return getAllCats;
    }
}
