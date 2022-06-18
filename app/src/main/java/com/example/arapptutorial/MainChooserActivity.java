package com.example.arapptutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainChooserActivity extends AppCompatActivity {

    Button btn_AR,btn_Diet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_chooser);
        btn_AR = (Button) findViewById(R.id.btnar);
        btn_Diet = (Button) findViewById(R.id.btndiet);

        btn_AR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btar = new Intent(MainChooserActivity.this, MainActivity.class);
                startActivity(btar);
            }
        });

        btn_Diet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btdiet = new Intent(MainChooserActivity.this, DietActivity.class);
                startActivity(btdiet);
            }
        });

    }
}