package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.myapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;


    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.home) {
                replaceFragment(new HomeFragment());
            } else if (itemId == R.id.search) {
                replaceFragment(new SearchFragment());
            } else if (itemId == R.id.favoris) {
                replaceFragment(new FavorisFragment());
            } else if (itemId == R.id.profile) {
                replaceFragment(new ProfileFragment());
            }

            return true ;
        });
    }

    public void clearBackStack() {
        FragmentManager manager = getSupportFragmentManager();
        if (manager.getBackStackEntryCount() > 0) {
            FragmentManager.BackStackEntry first = manager.getBackStackEntryAt(0);
            manager.popBackStack(first.getId(), FragmentManager.POP_BACK_STACK_INCLUSIVE);
        }
    }
    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }
    private void loadProfileFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainer, new ProfileFragment())
                .commit();
    }

    public void openEditProfileFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainer, new EditProfileFragment())
                .addToBackStack(null)
                .commit();
    }





    public void saveProfileInformation(String newName, String newEmail, String newPassword) {
        // Logique pour sauvegarder les informations modifiées
        // ...

        // Retournez au fragment de profil
        navigateBack();
    }

    public void navigateBack() {
        // Retournez au fragment précédent
        getSupportFragmentManager().popBackStack();
    }

    // Method to navigate to SearchFragment1
    public void navigateToSearchFragment1(String selectedItem) {
        Bundle bundle = new Bundle();
        bundle.putString("selectedItem", selectedItem);
        Fragment fragment = new SearchFragment1();
        fragment.setArguments(bundle);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainer, fragment)
                .commit();
    }

    public void navigateToSearchFragment2() {
        Fragment fragment = new SearchFragment2();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer, fragment);
        fragmentTransaction.commit();
    }
    public void navigateToHomeFragment1() {
        Fragment fragment = new HomeFragment1();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer, fragment);
        fragmentTransaction.commit();
    }
    public void navigateToHomeFragment2() {
        Fragment fragment = new HomeFragment2();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer, fragment);
        fragmentTransaction.commit();
    }
    public void navigateToHomeFragment3() {
        Fragment fragment = new HomeFragment3();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer, fragment);
        fragmentTransaction.commit();
    }
}