package com.example.myapplication.Model;
import java.util.ArrayList;

public class Pull {

    private String titre;
    private String description;
    private double prix;
    private String img;

    public Pull(String titre, String description, double prix, String img) {
        this.titre = titre;
        this.description = description;
        this.prix = prix;
        this.img = img;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
