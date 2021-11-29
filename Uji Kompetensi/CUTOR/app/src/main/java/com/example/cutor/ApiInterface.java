package com.example.cutor;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    //    @GET("/api/kategori")
//    Call<GetKategori> GetKategori();
    @GET("/api/menu")
    Call<GetModel> GetModel();
}
