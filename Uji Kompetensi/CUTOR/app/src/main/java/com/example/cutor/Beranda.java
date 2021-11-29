package com.example.cutor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Beranda extends AppCompatActivity {

    ApiInterface ApiInterface;
    private RecyclerView aRecyclerView;
    private RecyclerView.Adapter aAdapter;
    private RecyclerView.LayoutManager aLayoutManager;
    public static Beranda Bd;

//    RecyclerView recyclerView;
//    adapternew adapter;
//    List<model> modelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        aRecyclerView = (RecyclerView) findViewById(R.id.rcvkolom);
        aLayoutManager = new LinearLayoutManager(this);
        aRecyclerView.setLayoutManager(aLayoutManager);
        ApiInterface = ApiClient.getClient().create(com.example.cutor.ApiInterface.class);
        Bd = this;

//        load();
//        isidata();
        panggilRetrovit();
    }

    public void panggilRetrovit(){
        Call<GetModel> kategoriCall = ApiInterface.GetModel();
        kategoriCall.enqueue(new Callback<GetModel>() {
            @Override
            public void onResponse(Call<GetModel> call, Response<GetModel>
                    response) {
                List<model> aModelList = response.body().getData();
                Log.d("Retrofit Get", "Jumlah data Kontak: " +
                        String.valueOf(aModelList.size()));
                aAdapter = new adapternew(aModelList);
                aRecyclerView.setAdapter(aAdapter);
            }

            @Override
            public void onFailure(Call<GetModel> call, Throwable t) {
                Log.e("Retrofit Get", t.toString());
            }
        });
    }

    public void ivakun(View view) {
        Intent intent = new Intent(this,akun.class);
        startActivity(intent);
    }

    public void btnunggah(View view) {
        Intent intent = new Intent(this,Unggahan.class);
        startActivity(intent);
    }
//    public void load(){
//        recyclerView = findViewById(R.id.rcvkolom);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//    }
//    public void isidata(){
//        modelList = new ArrayList<model>();
////        modelList.add(new model("Sumber Emas", "Buduran,Sidoarjo", R.drawable.galeri));
////        modelList.add(new model("Kunci Usaha", "Buduran,Sidoarjo", R.drawable.galeri));
////        modelList.add(new model("jaya rezeki", "Buduran,Sidoarjo", R.drawable.galeri));
////        modelList.add(new model("Sumber Usaha", "Buduran,Sidoarjo", R.drawable.galeri));
////        modelList.add(new model("Jaya Sukses", "Gedangan,Sidoarjo", R.drawable.galeri));
////        modelList.add(new model("Jaya Usaha", "Gedangan,Sidoarjo", R.drawable.galeri));
////        modelList.add(new model("Joyo Banyu", "Gedangan,Sidoarjo", R.drawable.galeri));
//
//        adapter = new adapternew(this,modelList);
//        recyclerView.setAdapter(adapter);
//    }

    public void ivhome(View view) {
        Intent intent = new Intent(this,Beranda.class);
        startActivity(intent);
    }
}