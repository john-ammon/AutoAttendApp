package com.example.autoattendapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StudentAddClassActivity extends AppCompatActivity {

    EditText classCode;
    Button addButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_add_class);
        setTitle("Add Class");

        addButton = findViewById(R.id.studentAddClassButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                classCode = findViewById(R.id.classCodeText);
                String code = classCode.getText().toString();

                if(code.equals("")) {
                    Toast.makeText(StudentAddClassActivity.this, "Please enter class code", Toast.LENGTH_SHORT).show();
                } else {
                    DBManager dbManager = DBManager.getInstance();
                    dbManager.checkClassCode(code, StudentAddClassActivity.this.getApplicationContext());


                    final Intent intent = new Intent(StudentAddClassActivity.this, CourseListActivity.class);
                    intent.putExtra("userType", "Student");


                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            startActivity(intent);
                        }
                    }, 1000);

                }
            }
        });
    }
}
