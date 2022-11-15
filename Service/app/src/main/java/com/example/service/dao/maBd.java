package com.example.service.dao;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import com.example.service.Model.Avis;
import com.example.service.Model.Item;

@Database(entities = {Item.class, Avis.class}, version = 1, exportSchema = false)




public abstract class maBd extends RoomDatabase {
        public abstract monDao mondao();
    }

