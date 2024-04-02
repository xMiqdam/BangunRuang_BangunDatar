package com.example.bangunruang_bangundatar.parent;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import com.example.bangunruang_bangundatar.R;
import com.example.bangunruang_bangundatar.Adapter.adapter;
import com.example.bangunruang_bangundatar.bangunDatar.lingkaran;
import com.example.bangunruang_bangundatar.bangunDatar.persegi;
import com.example.bangunruang_bangundatar.bangunDatar.persegipanjang;
import com.example.bangunruang_bangundatar.bangunDatar.segitiga;
import com.example.bangunruang_bangundatar.ModelClass.moduleObject;

public class bangun_datar extends Fragment implements adapter.ItemClickListener {



    ArrayList<moduleObject> modelbangundatar = new ArrayList<>();
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_bangun_ruang,container,false);
        RecyclerView rvBangunDatar = rootview.findViewById(R.id.rvBangunRuang);

        modelbangundatar.add(new moduleObject("https://cdn0-production-images-kly.akamaized.net/kwVB6mWrePUIgUoMofCsWGJPKho=/1200x900/smart/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/3409130/original/098589600_1616496130-persegi.jpg","Persegi","Sisi x Sisi"));
        modelbangundatar.add(new moduleObject("https://cdn0-production-images-kly.akamaized.net/Ndj6uHSUufXXhsB4tQ_Mt7hnaRY=/500x281/smart/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/3409131/original/045818300_1616496131-persegi_panjang.jpg","Persegi Panjang","Panjang x Lebar"));
        modelbangundatar.add(new moduleObject("https://cdn0-production-images-kly.akamaized.net/HMlQZTZBi9T7WUSt6wXjJFv2sic=/500x667/smart/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/3471854/original/039486200_1622699012-sama_sisi.jpg","Segitiga","0,5 x Alas x Tinggi"));
        modelbangundatar.add(new moduleObject("https://cdn0-production-images-kly.akamaized.net/j9DEsOYjr1cbIBx9XK_h_ZQL_kg=/1200x900/smart/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/3409137/original/063814200_1616496134-lingkaran.jpg","Lingkaran","3,14 x r²"));

        // Inflate the layout for this fragment
        rvBangunDatar.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter adapter = new adapter(getContext(),modelbangundatar);
        rvBangunDatar.setAdapter(adapter);
        adapter.setClickListener(this);

        return rootview;
    }

    @Override
    public void onItemClick(View view, int position) {
        String pilihan = modelbangundatar.get(position).getTitle();

        if ("Persegi".equals(pilihan)) {
            startActivity(new Intent(getActivity(), persegi.class));
        } else if ("Persegi Panjang".equals(pilihan)) {
            startActivity(new Intent(getActivity(), persegipanjang.class));
        } else if ("Segitiga".equals(pilihan)) {
            startActivity(new Intent(getActivity(), segitiga.class));
        } else if ("Lingkaran".equals(pilihan)) {
            startActivity(new Intent(getActivity(), lingkaran.class));
        } else {
            // Tindakan default jika tidak ada yang cocok
        }
}
}