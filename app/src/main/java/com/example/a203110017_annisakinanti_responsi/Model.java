package com.example.a203110017_annisakinanti_responsi;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

// kelas entitas
@Entity(tableName = "catimg",indices = @Index(value = {"id"},unique = true))
public class Model {

    // menginisialisasi variabel primary key
    @PrimaryKey@NonNull

    // untuk id
    @SerializedName("id")

    // deklrarasi nama kolom
    @ColumnInfo(name = "id")
    String id;

    @SerializedName("url")
    @ColumnInfo(name = "image")
    String url;

    // mengembalikan ID
    public String getId() {
        return id;
    }

    // set ID
    public void setId(String id) {
        this.id = id;
    }

    // mengembalikan URL
    public String getUrl() {
        return url;
    }

    // set URL
    public void setUrl(String url) {
        this.url = url;
    }
}
