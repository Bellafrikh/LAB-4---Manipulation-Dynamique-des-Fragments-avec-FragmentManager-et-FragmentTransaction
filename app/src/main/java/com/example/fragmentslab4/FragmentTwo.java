package com.example.fragmentslab4;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentTwo extends Fragment {

    private TextView labelStatus;

    public FragmentTwo() {
        super(R.layout.fragment_two);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        labelStatus = view.findViewById(R.id.textTwo);

        // Valeur dynamique pour simuler une application réelle
        initialiserDonnees();
    }

    private void initialiserDonnees() {
        labelStatus.setText("Navigation réussie : Vous êtes sur le second écran.");
    }
}