package com.example.database;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

import java.util.Date;
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
        p.dateDeNaissance = new Date();
        p.nom = "steve";
        bd.mondao().createpersonne(p);

        for (Personne d : bd.mondao().touteLesPersonne()) {
            Log.i("Personne",">>"+ d.nom +" "+d.dateDeNaissance );

        }



    }
}