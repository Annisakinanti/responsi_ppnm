package com.example.a203110017_annisakinanti_responsi;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import java.util.List;

// kelas DAO
@Dao
public interface catimgDao {

    // untuk menambahkan data baru
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(List<Model> cats);

    // untuk query/ pengambilan data
    @Query("SELECT DISTINCT * FROM catimg")
    LiveData<List<Model>>  getcats();

    // untuk menghapus data
    @Query("DELETE FROM catimg")
    void deleteAll();
}
