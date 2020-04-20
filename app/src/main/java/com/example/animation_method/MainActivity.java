package com.example.animation_method;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView helloworld;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     helloworld=findViewById(R.id.text);
    helloworld.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.i("Mytag","helloguys");
        }
    });

    }
}
