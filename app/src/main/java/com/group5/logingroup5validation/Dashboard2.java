package com.example.logingroup5validation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard2 extends AppCompatActivity {

    Button logoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_dianne);

        logoutBtn=(Button) findViewById(R.id.logoutBtn);

        logoutBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Dashboard2.this, MainActivity.class);
                startActivity(intent);
                finish();
            }

        });

    }
}
