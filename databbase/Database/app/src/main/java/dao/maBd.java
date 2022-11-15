package dao;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import model.Personne;
@Database(entities = {Personne.class}, version = 1, exportSchema = false)
@TypeConverters({Converters.class})


public abstract class maBd extends RoomDatabase {
        public abstract monDao mondao();
    }

