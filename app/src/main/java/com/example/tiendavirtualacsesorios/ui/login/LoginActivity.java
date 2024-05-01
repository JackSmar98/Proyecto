package com.example.tiendavirtualacsesorios.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tiendavirtualacsesorios.R;
import com.example.tiendavirtualacsesorios.MainActivity2;



public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button buttonLogin = findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar MainActivity2
                Intent intent = new Intent(LoginActivity.this, MainActivity2.class);
                startActivity(intent);

                // Finalizar LoginActivity
                finish();
            }
        });
    }
}
