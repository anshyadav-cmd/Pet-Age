package com.example.petage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private TextView textView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
    }
    public void calculateButtonClicked(View buttonView) {
        EditText editPetAge = findViewById(R.id.editPetAge);
        int age = Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(editPetAge.getText().toString());
        textView.setText(age+"");
    }
}