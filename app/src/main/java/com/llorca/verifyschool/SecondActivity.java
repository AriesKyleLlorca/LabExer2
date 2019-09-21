package com.llorca.verifyschool;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity{

    SharedPreferences sp;
    EditText etVerifySchool;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        etVerifySchool = findViewById(R.id.et_VerifySchool);
    }
    public void verify(View v){
        sp = getSharedPreferences("data1", MODE_PRIVATE);
        String school1 = sp.getString("sschool1", null);
        String school2 = sp.getString("sschool2", null);
        String school3 = sp.getString("sschool3", null);
        String school4 = sp.getString("sschool4", null);
        String school5 = sp.getString("sschool5", null);
        String school6 = sp.getString("sschool6", null);
        String school7 = sp.getString("sschool7", null);
        String school8 = sp.getString("sschool8", null);
        String verifySchool = etVerifySchool.getText().toString();
        if(school1.equals(verifySchool)){
            Toast.makeText(this, "School is competing in UAAP...", Toast.LENGTH_LONG).show();
        }
        else if(school2.equals(verifySchool)){
            Toast.makeText(this, "School is competing in UAAP...", Toast.LENGTH_LONG).show();
        }
        else if(school3.equals(verifySchool)){
            Toast.makeText(this, "School is competing in UAAP...", Toast.LENGTH_LONG).show();
        }
        else if(school4.equals(verifySchool)){
            Toast.makeText(this, "School is competing in UAAP...", Toast.LENGTH_LONG).show();
        }
        else if(school5.equals(verifySchool)){
            Toast.makeText(this, "School is competing in UAAP...", Toast.LENGTH_LONG).show();
        }
        else if(school6.equals(verifySchool)){
            Toast.makeText(this, "School is competing in UAAP...", Toast.LENGTH_LONG).show();
        }
        else if(school7.equals(verifySchool)){
            Toast.makeText(this, "School is competing in UAAP...", Toast.LENGTH_LONG).show();
        }
        else if(school8.equals(verifySchool)){
            Toast.makeText(this, "School is competing in UAAP...", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "School is not competing in UAAP...", Toast.LENGTH_LONG).show();
        }
    }

}
