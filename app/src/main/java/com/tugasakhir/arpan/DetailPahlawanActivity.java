package com.tugasakhir.arpan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailPahlawanActivity extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";
    private ImageButton modear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pahlawan);

        ImageView imgPahlawan = findViewById(R.id.imgPahlawan);
        TextView tvPahlawanName = findViewById(R.id.tvPahlawanName);
        TextView tvPahlawanDetail = findViewById(R.id.tvPahlawanDetail);
        TextView tvPahlawanDetails = findViewById(R.id.tvPahlawanDetails);

        Pahlawan pahlawan = getIntent().getParcelableExtra(ITEM_EXTRA);
        if (pahlawan != null) {
            Glide.with(this)
                    .load(pahlawan.getPhoto())
                    .into(imgPahlawan);
            tvPahlawanName.setText(pahlawan.getName());
            tvPahlawanDetail.setText(pahlawan.getDetail());
            tvPahlawanDetails.setText(pahlawan.getDetails());
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Biodata Pahlawan");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        modear = findViewById(R.id.modear);
        modear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(DetailPahlawanActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
