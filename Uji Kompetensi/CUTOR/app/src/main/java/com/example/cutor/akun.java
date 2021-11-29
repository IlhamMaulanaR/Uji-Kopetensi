package com.example.cutor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class akun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akun);
    }
    public void ivarrow(View view) {
        Intent intent = new Intent(this,Beranda.class);
        startActivity(intent);
    }

    public void btnkeluardanmasuk(View view) {
        Intent  intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
}