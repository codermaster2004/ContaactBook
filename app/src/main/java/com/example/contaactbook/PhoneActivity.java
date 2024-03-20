package com.example.contaactbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PhoneActivity extends AppCompatActivity {

    FloatingActionButton btnphone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

        btnphone = findViewById(R.id.btnphone);

        btnphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(PhoneActivity.this,DetailsActivity.class);
                startActivity(intent);

            }
        });
    }
}