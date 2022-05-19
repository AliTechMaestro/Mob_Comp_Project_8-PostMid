package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        button = findViewById(R.id.btn);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void gitProfile(View v){
        Uri git_Profile = Uri.parse("https://github.com/BSEF19A525");

        Intent intent = new Intent(Intent.ACTION_VIEW, git_Profile);

        startActivity(intent);
    }
}