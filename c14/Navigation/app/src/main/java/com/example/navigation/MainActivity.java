package com.example.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.NumberPicker;

import com.example.navigation.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    NumberPicker picker1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        picker1 = findViewById(R.id.nb1);
        picker1.setMaxValue(9);
        picker1.setMinValue(0);
        int nb =  binding.nb1.getValue();





        binding.btnArticle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // Article
                Intent i = new Intent(MainActivity.this , Article.class );
                i.putExtra("id", binding.nb1.getValue() );
                startActivity(i);


            }
        });
        binding.btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this , Contact.class );

                startActivity(i);


            }
        });
        String Message = "bonjour " + getIntent().getStringExtra("b");
        int id =  getIntent().getIntExtra("id", -1);

        binding.tv2.setText(Message);


        /*
        picker1.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int i, int i1) {
                int valuePicker1 = picker1.getValue();
                Log.d("picker value", valuePicker1 + "");
            }
        }); */
    }
}