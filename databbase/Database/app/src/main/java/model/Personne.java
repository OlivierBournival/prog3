package model;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class Personne {
    @PrimaryKey(autoGenerate = true)
    public int id;
    @ColumnInfo
    public String nom;
    @ColumnInfo
    public Date dateDeNaissance;

    public enum JourPlus { M, F, Other }



}
