package com.example.cutor;

public class RegisterRequest {
    private String Nama_pengguna;
    private String email;
    private String Kata_sandi;
    private String Tgl_gabung = "2021-11-22";

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

    public String getKata_sandi() {
        return Kata_sandi;
    }

    public void setKata_sandi(String kata_sandi) {
        Kata_sandi = kata_sandi;
    }

    public String getTgl_gabung() {
        return Tgl_gabung;
    }

    public void setTgl_gabung(String tgl_gabung) {
        Tgl_gabung = tgl_gabung;
    }
}
