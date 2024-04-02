package com.example.bangunruang_bangundatar.bangunDatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bangunruang_bangundatar.R;

public class persegi extends AppCompatActivity {

    EditText etsisi;
    TextView tvHasil;

    Button hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        etsisi = findViewById(R.id.etSisi);
        tvHasil = findViewById(R.id.tvHasil);
        hitung = findViewById(R.id.btnHitung);



        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sisiString = etsisi.getText().toString().trim();


                if (sisiString.isEmpty()) {
                    etsisi.setError("Masukkan Sisi persegi");
                    return;
                }
                float sisi = Float.parseFloat(etsisi.getText().toString());
                float hasil = 0.0f;

                hasil = sisi * sisi;
                tvHasil.setText(hasil + "");
            }
        });
    }
}