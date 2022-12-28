package com.example.a203110017_annisakinanti_responsi;

import android.app.Application;
import android.os.AsyncTask;
import androidx.lifecycle.LiveData;
import java.util.List;

// kelad Repository
public class Repository {

    // inisialisasi untuk mendapatkan gambar
    public catimgDao catimgDao;

    // untuk mendapatkan list semua data
    public LiveData<List<Model>> getAllCats;

    // mendapatkan database
    private CatDatabase database;

    // mengembalikan variabel ke Repository
    public Repository(Application application){
        database=CatDatabase.getInstance(application);
        catimgDao=database.catimgDao();
        getAllCats=catimgDao.getcats();

    }

    // memasukkan data ke Repository untuk proses sinkronisasi
    public void insert(List<Model> cats){
        new InsertAsyncTask(catimgDao).execute(cats);

    }

    // mengembalikan list data
    public LiveData<List<Model>> getAllCats(){
        return getAllCats;
    }

    // proses insert data untuk sinkronisasi
    private static class InsertAsyncTask extends AsyncTask<List<Model>,Void,Void>{
        private catimgDao catimgDao;

        public InsertAsyncTask(catimgDao catDao)
        {
            this.catimgDao=catDao;
        }
        @Override
        protected Void doInBackground(List<Model>... lists) {
            catimgDao.insert(lists[0]);
            return null;
        }
    }

}