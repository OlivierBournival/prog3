package com.example.database;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;

import com.google.type.DateTime;

import dao.maBd;
import model.Personne;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Data");

        maBd bd=  Room.databaseBuilder(getApplicationContext(), maBd.class, "database-name")
                .allowMainThreadQueries()
                .build();

        Personne p = new Personne();
        p.dateDeNaissance = DateTime.newBuilder().build();
        p.nom = "steve";

        System.out.println( p);


    }
}