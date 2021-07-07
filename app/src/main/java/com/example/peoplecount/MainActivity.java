package com.example.peoplecount;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int countMan;
    int countGirl;
    int countPeoples;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countGirl = 0;
        countMan = 0;
        countPeoples = 0;

        Button btMan = (Button) findViewById(R.id.btMan);
        Button btGirl = (Button) findViewById(R.id.btGirl);
        Button btReset = (Button) findViewById(R.id.btReset);
        TextView txtView = (TextView) findViewById(R.id.txtView);

        btGirl.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                countPeoples++;
                countGirl++;
                btGirl.setText(Integer.toString(countGirl));
                txtView.setText(Integer.toString(countPeoples));
                txtView.setText("Total of Peoples: "+Integer.toString(countPeoples));

            }
        });
        btMan.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                countPeoples++;
                countMan++;
                btMan.setText(Integer.toString(countMan));
                txtView.setText("Total of Peoples: "+Integer.toString(countPeoples));
            }
        });

        btReset.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v){
                countMan = 0;
                countPeoples = 0;
                countGirl = 0;
                txtView.setText("Total of Peoples: "+Integer.toString(countPeoples));
                btGirl.setText(Integer.toString(countGirl));
                btMan.setText(Integer.toString(countMan));
            }
        });

    }
}