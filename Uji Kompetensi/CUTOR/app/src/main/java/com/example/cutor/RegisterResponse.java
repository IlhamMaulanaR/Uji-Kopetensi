package com.example.cutor;

import java.io.Serializable;

public class RegisterResponse implements Serializable {
    private int id;
    private String Nama_pengguna;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_pengguna() {
        return Nama_pengguna;
    }

    public void setNama_pengguna(String nama_pengguna) {
        Nama_pengguna = nama_pengguna;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
