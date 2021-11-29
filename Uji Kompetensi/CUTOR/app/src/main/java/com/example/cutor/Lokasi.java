package com.example.cutor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Lokasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lokasi);

        //calling the action bar
//        ActionBar actionbar=getSupportActionBar();
        //showing back button in action bar
//        actionbar.setDisplayHomeAsUpEnabled(true);
    }
        //this event will the back
        //function to the button o press
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem Item) {
        switch (Item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(Item);
    }
    public void btnMENCARI(View view) {
        Intent intent = new Intent(this, Beranda.class);
        startActivity(intent);
    }
}