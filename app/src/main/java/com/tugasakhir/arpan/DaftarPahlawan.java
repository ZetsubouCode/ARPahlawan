package com.tugasakhir.arpan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class DaftarPahlawan extends AppCompatActivity {
    private RecyclerView rvPahlawan;
    private ArrayList<Pahlawan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_pahlawan);

        rvPahlawan = findViewById(R.id.rv_pahlawan);
        rvPahlawan.setHasFixedSize(true);

        list.addAll(DataPahlawan.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvPahlawan.setLayoutManager(new LinearLayoutManager(this));
        DaftarPahlawanAdapter daftarPahlawanAdapter = new DaftarPahlawanAdapter(list);
        rvPahlawan.setAdapter(daftarPahlawanAdapter);

        daftarPahlawanAdapter.setOnItemClickCallback(new DaftarPahlawanAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Pahlawan pahlawan) {
                Intent moveIntent = new Intent(DaftarPahlawan.this, DetailPahlawanActivity.class);
                moveIntent.putExtra(DetailPahlawanActivity.ITEM_EXTRA, pahlawan);
                startActivity(moveIntent);
            }
        });

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Daftar Pahlawan Nasional");
        }

    }
}