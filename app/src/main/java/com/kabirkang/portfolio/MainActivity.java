package com.kabirkang.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        Button b = (Button) v;
        String buttonName = "This button will launch my " + b.getText().toString() + " app!";
        Toast.makeText(MainActivity.this, buttonName, Toast.LENGTH_SHORT).show();
    }
}
