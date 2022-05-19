package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn1:
                Uri git_Profile = Uri.parse("https://github.com/BSEF19A525");

                Intent intent = new Intent(Intent.ACTION_VIEW, git_Profile);

                startActivity(intent);
            break;
            case R.id.btn2:
                Uri git_repo = Uri.parse("https://github.com/BSEF19A525/Mob_Comp_Project_8-PostMid");

                Intent intent2 = new Intent(Intent.ACTION_VIEW, git_repo);

                startActivity(intent2);
                break;
        }
    }

}