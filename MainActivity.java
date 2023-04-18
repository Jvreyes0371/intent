package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myapplication.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Main Activity");

        EditText firstName = findViewById(R.id.editTextTextPersonName2);
        EditText lastName = findViewById(R.id.editTextTextPersonName3);
        EditText emailAddress = findViewById(R.id.editTextTextEmailAddress);
        EditText mobileNumber = findViewById(R.id.editTextPhone);
        EditText password = findViewById(R.id.editTextTextPassword);
        Button signIn = findViewById(R.id.button);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textPersonName2 = firstName.getText().toString();

                Intent intent = new Intent(MainActivity.this, submain.class);
                intent.putExtra(EXTRA_MESSAGE, textPersonName2);
                startActivity(intent);
            }
        });
    }
}