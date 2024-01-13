package com.example.myapplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Classe pour représenter une recette
class Recette {
    private String titre;
    private ArrayList<String> methode;
    private ArrayList<String> ingredients;

    public Recette(){}

    public Recette(String titre, ArrayList<String> methode, ArrayList<String> ingredients) {
        this.titre = titre;
        this.methode = methode;
        this.ingredients = ingredients;
    }

    public String getTitre() {
        return titre;
    }

    public ArrayList getMethode() {
        return methode;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }


}

