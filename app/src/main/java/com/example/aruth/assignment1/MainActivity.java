package com.example.aruth.assignment1;

import android.content.Intent;
import android.icu.util.TimeZone;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void goToLogin(View view) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
    // This method is called when the world clock button is clicked, to take the user to the timezone page
    public void goToTimezones(View view) {
        Intent intent = new Intent(this, Timezones.class);
        startActivity(intent);
    }
    // This method is called when the settings button is clicked, to take the user to the settings page
    public void goToSettings(View view) {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
}


