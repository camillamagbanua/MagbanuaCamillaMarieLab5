package com.magbanua.camilla;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Log.d("4ITG", "onCreate() has been executed");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("4ITG", "onStart() has been executed");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("4ITG", "onResume() has been executed");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("4ITG", "onPause() has been executed");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("4ITG", "onStop() has been executed");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("4ITG", "onDestroy() has been executed");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("4ITG", "onRestart() has been executed");
    }
    public void process(View v){
        Intent i=null, chooser=null;
        if(v.getId()==R.id.btnScreen2){
            i = new Intent(this, MainActivity.class);
            startActivity(i);
            Log.d("4ITG", "Activity1() has been displayed");
        }
        else if(v.getId()==R.id.btnMap2){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5810, 120.9884"));
            chooser = Intent.createChooser(i, "Choose Application for Map:");
            startActivity(chooser);
            Log.d("4ITG", "Map2() has been loaded");
        }
    }

}
