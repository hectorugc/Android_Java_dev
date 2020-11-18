package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   private ArrayList<Pull> modele;
   private int noPullCourant;

   protected void onSaveInstancesState(Bundle outState){
       super.onSaveInstanceState(outState);

       outState.putInt("noPull",this.noPullCourant);
       outState.putSerializable("liste",this.modele);
   }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);                                                                                                                                                                     
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null){
            this.noPullCourant = savedInstanceState.getInt("noPull");
            this.modele = (ArrayList<Pull>) savedInstanceState.getSerializable("liste");
        }
    }

    public void startSecond(View v){
       startActivity(new Intent(this.));
    }


    @Override
    protected void onStart(){
        super.onStart();
        ImageView my_image = (ImageView) findViewById(R.id.my_image);
        my_image.setImageResource(R.drawable.pull);
        //get the spinner from the xml.
        Spinner dropdown = findViewById(R.id.spinner1);
        Spinner dropdown1 = findViewById(R.id.spinner2);
        //create a list of items for the dropdowns.
        String[] taille = new String[]{"CH", "M", "L","XL"};
        String[] colors = new String[]{"Blue", "Rouge", "Vert","Jaune"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, taille);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, colors);

//set the spinners adapter to the previously created one.
        dropdown.setAdapter(adapter);
        dropdown1.setAdapter(adapter1);

        Toast.makeText(this,R.string.ajouter_painer, Toast.LENGTH_SHORT).show();


    }
}