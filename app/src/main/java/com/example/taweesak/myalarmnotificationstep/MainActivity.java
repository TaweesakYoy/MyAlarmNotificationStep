package com.example.taweesak.myalarmnotificationstep;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.taweesak.myalarmnotificationstep.Fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    private String tag = "3NovV1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add Fragment to Activty
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentMainFragment,new MainFragment()).commit();
        }





    } // Main Method

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag,"onPause Work");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag,"onStart Work");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag,"onDestroy Work");
    }
} // Main Class
