package com.example.bangunruang_bangundatar.bangunDatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bangunruang_bangundatar.R;

public class lingkaran extends AppCompatActivity {
    EditText etradius;
    TextView tvHasil;

    Button hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        etradius = findViewById(R.id.etRadius);
        tvHasil = findViewById(R.id.tvHasil);
        hitung = findViewById(R.id.btnHitung);



        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String radiusString = etradius.getText().toString().trim();


                if (radiusString.isEmpty()) {
                    etradius.setError("Masukkan Radius persegi");
                    return;
                }
                float radius = Float.parseFloat(etradius.getText().toString());
                Float hasil = 0.0f;

                hasil = (float) 3.14 * radius * radius;
                tvHasil.setText(hasil + "");
            }
        });
    }
}