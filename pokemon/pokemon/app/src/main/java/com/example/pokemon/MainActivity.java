package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pokemon1 p1 = new pokemon1 ("squirtle",R.drawable.images,260,350,610);
        pokemon1 p2 = new pokemon1("pikachu",R.drawable.countrydetailpokemon,200,300,600);
        pokemon1 p3 = new pokemon1("piplup",R.drawable.piplup,233,100,333);
    }
}