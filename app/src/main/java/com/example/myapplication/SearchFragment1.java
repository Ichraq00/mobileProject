package com.example.myapplication;

import static androidx.databinding.DataBindingUtil.setContentView;
import static com.example.myapplication.JsonParser.getJSONFromFile;

import static com.example.myapplication.JsonParser.getJSONFromFile;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.databinding.ActivityMainBinding;
import com.example.myapplication.databinding.FragmentSearch1Binding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.button.MaterialButton;

import org.json.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SearchFragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SearchFragment1 extends Fragment {




    public ImageView image1;
    public ImageView image_reaps_1;
    public ImageView image_reaps_2;
    public ImageView image_reaps_3;
    public ImageView image_reaps_4;
    public TextView titre_cuisine;
    public View view1;
    public View view2;
    public View view3;
    public View view4;
    public String strJson;
    public TextView titre_repas_1;
    public TextView titre_repas_2;
    public TextView titre_repas_3;
    public TextView titre_repas_4;
    public BottomNavigationView bo_nav;
    ArrayList<TextView> titre_repas = new ArrayList<>();
    ArrayList<ImageView> image_repas = new ArrayList<>();
    String selectedItem;

    public Map<String,Recette> DictionnaireDeRecettesItaly() {
        // Créer un dictionnaire de recettes
        Map<String, Recette> dictionnaireRecettesItaly = new HashMap<>();


        // Ajouter les recettes au dictionnaire
        ArrayList<String> ingredientsPanettone = new ArrayList<>();
        ingredientsPanettone.add("⅓ cup warm water (110 degrees F/45 degrees C)");
        ingredientsPanettone.add("2 (.25 ounce) packages active dry yeast");
        ingredientsPanettone.add("4 cups all-purpose flour");
        ingredientsPanettone.add("½ cup warm milk");
        ingredientsPanettone.add("⅔ cup white sugar");
        ingredientsPanettone.add("4 large eggs");
        ingredientsPanettone.add("2 large egg yolks");
        ingredientsPanettone.add("1 teaspoon vanilla extract");
        ingredientsPanettone.add("12 tablespoons unsalted butter");
        ingredientsPanettone.add("2 cups candied mixed fruit");
        ingredientsPanettone.add("2 ½ teaspoons grated lemon zest");
        ingredientsPanettone.add("2 tablespoons orange zest");
        ingredientsPanettone.add("2 tablespoons butter, melted");
        ingredientsPanettone.add("1  egg yolk");
        ingredientsPanettone.add("1 tablespoon cream");
        ingredientsPanettone.add("3 (7 x 4-inch) round paper panettone molds");
        ArrayList<String> methodePanettone = new ArrayList<>();
        methodePanettone.add("To make sponge, warm a small bowl by rinsing it with hot water. Pour in warm water and sprinkle 1 package yeast on it. Let stand until yeast has dissolved. Stir in 1/2 cup flour, cover with plastic wrap, and let stand 30 minutes, or until doubled. Sprinkle remaining yeast over warm milk. Let stand until dissolved. Beat together sugar, eggs, egg yolks, and vanilla. Stir in milk-yeast mixture. Add sponge and stir until well incorporated.");
        methodePanettone.add("Combine butter and remaining 3 ½ cups flour until crumbly. Slowly pour in egg mixture and beat on high speed 3 to 4 minutes, until dough is elastic looking and long strands form. Beat in fruit and zests. Turn dough into oiled bowl, cover with plastic wrap, and leave in a warm place to rise until doubled, about 2 to 3 hours.");
        methodePanettone.add("Brush inside of three 7 x 4-inch paper molds with melted butter. Turn dough out onto a lightly floured work surface and knead a few times to deflate. Divide dough into 3 pieces. Roll each piece into a ball and drop into prepared molds; place on a baking sheet about 4-inches apart and cover loosely with plastic wrap. Let rise in a warm place until doubled again, about 2 hours.");
        methodePanettone.add("Preheat the oven to 400 degrees F (200 degrees C). Cut an X in top of each loaf with oiled scissors. Combine egg yolk with cream. Brush tops of loaves lightly with egg wash.");
        methodePanettone.add("Place baking sheet with loaves in bottom 1/3 of preheated oven. After 10 minutes, lower heat to 375 degrees F (190 degrees C). Continue to bake for 30 more minutes; if tops get too brown, cover with foil. Loaves are done when a wooden skewer inserted into centers comes out clean. Cool on wire rack.");
        Recette Panettone = new Recette("Panettone",methodePanettone , ingredientsPanettone);
        dictionnaireRecettesItaly.put("Panettone", Panettone);


        ArrayList<String> ingredientsPasta = new ArrayList<>();
        ingredientsPasta.add("1 cup dry chickpeas");
        ingredientsPasta.add("1 tablespoon baking soda");
        ingredientsPasta.add("1 yellow onion");
        ingredientsPasta.add("1 stalk celery");
        ingredientsPasta.add("1 small zucchini");
        ingredientsPasta.add("1 carrot");
        ingredientsPasta.add("2 tablespoons olive oil");
        ingredientsPasta.add("1 sage leaves");
        ingredientsPasta.add("1 fresh rosemary");
        ingredientsPasta.add("1 fresh thyme");
        ingredientsPasta.add("3 cups chicken broth, or more as needed");
        ingredientsPasta.add("2 peeled whole canned tomatoes");
        ingredientsPasta.add("8 ounces ditalini");
        ingredientsPasta.add("salt and freshly ground black pepper to taste");
        ingredientsPasta.add("1 cayenne pepper, seeded and minced, or more to taste");
        ingredientsPasta.add("1 tablespoon extra virgin olive oil");

        ArrayList<String> methodePasta = new ArrayList<>();
        methodePasta.add("Rinse chickpeas under cool water. Pick up handfuls of chickpeas and rub them together with your hands under the water to wash chickpeas. Place chickpeas in a large stew pot, cover with water and add baking soda; swirl chickpeas and water to distribute baking soda. Leave to soak for 8 hours or overnight.");
        methodePasta.add("The next day, pour chickpeas through a strainer and rinse well under cold running water, eliminating any skins or discolored chickpeas; set aside.");
        methodePasta.add("Grate onion, celery, zucchini, and carrot on the large teeth of a cheese grater, This step is very important as grated vegetables give a different flavor than diced.");
        methodePasta.add("Heat 2 tablespoons olive oil in the stew pot over medium heat, and sauté grated vegetables for 1 minute. Mix in sage, rosemary, and thyme and sauté, stirring occasionally, until onions are soft and translucent, about 5 minutes.");
        methodePasta.add("Add 3 cups broth, all the chickpeas, and tomatoes. Bring to a boil, reduce heat, and simmer until chickpeas are tender, about 1 hour. Stir in pasta. Add more broth only as needed to achieve a thick, stew-like consistency.");
        methodePasta.add("Cook until pasta is tender with a bite, 8 to 10 minutes. Taste and season with salt and black pepper. Remove from heat and divide amongst serving bowls. Top each bowl with minced cayenne pepper and a drizzle of extra-virgin olive oil.");

        Recette Pasta = new Recette("Pasta e Ceci",methodePasta , ingredientsPasta);
        dictionnaireRecettesItaly.put("Pasta e Ceci", Pasta);

        ArrayList<String> ingredientsPizza = new ArrayList<>();
        ingredientsPizza.add("1 tablespoon butter");
        ingredientsPizza.add("1 clove garlic, minced");
        ingredientsPizza.add("1/3 cup heavy cream");
        ingredientsPizza.add("1 cup grated Parmesan cheese, divided");
        ingredientsPizza.add("1 pound pizza dough");
        ingredientsPizza.add("8 slices mozzarella cheese");
        ArrayList<String> methodePizza = new ArrayList<>();
        methodePizza.add("Melt butter in a small saucepan over medium-high heat. Add garlic and cook until fragrant, about 30 seconds; stir in cream. Add 2/3 cup Parmesan cheese, and stir until smooth. Let Alfredo sauce cool to room temperature, about 15 minutes.");
        methodePizza.add("Meanwhile, preheat a gas grill with all burners on High for 10 to 15 minutes.");
        methodePizza.add("Divide pizza dough in half. Shape each portion of the pizza dough into an 8 to 10-inch disc. Reduce the flame on half the grill burners to Low, to create areas of direct and indirect heat.");
        methodePizza.add("Carefully place discs of dough, one at a time, onto the grill over direct heat. Close the cover. Let dough grill until the bottom is just barely cooked and shows char marks, 1 to 3 minutes.");
        methodePizza.add("Turn crust ninety degrees (do not flip dough over). Grill until crust shows light grill marks, 1 to 3 minutes.");
        methodePizza.add("Move pizza dough to indirect heat. Spoon Alfredo sauce over dough. Top each crust with four slices mozzarella cheese. Sprinkle remaining 1/3 cup Parmesan cheese evenly over pizzas.");
        methodePizza.add("Grill until cheese is melted, about 3 minutes. Carefully remove pizza from the grill.");
        methodePizza.add("Preheat the oven’s broiler. Broil pizza until cheese is golden, about 5 minutes. Allow pizza to rest a few minutes before cutting into wedges.");
        Recette Pizza = new Recette("Grilled Pizza",methodePizza,ingredientsPizza);
        dictionnaireRecettesItaly.put("Grilled Pizza",Pizza);

        ArrayList<String> ingredientsItalianBLT = new ArrayList<>();
        ingredientsItalianBLT.add("1 loaf italian bread");
        ingredientsItalianBLT.add("1 tablespoon olive oil, or as needed");
        ingredientsItalianBLT.add("1 tablespoon italian seasoning");
        ingredientsItalianBLT.add("1 teaspoon garlic granules");
        ingredientsItalianBLT.add("2 cups spinach");
        ingredientsItalianBLT.add("1/3 cup basil leaves");
        ingredientsItalianBLT.add("2 tomatoes, sliced");
        ingredientsItalianBLT.add("8 ounces fresh mozzarella cheese, sliced");
        ingredientsItalianBLT.add("12 ounces prosciutto");
        ingredientsItalianBLT.add("1/3 cup ricotta");
        ingredientsItalianBLT.add("1 tablespoon pesto");
        ArrayList<String> methodeItalianBLT = new ArrayList<>();
        methodeItalianBLT.add("Slice bread on the diagonal to get 12 slices.");
        methodeItalianBLT.add("Brush each slice of bread with olive oil. Mix Italian seasoning and garlic granules together; sprinkle over bread slices.");
        methodeItalianBLT.add("Heat a grill pan over medium-high heat, and place bread oil-side-down on the pan until grill marks form, about 3 minutes. Remove bread to a board.");
        methodeItalianBLT.add("Mix spinach and basil leaves together. Divide leaves evenly over 6 slices of bread; layer these 6 bread slices with equal amounts prosciutto, sliced tomato, and sliced mozzarella.");
        methodeItalianBLT.add("Stir pesto and ricotta together in a small bowl. Spread a generous 1 tablespoon mixture onto remaining 6 bread slices, and place on top of each sandwich.");
        Recette ItalianBLT = new Recette("Italian BLT",methodeItalianBLT,ingredientsItalianBLT);
        dictionnaireRecettesItaly.put("Italian BLT",ItalianBLT);


        return dictionnaireRecettesItaly;

    }

    public Map<String,Recette> DictionnaireDeRecettesFrance () {

        // Créer un dictionnaire de recettes
        Map<String, Recette> dictionnaireRecettesFrance = new HashMap<>();

        // Ajouter les recettes au dictionnaire
        ArrayList<String> ingredientsRatatouille = new ArrayList<>();
        ingredientsRatatouille.add("2 tablespoons olive oil, divided");
        ingredientsRatatouille.add("3 cloves garlic, minced");
        ingredientsRatatouille.add("1  eggplant, cut into 1/2 inch cubes");
        ingredientsRatatouille.add("2 teaspoons dried parsley");
        ingredientsRatatouille.add("salt to taste");
        ingredientsRatatouille.add("1 cup grated Parmesan cheese");
        ingredientsRatatouille.add("2  zucchini, sliced");
        ingredientsRatatouille.add("2 large tomatoes, chopped");
        ingredientsRatatouille.add("2 cups sliced fresh mushrooms");
        ingredientsRatatouille.add("1 large onion, sliced into rings");
        ingredientsRatatouille.add("1  green or red bell pepper, sliced");

        ArrayList<String> methodeRatatouille = new ArrayList<>();
        methodeRatatouille.add("Preheat the oven to 350 degrees F (175 degrees C). Coat the bottom and sides of a 1 1/2-quart casserole dish with 1 tablespoon olive oil.");
        methodeRatatouille.add("Heat remaining 1 tablespoon olive oil in a medium skillet over medium heat. Cook and stir garlic until fragrant and golden brown. Add eggplant and parsley; cook and stir until eggplant is tender and soft, about 10 minutes. Season with salt to taste.");
        methodeRatatouille.add("Spread eggplant mixture evenly across the bottom of the prepared casserole dish; sprinkle with a few tablespoons of Parmesan cheese. Spread zucchini in an even layer over top. Lightly salt and sprinkle with a little more cheese. Continue layering in this fashion, with tomatoes, mushrooms, onion, and bell pepper, covering each layer with a sprinkling of salt and cheese.");
        methodeRatatouille.add("Bake in preheated oven until vegetables are tender, about 45 minutes.");


        //rectte2
        ArrayList<String> ingredientsMacarons = new ArrayList<>();
        ingredientsMacarons.add( "4  extra large egg whites");
        ingredientsMacarons.add("1 ⅔ cups confectioners sugar");
        ingredientsMacarons.add( "⅛ teaspoon salt");
        ingredientsMacarons.add( "¼ cup superfine (castor) sugar");
        ingredientsMacarons.add("¼ cup seedless raspberry jam");



        ArrayList<String> methodeMacarons = new ArrayList<>();
        methodeMacarons.add("Preheat the oven to 350 degrees F (175 degrees C). Coat the bottom and sides of a 1 1/2-quart casserole dish with 1 tablespoon olive oil.");
        methodeMacarons.add("Heat remaining 1 tablespoon olive oil in a medium skillet over medium heat. Cook and stir garlic until fragrant and golden brown. Add eggplant and parsley; cook and stir until eggplant is tender and soft, about 10 minutes. Season with salt to taste.");
        methodeMacarons.add("Spread eggplant mixture evenly across the bottom of the prepared casserole dish; sprinkle with a few tablespoons of Parmesan cheese. Spread zucchini in an even layer over top. Lightly salt and sprinkle with a little more cheese. Continue layering in this fashion, with tomatoes, mushrooms, onion, and bell pepper, covering each layer with a sprinkling of salt and cheese.");
        methodeMacarons.add("Bake in preheated oven until vegetables are tender, about 45 minutes.");


        //recette3
        ArrayList<String> ingredientsTarte = new ArrayList<>();
        ingredientsTarte.add("3 tablespoons butter");
        ingredientsTarte.add("¾ cup white sugar");
        ingredientsTarte.add("3 large Granny Smith apples - peeled, cored, and quartered");
        ingredientsTarte.add("1 tablespoon all-purpose flour");
        ingredientsTarte.add("1  9-inch unbaked pie crust");


        ArrayList<String> methodeTarte = new ArrayList<>();
        methodeTarte.add("Preheat the oven to 425 degrees F (220 degrees C).");
        methodeTarte.add("Coat a 10-inch oven-proof skillet with butter. Sprinkle sugar evenly over the top of the butter.");
        methodeTarte.add( "Place apple quarters, rounded sides down, on top of the butter and sugar in a circular pattern.");
        methodeTarte.add("Place skillet over medium-high heat and cook until butter melts and sugar dissolves and begins to caramelize. Continue to cook until apples soften and caramel begins to brown, 10 to 12 minutes. Remove from heat.");
        methodeTarte.add("Sprinkle work surface with flour and roll pie dough into an 11-inch circle. Pinch edge to create a ruffle around crust.");
        methodeTarte.add("Place crust on top of apples and tuck in edges around apples.");
        methodeTarte.add("Bake in the preheated oven until crust is golden brown, about 20 minutes. Allow to cool for 5 minutes. Place a plate over the top of the pan and carefully invert to release tarte from the pan. Scrape any remaining apples stuck to the pan back on top of crust.");


        //recette4
        ArrayList<String> ingredientsCrepe = new ArrayList<>();
        ingredientsCrepe.add("1 cup all-purpose flour");
        ingredientsCrepe.add("2 large eggs");
        ingredientsCrepe.add("½ cup milk");
        ingredientsCrepe.add("½ cup water");
        ingredientsCrepe.add("¼ teaspoon salt");
        ingredientsCrepe.add("2 tablespoons butter, melted");

        ArrayList<String> methodeCrepe = new ArrayList<>();
        methodeCrepe.add( "Whisk flour and eggs together in a large mixing bowl; gradually add in milk and water, stirring to combine. Add salt and melted butter; beat until smooth.");
        methodeCrepe.add( "Heat a lightly oiled griddle or frying pan over medium-high heat. Pour or scoop the batter onto the griddle, using approximately 1/4 cup for each crêpe. Tilt the pan with a circular motion so that the batter coats the surface evenly.");
        methodeCrepe.add( "Cook until the top of the crêpe is no longer wet and the bottom has turned light brown, 1 to 2 minutes. Run a spatula around the edge of the skillet to loosen the crêpe; flip and cook until the other side has turned light brown, about 1 minute more. Serve hot.");

        Recette ratatouille = new Recette("Ratatouille", methodeRatatouille, ingredientsRatatouille);
        dictionnaireRecettesFrance.put("Ratatouille", ratatouille);
        Recette macarons = new Recette("Macarons", methodeMacarons, ingredientsMacarons);
        dictionnaireRecettesFrance.put("Macarons", macarons);
        Recette tarte = new Recette("Apple Tarte", methodeTarte, ingredientsTarte);
        dictionnaireRecettesFrance.put("Apple Tarte", tarte);
        Recette crepe = new Recette("Basic Crêpes", methodeCrepe, ingredientsCrepe);
        dictionnaireRecettesFrance.put("Basic Crêpes",crepe);
        return dictionnaireRecettesFrance;
    }


    public SearchFragment1(){}

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *

     * @return A new instance of fragment SearchFragment1.
     */


    public static SearchFragment1 newInstance(String selectedItem) {
        SearchFragment1 fragment = new SearchFragment1();
        Bundle args = new Bundle();
        args.putString("selectedItem", selectedItem);
        fragment.setArguments(args);
        return fragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search1, container, false);


        super.onCreate(savedInstanceState);





        // Retrieve the selected item
        //String selectedItem = getArguments().getString("selectedItem", "");

        // Use the 'view' object to find your UI elements
        image1 = view.findViewById(R.id.imageView3);
        titre_cuisine = view.findViewById(R.id.fo);
        view1 = view.findViewById(R.id.myRectangleView1);
        view2 = view.findViewById(R.id.myRectangleView2);
        view3 = view.findViewById(R.id.myRectangleView3);
        view4 = view.findViewById(R.id.myRectangleView4);
        titre_repas_1=view.findViewById(R.id.titrerepas1);
        titre_repas_2=view.findViewById(R.id.titrerepas2);
        titre_repas_3=view.findViewById(R.id.titrerepas3);
        titre_repas_4=view.findViewById(R.id.titrerepas4);
        titre_repas.add(titre_repas_1);
        titre_repas.add(titre_repas_2);
        titre_repas.add(titre_repas_3);
        titre_repas.add(titre_repas_4);
        image_reaps_1 = view.findViewById(R.id.imagerepas1);
        image_reaps_2 = view.findViewById(R.id.imagerepas2);
        image_reaps_3 = view.findViewById(R.id.imagerepas3);
        image_reaps_4 = view.findViewById(R.id.imagerepas4);
        image_repas.add(image_reaps_1);
        image_repas.add(image_reaps_2);
        image_repas.add(image_reaps_3);
        image_repas.add(image_reaps_4);


        Bundle bundle = this.getArguments();

        if(bundle!=null){
            System.out.println("1: hello");
            String selectedItem = bundle.getString("selectedItem");

            // Load JSON data from file
            strJson = getJSONFromFile("C:\\Users\\HP\\Downloads\\recipes (7).json");


            if (selectedItem != null) {
                System.out.println("2: hello");
                System.out.println(selectedItem);
                if(selectedItem.equals("Morroco")) {
                    System.out.println("3: hello");
                    int drawableResourceIdImagekitchen = R.drawable.image17; // Replace with your image resource ID
                    Drawable drawable_image17 = ContextCompat.getDrawable(requireContext(), drawableResourceIdImagekitchen);
                    image1.setImageDrawable(drawable_image17);

                    System.out.println("31: hello");

                    int drawableResourceIdImageflag = R.drawable.image18; // Replace with your image resource ID
                    Drawable drawable_image18 = ContextCompat.getDrawable(requireContext(), drawableResourceIdImageflag);
                    titre_cuisine.setBackground(drawable_image18);
                    titre_cuisine.setText("Moroccan cuisine");

                    System.out.println("32: hello");
                    int drawableResourceIdRedRectangle = R.drawable.redrectangle;
                    Drawable drawable_redrectangle = ContextCompat.getDrawable(requireContext(), drawableResourceIdRedRectangle);
                    view1.setBackground(drawable_redrectangle);

                    System.out.println("33: hello");
                    int drawableResourceIdGreenRectangle = R.drawable.greenrectangle;
                    Drawable drawable_greenrectangle = ContextCompat.getDrawable(requireContext(), drawableResourceIdGreenRectangle);
                    view2.setBackground(drawable_greenrectangle);
                    System.out.println("34: hello");

                    view3.setBackground(drawable_greenrectangle);

                    System.out.println("35: hello");
                    view4.setBackground(drawable_redrectangle);

                    try {
                        JSONParser parser = new JSONParser();
                        Object object = parser.parse(strJson);
                        JSONObject mainJsonObject = (JSONObject) object;
                        System.out.println("36: hello");
                        JSONArray jsonArrayItaly = (JSONArray) mainJsonObject.get("Morocco");
                        System.out.println("37: hello");
                        for(int i=0 ; i<4 ; i++){
                            System.out.println("38: hello");
                            JSONObject jsonObjectRecipe = (JSONObject) jsonArrayItaly.get(i);
                            String titre = (String) jsonObjectRecipe.get("title");
                            titre_repas.get(i).setText(titre);
                            System.out.println("39: hello");
                            String imageName = "morocco_image_" + (i+1);
                            int drawableResourceIdRepasImage = getResources().getIdentifier(imageName, "drawable", requireContext().getPackageName());
                            Drawable drawable_repasimage = ContextCompat.getDrawable(requireContext(), drawableResourceIdRepasImage);
                            image_repas.get(i).setImageDrawable(drawable_repasimage);
                            System.out.println("30: hello");
                        }
                    }
                    catch(Exception ex){
                        ex.printStackTrace();
                    }


                }
                else {
                    if (selectedItem.equals("Italy")) {
                        System.out.println("4: hello");
                        System.out.println(selectedItem);
                        int drawableResourceIdImageKitchen = R.drawable.italyimage2;
                        System.out.println("5: hello");// Replace with your image resource ID
                        Drawable drawable_italyimage2 = ContextCompat.getDrawable(getContext(), drawableResourceIdImageKitchen);
                        System.out.println("6: hello");
                        image1.setImageDrawable(drawable_italyimage2);


                        int drawableResourceIdImageFlag = R.drawable.italyflag; // Replace with your image resource ID
                        Drawable drawable_italyflag = ContextCompat.getDrawable(requireContext(), drawableResourceIdImageFlag);
                        titre_cuisine.setBackground(drawable_italyflag);
                        titre_cuisine.setText("Italy cuisine");
                        titre_cuisine.setTextColor(Color.parseColor("#000000"));
                        System.out.println("6: hello");

                        int drawableResourceIdRedRectangle = R.drawable.redrectangle;
                        Drawable drawable_redrectangle = ContextCompat.getDrawable(requireContext(), drawableResourceIdRedRectangle);
                        view1.setBackground(drawable_redrectangle);

                        System.out.println("7: hello");
                        int drawableResourceIdGreenRectangle = R.drawable.greenrectangle;
                        Drawable drawable_greenrectangle = ContextCompat.getDrawable(requireContext(), drawableResourceIdGreenRectangle);
                        view3.setBackground(drawable_greenrectangle);
                        System.out.println("8: hello");

                        int drawableResourceIdWhiteRectangle = R.drawable.whiterectangle;
                        Drawable drawable_whiterectangle = ContextCompat.getDrawable(requireContext(), drawableResourceIdWhiteRectangle);
                        view2.setBackground(drawable_whiterectangle);
                        System.out.println("9: hello");

                        view4.setBackground(drawable_redrectangle);
                        ArrayList<String> les_plats_italy = new ArrayList<>();
                        les_plats_italy.add("Panettone");
                        les_plats_italy.add("Pasta e Ceci");
                        les_plats_italy.add("Grilled Pizza");
                        les_plats_italy.add("Italian BLT");
                        for(int i=0 ; i<4 ; i++){
                            Recette recette = DictionnaireDeRecettesItaly().get(les_plats_italy.get(i));
                            System.out.println("11: hello");
                            String titre = recette.getTitre();
                            titre_repas.get(i).setText(titre);

                            String imageName = "italy_image_" + (i+1);
                            System.out.println("12: hello");
                            int drawableResourceIdRepasImage = getResources().getIdentifier(imageName, "drawable", requireContext().getPackageName());
                            Drawable drawable_repasimage = ContextCompat.getDrawable(requireContext(), drawableResourceIdRepasImage);
                            image_repas.get(i).setImageDrawable(drawable_repasimage);



                        }

                    }
                    else {
                        if(selectedItem.equals("France")) {
                            System.out.println("5: hello");
                            int drawableResourceIdImageKitchen = R.drawable.franshimage2; // Replace with your image resource ID
                            Drawable drawable_frenshimage2 = ContextCompat.getDrawable(requireContext(), drawableResourceIdImageKitchen);
                            image1.setImageDrawable(drawable_frenshimage2);



                            int drawableResourceIdImageFlag = R.drawable.frenshflag; // Replace with your image resource ID
                            Drawable drawable_frenshflag = ContextCompat.getDrawable(requireContext(), drawableResourceIdImageFlag);
                            titre_cuisine.setBackground(drawable_frenshflag);
                            titre_cuisine.setText("Fransh cuisine");
                            titre_cuisine.setTextColor(Color.parseColor("#000000"));


                            int drawableResourceIdRedRectangle = R.drawable.redrectangle;
                            Drawable drawable_redrectangle = ContextCompat.getDrawable(requireContext(), drawableResourceIdRedRectangle);
                            view1.setBackground(drawable_redrectangle);


                            int drawableResourceIdBlueRectangle = R.drawable.bluerectangle;
                            Drawable drawable_bluerectangle = ContextCompat.getDrawable(requireContext(), drawableResourceIdBlueRectangle);
                            view2.setBackground(drawable_bluerectangle);


                            int drawableResourceIdWhiteRectangle = R.drawable.whiterectangle;
                            Drawable drawable_whiterectangle = ContextCompat.getDrawable(requireContext(), drawableResourceIdWhiteRectangle);
                            view3.setBackground(drawable_whiterectangle);


                            view4.setBackground(drawable_redrectangle);
                            System.out.println("6");

                            ArrayList<String> les_plats_france = new ArrayList<>();
                            les_plats_france.add("Ratatouille");
                            les_plats_france.add("Macarons");
                            les_plats_france.add("Apple Tarte");
                            les_plats_france.add("Basic Crêpes");
                            System.out.println("7");
                                for(int i=0 ; i<4 ; i++){

                                    Recette recette = DictionnaireDeRecettesFrance().get(les_plats_france.get(i));
                                    String titre = recette.getTitre();
                                    titre_repas.get(i).setText(titre);


                                    String imageName = "frensh_image_" + (i+1);
                                    int drawableResourceIdRepasImage = getResources().getIdentifier(imageName, "drawable", requireContext().getPackageName());
                                    Drawable drawable_repasimage = ContextCompat.getDrawable(requireContext(), drawableResourceIdRepasImage);
                                    image_repas.get(i).setImageDrawable(drawable_repasimage);

                                }
                        }
                    }
                }
            }
        }
        titre_repas_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                navigateToSearchFragment2();
            }
        });
        titre_repas_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                navigateToSearchFragment2();
            }
        });
        titre_repas_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                navigateToSearchFragment2();
            }
        });
        titre_repas_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                navigateToSearchFragment2();
            }
        });



        // Use the selected item as needed in your SearchFragment1

        return view;
    }

    private void navigateToSearchFragment2() {
        Activity activity = getActivity();
        if (getActivity() instanceof MainActivity) {
            ((MainActivity) getActivity()).clearBackStack();
            ((MainActivity) getActivity()).navigateToSearchFragment2();
        }
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
}