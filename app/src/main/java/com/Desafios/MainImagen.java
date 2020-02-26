package com.Desafios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;



public class MainImagen extends AppCompatActivity {

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_imagen);


         ImageView miimagen2 = findViewById(R.id.imagen2);
         Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTlY9hxHGGOaVAPhWAJ0tqhGMAC5Wk7JcRF5tHQUFBRJ-tqzfH1").into(miimagen2);



     }
}
