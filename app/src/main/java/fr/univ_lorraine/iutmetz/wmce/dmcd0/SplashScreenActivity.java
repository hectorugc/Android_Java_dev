package fr.univ_lorraine.iutmetz.wmce.dmcd0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.ArrayList;

import fr.univ_lorraine.iutmetz.wmce.dmcd0.connection.CategorieDAO;
import fr.univ_lorraine.iutmetz.wmce.dmcd0.modele.Categorie;

public class SplashScreenActivity extends AppCompatActivity {

    private ArrayList<Categorie> listCategories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        final int SPLASH_TIME_OUT = 1000;
        this.listCategories = new ArrayList<>();
        new Handler().postDelayed(
                ()-> CategorieDAO.findAll(this),
                SPLASH_TIME_OUT);
    }
}