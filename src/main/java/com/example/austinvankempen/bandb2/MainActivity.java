package com.example.austinvankempen.bandb2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View.OnClickListener;



public class MainActivity extends AppCompatActivity {

    Button settings;
    Button play;



    //Button for settings screen
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_main);

        // Locate the button in activity_main.xml
        settings = (Button) findViewById(R.id.buttonSet);


        // Capture button clicks
        settings.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        Settings.class);
                startActivity(myIntent);






            }
        });

        play = (Button) findViewById(R.id.buttonPlay);

        // Capture button clicks
        play.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        LoginScreen.class);
                startActivity(myIntent);

            }
        });









    }
}
