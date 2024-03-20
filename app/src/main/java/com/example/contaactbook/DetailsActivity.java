package com.example.contaactbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DetailsActivity extends AppCompatActivity {

    EditText etname;
    EditText etcontact;
    Button btnsave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        etname = findViewById(R.id.etname);
        etcontact = findViewById(R.id.etcontact);
        btnsave = findViewById(R.id.btnsave);

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = etname.getText().toString();
                String contact = etcontact.getText().toString();

                Datahelper datahelper = new Datahelper(DetailsActivity.this,"mycontacts",null,1);
                datahelper.Insertcontaacts(name,contact);
            }
        });

    }
}