package com.example.service.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Avis {
    @PrimaryKey(autoGenerate = true)
    int id ;
    int idItem ;
    int note; //1a5
    String nomPersonne;
    String Contenus;

}
