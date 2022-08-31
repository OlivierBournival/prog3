package com.example.navigation;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.navigation.databinding.ContactBinding;

public class Article extends AppCompatActivity {
        //ctrl+o
        private ContactBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ContactBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        int id =  getIntent().getIntExtra("id", -1);
        setTitle("Article"+ id);



    }
}

