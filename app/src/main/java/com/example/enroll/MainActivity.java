package com.example.enroll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String MSG = "com.example.enroll.Enroll";

    public void Enroll(View view){
        Toast.makeText(this, "Enrolled Successfully",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity2.class);
        EditText edittextpersonname = findViewById(R.id.editTextTextPersonName);
        EditText edittextpersonname2 = findViewById(R.id.editTextTextPersonName2);
        String message = edittextpersonname2.getText().toString() + " enrolled successfully."
                + " Welcome "
                + edittextpersonname.getText().toString();
        intent.putExtra(MSG, message);
        startActivity(intent);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
