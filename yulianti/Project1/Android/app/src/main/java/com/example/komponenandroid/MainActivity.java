package com.example.komponenandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnintent = (Button) findViewById(R.id.intent);
        Button btnact = (Button) findViewById(R.id.activity);
        Button btnser = (Button) findViewById(R.id.service);
        Button btnbrod = (Button) findViewById(R.id.broadcast_receiver);
        Button btncontent = (Button) findViewById(R.id.content_provider);

        btnExit = (Button) findViewById(R.id.exit);

        btnintent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this,intent.class);
                startActivity(i);
            }

        });

        btnact.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this,activity.class);
                startActivity(i);
            }

        });

        btnser.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this,service.class);
                startActivity(i);
            }

        });

        btnbrod.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this,broadcast_receiver.class);
                startActivity(i);
            }

        });

        btncontent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this,content_provider.class);
                startActivity(i);
            }

        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
        }



}
