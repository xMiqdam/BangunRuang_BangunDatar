package com.example.bangunruang_bangundatar.bangunDatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bangunruang_bangundatar.R;

public class segitiga extends AppCompatActivity {

    EditText etalas;
    TextView ettinggi;

    Button hitung;

    TextView tvHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);


        etalas = findViewById(R.id.etAlas);
        ettinggi = findViewById(R.id.etTinggi);
        hitung = findViewById(R.id.btnHitung);
        tvHasil = findViewById(R.id.tvHasil);


        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String alasString = etalas.getText().toString().trim();
                String tinggiString = ettinggi.getText().toString().trim();


                if (alasString.isEmpty() || tinggiString.isEmpty()) {
                    etalas.setError("Masukkan Alas persegi");
                    ettinggi.setError("Masukkan Tinggi persegi");
                    return;
                }
                Float alas = Float.parseFloat(etalas.getText().toString());
                Float tinggi = Float.parseFloat(etalas.getText().toString());
                Float hasil = 0.0F;


                hasil = (float) 0.5 * alas * tinggi;
                tvHasil.setText(hasil + "");
            }
        });
    }
    }
