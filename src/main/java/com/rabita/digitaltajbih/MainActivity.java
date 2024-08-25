package com.rabita.digitaltajbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button Button1, Button2,Button3;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super .onCreate(savedInstanceState);
        setContentView((R.layout.activity_main));
       tvDisplay=findViewById(R.id.tvDisply) ;
       Button1 =findViewById(R.id.Button1);
       Button2 =findViewById(R.id.Button2);
       Button3 =findViewById(R.id.Button3);



       Button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               count ++;
               tvDisplay.setText(""+count);
           }
       });

       Button2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               count --;
               tvDisplay.setText(""+count);
           }
       });
       Button3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               count=0;
               tvDisplay.setText(""+count);
           }
       });


    }
}