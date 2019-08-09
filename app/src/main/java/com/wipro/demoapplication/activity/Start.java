package com.wipro.demoapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.wipro.demoapplication.R;


public class Start extends AppCompatActivity{
    Button btnView;
    String type;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.start_screen);
        btnView=(Button) findViewById(R.id.btnView);
        Bundle b =getIntent().getExtras();
        if(b!=null){
            type= b.getString("type");
        }
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type.equalsIgnoreCase("2")){
                   // startActivity(new Intent(Start.this, VerifyMap.class));
                }else {
                   // startActivity(new Intent(Start.this, VerifyMap.class));
                }
            }
        });
    }
}

