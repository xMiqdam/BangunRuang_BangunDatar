package com.example.bangunruang_bangundatar.ModelClass;

import androidx.fragment.app.FragmentActivity;

import java.util.ArrayList;

public class moduleObject {
    private String image;
    private String title;

    private String rumus;


    public moduleObject(String image, String title, String rumus) {
        this.image = image;
        this.title = title;
        this.rumus = rumus;
    }

    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getRumus(){return rumus;}

}
