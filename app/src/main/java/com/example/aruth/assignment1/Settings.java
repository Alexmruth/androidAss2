package com.example.aruth.assignment1;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;



public class Settings extends AppCompatActivity {

    Switch bgSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        bgSwitch = (Switch) findViewById(R.id.bgSwitch);
        bgSwitch.setChecked(false);
        bgSwitch.setOnClickListener((View.OnClickListener) this);

    }
    // This method is called when the home button is clicked, to take the user to the home page
    public void goToHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

   public void onClick(View v) {
       if (v.getId() == R.id.bgSwitch) {
           if (bgSwitch.isChecked()) {
               bgSwitch.setTextOn("Hello");
           }
       }
    }
}
