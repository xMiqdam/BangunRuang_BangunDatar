package com.example.bangunruang_bangundatar.bangun_Ruang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bangunruang_bangundatar.R;

public class balok extends AppCompatActivity {

    EditText etpanjang;
    EditText etlebar;
    EditText ettinggi;
    TextView tvHasil;

    Button hitung;

    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);


        etpanjang = findViewById(R.id.etPanjang);
        etlebar = findViewById(R.id.etLebar);
        ettinggi = findViewById(R.id.etTinggi);
        tvHasil = findViewById(R.id.tvHasil);
        hitung = findViewById(R.id.btnHitung);



        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjangString = etpanjang.getText().toString().trim();
                String lebarString = ettinggi.getText().toString().trim();
                String tinggiString = ettinggi.getText().toString().trim();



                if (panjangString.isEmpty() || lebarString.isEmpty() || tinggiString.isEmpty()) {
                    etpanjang.setError("Masukkan Panjang persegi");
                    etlebar.setError("Masukkan Lebar persegi");
                    ettinggi.setError("Masukkan Tinggi persegi");
                    return;
                }
                float panjang = Float.parseFloat(etpanjang.getText().toString());
                float lebar = Float.parseFloat(etlebar.getText().toString());
                float tinggi = Float.parseFloat(ettinggi.getText().toString());
                float hasil = 0.0f;

                hasil = panjang * lebar * tinggi;
                tvHasil.setText(hasil + "");
            }
        });

    }
}