package com.example.myapplication.Model;

public  class Categorie  extends Produit{
    private int categorieId;
    private String titreCategorie;
    private int visuelCategory;
    

    public Categorie(String titre, String description, double prix, int img,int idCategorie,int categorieId,String titreCategorie,int visuelCategory) {
        super(titre,description,prix,img,idCategorie);
        this.categorieId = categorieId;
        this.titreCategorie = titreCategorie;
        this.visuelCategory= visuelCategory;
    }

    public int getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(int categorieId) {
        this.categorieId = categorieId;
    }

    public String getTitreCategorie() {
        return titreCategorie;
    }

    public void setTitreCategorie(String titreCategorie) {
        this.titreCategorie = titreCategorie;
    }

    public int getVisuel() {
        return visuelCategory;
    }

    public void setVisuel(int visuelCategory) {
        this.visuelCategory = visuelCategory;
    }



}
