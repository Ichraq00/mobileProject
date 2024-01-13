package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.material.button.MaterialButton;

public class ProfileFragment extends Fragment {

    public ProfileFragment() {
        // Constructeur par défaut requis
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        MaterialButton editButton = view.findViewById(R.id.editButton);
        editButton.setOnClickListener(v -> openEditProfileFragment());

        // Ajoutez du code pour afficher les informations de l'utilisateur (nom, email) ici

        return view;
    }

    private void openEditProfileFragment() {
        if (getActivity() instanceof MainActivity) {
            ((MainActivity) getActivity()).openEditProfileFragment();
        }
    }
}