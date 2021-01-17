package com.example.androidtoggleswitch_sample;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

import id.indosw.androidtoggleswitch.widgets.ToggleSwitch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToggleSwitch toggleSwitch = findViewById(R.id.n_items_toggle_switch);
        ArrayList<String> labels = new ArrayList<>();
        labels.add("A");
        labels.add("B");
        labels.add("C");
        labels.add("D");
        toggleSwitch.setLabels(labels);

        toggleSwitch.setOnToggleSwitchChangeListener((position, isChecked) -> {
            // Write your code
            Toast.makeText(getApplicationContext(),"Click Position"+position,Toast.LENGTH_SHORT).show();
        });
    }
}
