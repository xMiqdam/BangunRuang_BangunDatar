package com.example.bangunruang_bangundatar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.bangunruang_bangundatar.parent.bangunRuang;
import com.example.bangunruang_bangundatar.parent.bangun_datar;
import com.example.bangunruang_bangundatar.parent.profile;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    FrameLayout frameLayout;
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout = (FrameLayout)findViewById(R.id.flFragment);
        bottomNavigationView = findViewById(R.id.bottomViewNav);

        getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,new bangun_datar()).addToBackStack(null).commit();

        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment=null;

                if(item.getItemId() == R.id.bangunDatar)
                {
                    fragment = new bangun_datar();
                }
                else if(item.getItemId() == R.id.bangunRuang)
                {

                    fragment = new bangunRuang();
                }
                else if(item.getItemId() == R.id.profile)
                {
                    fragment = new profile();
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,fragment).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit();
                return true;
            }
        });
    }
}