package com.example.user.vina_1202140178_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText vUser, vPassword;
    private Button vButton;

    //String yang berisikan username dan password
    private String username = "EAD";
    private String password = "MOBILE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toast.makeText(this, "Selamat Datang!", Toast.LENGTH_LONG);

        //mengambil ID dari view
        vUser = (EditText) findViewById(R.id.username);
        vPassword = (EditText) findViewById(R.id.password);
        vButton = (Button) findViewById(R.id.btnLogin);



    }

    //jika method dari valuLogin() bernilai true maka activity berpindah ke MainActivity
    public void login(View view) {
        if (valueLogin()) {
            Intent newAct = new Intent(this, MainActivity.class);
            startActivity(newAct);
        } else {
            Toast.makeText(this, "Username atau password salah", Toast.LENGTH_SHORT).show();
        }
    }

    //method untuk mengecek apakah username password benar atau salah
    public boolean valueLogin() {
        boolean login;

        if (vUser.getText().toString().equals(username) && vPassword.getText().toString().equals(password)) {
            login = true;
        } else {
            login = false;
        }
        return login;
    }
}
