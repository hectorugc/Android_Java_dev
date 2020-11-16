package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);                                                                                                                                                                     
        setContentView(R.layout.activity_main);
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