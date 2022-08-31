package com.example.list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    bingoadapteur adapteur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.intRecycler();
        this.remplirRecycler();


    }

    private void remplirRecycler() {
        for (int i = 0; i < 10; i++) {
            bingo b = new bingo();
            b.numtirer = 1;
            b.id = i;adapteur.list.add(b);
        }
        adapteur.notifyDataSetChanged();


    }

        public void intRecycler(){

            RecyclerView recyclerView = findViewById(R.id.recyclerview);
            recyclerView.setHasFixedSize((true));
            //use a linear layout manager
            LinearLayoutManager layoutManager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager((layoutManager));

            // specifie an adapteur
            adapteur = new bingoadapteur();
            recyclerView.setAdapter(adapteur);


        }
    }
