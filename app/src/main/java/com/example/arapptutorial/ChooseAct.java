package com.example.arapptutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChooseAct extends AppCompatActivity {

    Button btnSignIn, btnSignUp;
    TextView txtSlogan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_choose);

        btnSignIn = (Button) findViewById(R.id.btnsignin);
        btnSignUp = (Button) findViewById(R.id.btnsignup);

        txtSlogan = (TextView) findViewById(R.id.txtSlogan);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signin = new Intent(ChooseAct.this, SignIn.class);
                startActivity(signin);
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup = new Intent(ChooseAct.this, SignUp.class);
                startActivity(signup);
            }
        });
    }
}

