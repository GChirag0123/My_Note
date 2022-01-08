package com.my_note.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.my_note.app.MainActivity;
import com.my_note.app.R;

public class Splesh_Screen extends AppCompatActivity {

    //private Object packageContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splesh_screen);


       // long delaymillies = 0;
        new Handler().postDelayed(new Runnable(){

            public void run() {
                startActivity(new Intent(Splesh_Screen.this, MainActivity.class));
                finish();
            }
        },2000);
    }
}