package com.example.navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.navigation.databinding.ActivityMainBinding;
import com.example.navigation.databinding.ContactBinding;

public class Contact  extends AppCompatActivity {
    private ContactBinding binding;


    //ctrl+o
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ContactBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setTitle("contact");
        setContentView(view);
        binding.editText1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                binding.textView.setText(binding.editText1.getText());
            }
        });
        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // Article
                Intent i = new Intent(Contact.this , MainActivity.class );

                i.putExtra("b", binding.textView.getText().toString() );


                startActivity(i);


            }

        });
}
}




