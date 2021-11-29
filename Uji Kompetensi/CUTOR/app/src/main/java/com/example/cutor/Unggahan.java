package com.example.cutor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Unggahan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unggahan);
    }

    public void btnselesai(View view) {
        Intent intent = new Intent(Unggahan.this, Beranda.class);
        startActivity(intent);

    finish();
    }

}