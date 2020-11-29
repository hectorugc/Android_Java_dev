package com.example.myapplication.Control;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapplication.Model.Categorie;
import com.example.myapplication.R;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    private ArrayList<Categorie> listeCategorie;
    private ListView lvCategories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listeCategorie =new ArrayList<>();
        listeCategorie.add(new

                Categorie("pull 1",
                "this is a pull an its conetent",
                34,
                R.drawable.pull,
                1,
                1,
                "Pulls",
                R.drawable.pull));
        listeCategorie.add(new

                Categorie("Pull # 2",
                "This is the new Categorie",
                12,
                R.drawable.pull2,
                1,
                1,
                "Pulls",
                R.drawable.pull));
        listeCategorie.add(new

                Categorie("Pull # 3",
                "This is the new Categorie",
                40,
                R.drawable.pull3,
                1,
                1,
                "Pulls",
                R.drawable.pull));
        listeCategorie.add(new

                Categorie("Pull # 4",
                "This is the new Categorie",
                12,
                R.drawable.pull4,
                1,
                1,
                "Pulls",
                R.drawable.pull));
        listeCategorie.add(new

                Categorie("Pull # 5",
                "This is the new Categorie",
                12,
                R.drawable.pull5,
                1,
                1,
                "Pulls",
                R.drawable.pull));
    }



    @Override
    public void onStart() {
        super.onStart();
        this.lvCategories = this.findViewById(R.id.ca_liste);
        ArrayAdapter<Categorie> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                this.listeCategorie);
        this.lvCategories.setAdapter(adapter);
    }
}