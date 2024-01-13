package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.material.textfield.TextInputEditText;
import androidx.fragment.app.Fragment;

public class EditProfileFragment extends Fragment {

    private TextInputEditText newNameEditText;
    private TextInputEditText newEmailEditText;
    private TextInputEditText newPasswordEditText;

    public EditProfileFragment() {
        // Constructeur par défaut requis
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_edit_profile, container, false);

        newNameEditText = view.findViewById(R.id.newNameEditText);
        newEmailEditText = view.findViewById(R.id.newEmailEditText);
        newPasswordEditText = view.findViewById(R.id.newPasswordEditText);

        Button saveChangesButton = view.findViewById(R.id.saveChangesButton);
        saveChangesButton.setOnClickListener(v -> onSaveChangesClicked());

        Button cancelButton = view.findViewById(R.id.cancelButton);
        cancelButton.setOnClickListener(v -> onCancelClicked());

        return view;
    }

    private void onSaveChangesClicked() {
        // Obtenez les nouvelles informations depuis les champs d'édition
        String newName = newNameEditText.getText().toString();
        String newEmail = newEmailEditText.getText().toString();
        String newPassword = newPasswordEditText.getText().toString();

        // Appelez la méthode de sauvegarde dans l'activité principale
        if (getActivity() instanceof MainActivity) {
            ((MainActivity) getActivity()).saveProfileInformation(newName, newEmail, newPassword);
        }
    }

    private void onCancelClicked() {
        // Retournez au fragment de profil
        if (getActivity() instanceof MainActivity) {
            ((MainActivity) getActivity()).navigateBack();
        }
    }
}