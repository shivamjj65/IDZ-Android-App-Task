package com.example.idz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declaring objects of type EditText, Button
    private EditText first_name, last_name, email, birth_date, phone;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();   // hiding Action bar in app

        setContentView(R.layout.activity_main);

        // Getting EditTextViews & Button using their Id's
        first_name = findViewById(R.id.FName);
        last_name = findViewById(R.id.LName);
        email = findViewById(R.id.Mail);
        birth_date = findViewById(R.id.DOB);
        phone = findViewById(R.id.PhNo);
        submit = (Button) findViewById(R.id.SubmitBtn);

        // Actions to be performerd when submit button clicked
        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String fname = first_name.getText().toString();
                String lname = last_name.getText().toString();
                String mail = email.getText().toString();
                String dob = birth_date.getText().toString();
                String phno = phone.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                intent.putExtra("keyfname",fname);
                intent.putExtra("keylname",lname);
                intent.putExtra("keymail",mail);
                intent.putExtra("keydob",dob);
                intent.putExtra("keyphno",phno);

                startActivity(intent);

            }
        });
    }
}