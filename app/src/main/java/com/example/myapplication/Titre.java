package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class Titre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titre);

        // Récupérez l'ImageView
        ImageView foodImage = findViewById(R.id.foodImage);

        // Ajoutez un écouteur de clic à l'ImageView
        foodImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code pour rediriger vers la page suivante (Page1)
                Intent intent = new Intent(Titre.this, Login.class);
                startActivity(intent);
            }

        });

    }



}