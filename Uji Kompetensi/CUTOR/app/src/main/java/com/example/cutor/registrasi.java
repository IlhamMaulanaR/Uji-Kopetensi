package com.example.cutor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class registrasi<btnDaftar> extends AppCompatActivity {

    Button btnDaftar;
    EditText edunamapengguna, eduEmail,edukatasandi2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        btnDaftar = findViewById(R.id.btnDAFTAR);
        edunamapengguna = findViewById(R.id.edunamapengguna);
        eduEmail = findViewById(R.id.eduEmail);
        edukatasandi2 = findViewById(R.id.edukatasandi2);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RegisterRequest registerRequest = new RegisterRequest();
                registerRequest.setNama_pengguna(edunamapengguna.getText().toString());
                registerRequest.setEmail(eduEmail.getText().toString());
                registerRequest.setKata_sandi(edukatasandi2.getText().toString());
                registerUser(registerRequest);
            }
        });
    }

    public void registerUser(RegisterRequest registerRequest){
        Call<RegisterResponse> registerResponseCall = GetApi.getService().registerUser(registerRequest);
        registerResponseCall.enqueue(new Callback<RegisterResponse>() {
            @Override
            public void onResponse(Call<RegisterResponse> call, Response<RegisterResponse> response) {
                if(response.isSuccessful()){

                    String message = "Berhasil";
                    Toast.makeText(registrasi.this,message,Toast.LENGTH_LONG).show();

                    startActivity(new Intent(registrasi.this,LoginActivity.class));
                    finish();

                }else{

                    String message = "error harap coba lagi";
                    Toast.makeText(registrasi.this,message,Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<RegisterResponse> call, Throwable t) {

                String message = t.getLocalizedMessage();
                Toast.makeText(registrasi.this,message,Toast.LENGTH_LONG).show();
            }
        });
    }
    public void btnDAFTAR(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
    }

    }