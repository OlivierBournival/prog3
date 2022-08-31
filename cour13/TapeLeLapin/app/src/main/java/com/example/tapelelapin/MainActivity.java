package com.example.tapelelapin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tapelelapin.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    int flop = 0;
    int pafs = 0;
    int positionDuLapin = 0;
    List<Button> boutons = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        boutons.add(binding.b0);
        boutons.add(binding.b1);
        boutons.add(binding.b2);
        boutons.add(binding.b3);
        boutons.add(binding.b4);
        boutons.add(binding.b5);

        bougeLapin();
        for (Button b : boutons){
            b.setOnClickListener(view -> { reactClick(view);});
        }


        // 40 02
    }
    private void reactClick(View view) {
        Button bdulapin = boutons.get(positionDuLapin);
        if (view == bdulapin){
            pafs++;
            binding.Pafs.setText("Pafs "+ pafs);
            bougeLapin();
        }else {
            flop++;
            binding.Flop.setText("Flops " + flop);
        }

    }
    private void bougeLapin() {
        for (Button b : boutons) {
            b.setText("Taupe");
        }
        Random random = new Random();
        positionDuLapin = random.nextInt(6);
        Button b = boutons.get(positionDuLapin);
        b.setText("Lapin");


    }
}