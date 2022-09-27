package com.example.projeto_nav_bar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);
            this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
            getSupportActionBar().hide();

            ImageView view = findViewById(R.id.imageView54);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent nav = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(nav);
                }
            });
            ImageView view2 = findViewById(R.id.imageView56);
            view2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent nav = new Intent(LoginActivity.this, RegistoActivity.class);
                    startActivity(nav);
                }
            });
            ImageView view3 = findViewById(R.id.imageView57);
            view3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent nav = new Intent(LoginActivity.this, IntroActivity.class);
                    startActivity(nav);
                }
            });
        }
    }
