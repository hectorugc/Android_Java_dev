package com.example.myapplication.Control;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.Model.Categorie;
import com.example.myapplication.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Categorie> modele;
    private int noPullCourant;
    public static ImageView my_image;
    public  TextView text_title;
    public  TextView text_description;
    protected void onSaveInstancesState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("noPull", this.noPullCourant);
        outState.putSerializable("liste", this.modele);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent category = new Intent(MainActivity.this, ListActivity.class);
        startActivity(category);
        if (savedInstanceState != null) {
            this.noPullCourant = savedInstanceState.getInt("noPull");
            this.modele = (ArrayList<Categorie>) savedInstanceState.getSerializable("liste");
        }

    String.valueOf(noPullCourant);
        modele = new ArrayList<>();
        modele.add(new Categorie("pull 1",
                "this is a pull an its conetent",
                34,
                R.drawable.pull,
                1,
                1,
                "Pulls",
                R.drawable.pull ));
        modele.add(new Categorie("Pull # 2",
                "This is the new Categorie",
                12,
                R.drawable.pull2,
                1,
                1,
                "Pulls",
                R.drawable.pull ));
        modele.add(new Categorie("Pull # 3",
                "This is the new Categorie",
                40,
                R.drawable.pull3,
                1,
                1,
                "Pulls",
                R.drawable.pull ));
        modele.add(new Categorie("Pull # 4",
                "This is the new Categorie",
                12,
                R.drawable.pull4,
                1,
                1,
                "Pulls",
                R.drawable.pull ));
        modele.add(new Categorie("Pull # 5",
                "This is the new Categorie",
                12,
                R.drawable.pull5,
                1,
                1,
                "Pulls",
                R.drawable.pull ));
        //bonnet
        modele.add(new Categorie("bonet 1",
                "this is a bonne an its conetent",
                34,
                R.drawable.bonne,
                1,
                1,
                "Bonnet",
                R.drawable.bonne ));
        modele.add(new Categorie("Pull # 2",
                "This is the new Categorie",
                12,
                R.drawable.pull2,
                1,
                1,
                "Pulls",
                R.drawable.pull ));
        modele.add(new Categorie("Pull # 3",
                "This is the new Categorie",
                40,
                R.drawable.pull3,
                1,
                1,
                "Pulls",
                R.drawable.pull ));
        modele.add(new Categorie("Pull # 4",
                "This is the new Categorie",
                12,
                R.drawable.pull4,
                1,
                1,
                "Pulls",
                R.drawable.pull ));
        modele.add(new Categorie("Pull # 5",
                "This is the new Categorie",
                12,
                R.drawable.pull5,
                1,
                1,
                "Pulls",
                R.drawable.pull ));
    }





   /* public void startSecond(View v){
       startActivity(new Intent(this.));*/


    @Override
    protected void onStart() {
        super.onStart();
      my_image = (ImageView) findViewById(R.id.my_image);
        my_image.setImageResource(R.drawable.pull);
        //get the spinner from the xml.
        Spinner dropdown = findViewById(R.id.spinner1);
        Spinner dropdown1 = findViewById(R.id.spinner2);
        //create a list of items for the dropdowns.
        String[] taille = new String[]{"CH", "M", "L", "XL"};
        String[] colors = new String[]{"Blue", "Rouge", "Vert", "Jaune"};


        text_title = findViewById(R.id.textViewTitle);

        text_description= findViewById(R.id.textViewDescription);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, taille);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, colors);

//set the spinners adapter to the previously created one.
        dropdown.setAdapter(adapter);
        dropdown1.setAdapter(adapter1);


    }

    public void nextCategorie(View v) {

        noPullCourant++;
        noPullCourant=noPullCourant % modele.size();
        my_image.setImageResource(modele.get(noPullCourant).getImg());
        text_title.setText(modele.get(noPullCourant).getTitre());
        text_description.setText(modele.get(noPullCourant).getDescription());
        Log.e("pull curant", String.valueOf(this.noPullCourant));

    }
    public void toast(View v){
        Toast.makeText(this, String.format(getString( R.string.ajouter_painer),this.noPullCourant), Toast.LENGTH_SHORT).show();

    }

    public void onClickImage(View v){
        v.bringToFront();
        
    }
}