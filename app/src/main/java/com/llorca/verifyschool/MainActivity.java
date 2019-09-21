package com.llorca.verifyschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText etSchool1, etSchool2, etSchool3, etSchool4, etSchool5, etSchool6, etSchool7, etSchool8;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etSchool1 = findViewById(R.id.school1);
        etSchool2 = findViewById(R.id.school2);
        etSchool3 = findViewById(R.id.school3);
        etSchool4 = findViewById(R.id.school4);
        etSchool5 = findViewById(R.id.school5);
        etSchool6 = findViewById(R.id.school6);
        etSchool7 = findViewById(R.id.school7);
        etSchool8 = findViewById(R.id.school8);
    }
    public void saveData(View v){
        sp = getSharedPreferences("data1", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        String skul1 = etSchool1.getText().toString();
        String skul2 = etSchool2.getText().toString();
        String skul3 = etSchool3.getText().toString();
        String skul4 = etSchool4.getText().toString();
        String skul5 = etSchool5.getText().toString();
        String skul6 = etSchool6.getText().toString();
        String skul7 = etSchool7.getText().toString();
        String skul8 = etSchool8.getText().toString();
        editor.putString("sschool1", skul1);
        editor.putString("sschool2", skul2);
        editor.putString("sschool3", skul3);
        editor.putString("sschool4", skul4);
        editor.putString("sschool5", skul5);
        editor.putString("sschool6", skul6);
        editor.putString("sschool7", skul7);
        editor.putString("sschool8", skul8);
        editor.commit();
    }

    public void next(View v){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
