package com.example.bangunruang_bangundatar.bangunDatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bangunruang_bangundatar.R;

public class persegipanjang extends AppCompatActivity {

    EditText etPanjang;
    EditText etLebar;
    TextView tvHasil;

    Button hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegipanjang);
        etPanjang = findViewById(R.id.etPanjang);
        etLebar = findViewById(R.id.etLebar);
        tvHasil = findViewById(R.id.tvHasil);
        hitung = findViewById(R.id.btnHitung);



        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String panjangString = etPanjang.getText().toString().trim();
                String lebarString = etPanjang.getText().toString().trim();


                if (panjangString.isEmpty() || lebarString.isEmpty()) {
                    etPanjang.setError("Masukkan Panjang persegi");
                    etLebar.setError("Masukkan Lebar persegi");
                    return;
                }
                float panjang = Float.parseFloat(etPanjang.getText().toString());
                float lebar = Float.parseFloat(etLebar.getText().toString());
                float hasil = 0.0f;

                hasil = panjang * lebar;
                tvHasil.setText(hasil + "");
            }
        });



    }






}