package com.mksoo.myandroidtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnVisible;
    Button btninvisible;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVisible = findViewById(R.id.btn_visible);
        btninvisible = findViewById(R.id.btn_invisible);
        textView = findViewById(R.id.textview);

        btnVisible.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textView.setVisibility(View.VISIBLE);
            }
        });

        btninvisible.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textView.setVisibility(View.INVISIBLE);
            }
        });


    }
}
