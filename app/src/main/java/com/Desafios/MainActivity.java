package com.Desafios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView miimagen = findViewById(R.id.miimagen);
        Picasso.get().load("https://doc-images-adl.s3-sa-east-1.amazonaws.com/logo.svg").into(miimagen);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Usuario ingresado con éxito", Toast.LENGTH_SHORT).show();

            }
        });

        Button button1 = findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentExample();
            }
        });

    }
    private void intentExample(){
        Intent intent = new Intent(this, MainRegistro.class);
        startActivity(intent);
    }
}
