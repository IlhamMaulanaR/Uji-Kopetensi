package com.example.cutor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {
    Button btnMASUK;
    EditText tvemail ,tvkatasandi2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        btnMASUK = findViewById(R.id.btnMASUK);
        tvemail = findViewById(R.id.tvemail);
        tvkatasandi2 = findViewById(R.id.tvkatasandi2);

        btnMASUK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(tvemail.getText().toString()) || TextUtils.isEmpty(tvkatasandi2.getText().toString())) {
                    String message = "All input required...";
                    Toast.makeText(LoginActivity.this, message, Toast.LENGTH_LONG).show();
                } else {
                    LoginRequest loginRequest = new LoginRequest();
                    loginRequest.setemail(tvemail.getText().toString());
                    loginRequest.setKatasandi(tvkatasandi2.getText().toString());
                }
            }
        });
    }

    public void loginUser(LoginRequest loginRequest){
        Call<LoginResponse> loginResponseCall = GetApi.getService().loginUser(loginRequest);
        loginResponseCall.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if(response.isSuccessful()){
                    LoginResponse loginResponse = response.body();
                    startActivity(new Intent(LoginActivity.this,Beranda.class).putExtra("data",loginResponse));
                    finish();


                }else{

                    String message = "eror asu coba maneh..";
                    Toast.makeText(LoginActivity.this,message,Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                String message = t.getLocalizedMessage();
                Toast.makeText(LoginActivity.this,message,Toast.LENGTH_LONG).show();
            }
        });
    }


    public void btnMASUK(View view) {
        Intent intent = new Intent(this, Lokasi.class);
        startActivity(intent);
    }

    public void tvbuatakun(View view) {
        Intent intent = new Intent(this, registrasi.class);
        startActivity(intent);
    }

}