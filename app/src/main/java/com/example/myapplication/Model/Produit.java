package com.example.myapplication.Model;
import java.util.ArrayList;

public abstract class Produit  {

    private String titre;
    private String description;
    private double prix;
    private int img;
    private int idCategorie;

    public Produit(String titre, String description, double prix, int img,int idCategorie) {
        this.titre = titre;
        this.description = description;
        this.prix = prix;
        this.img = img;
        this.idCategorie = idCategorie;
    }
    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
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

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
