package com.example.idz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private TextView user_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();   // hiding Action bar in app
        setContentView(R.layout.activity_main2);

        user_data = findViewById(R.id.usrdata);

        String first_name = getIntent().getStringExtra("keyfname");
        String last_name = getIntent().getStringExtra("keylname");
        String mail = getIntent().getStringExtra("keymail");
        String dob = getIntent().getStringExtra("keydob");
        String ph_no = getIntent().getStringExtra("keyphno");

        // Saving all data into array and printing on screen
        String[] Data = new String[]{first_name,last_name,mail,dob,ph_no};
        user_data.setText(Data[0]+"\n"+Data[1]+"\n"+Data[2]+"\n"+Data[3]+"\n"+Data[4]);
    }
}