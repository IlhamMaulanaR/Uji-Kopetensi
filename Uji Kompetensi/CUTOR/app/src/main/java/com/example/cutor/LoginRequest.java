package com.example.cutor;

public class LoginRequest {

    private String Namapengguna;
    private String Email;
    private String Katasandi;

    public String getNamapengguna() {
        return Namapengguna;
    }

    public void setNamapengguna(String namapengguna) {
        Namapengguna = namapengguna;
    }

    public void setemail(String email) {Email = email;}

    public void setKatasandi(String katasandi) {
        Katasandi = katasandi;
    }
}
