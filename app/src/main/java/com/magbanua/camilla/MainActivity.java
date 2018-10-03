package com.magbanua.camilla;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        if(v.getId()==R.id.btnScreen1){
            i = new Intent(this, Activity2.class);
            startActivity(i);
            Log.d("4ITG", "Activity2() has been displayed");
        }
        else if(v.getId()==R.id.btnMap1){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5909, 120.9750"));
            chooser = Intent.createChooser(i, "Choose Application for Map:");
            startActivity(chooser);
            Log.d("4ITG", "Map1() has been loaded");
        }
    }
}
