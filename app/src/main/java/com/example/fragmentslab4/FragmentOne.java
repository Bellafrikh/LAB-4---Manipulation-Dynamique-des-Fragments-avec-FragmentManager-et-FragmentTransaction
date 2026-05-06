package com.example.fragmentslab4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentOne extends Fragment {

    private TextView labelMessage;
    private Button boutonInteraction;

    public FragmentOne() {
        // Constructeur qui lie directement le layout (plus moderne et propre)
        super(R.layout.fragment_one);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Initialisation humaine des composants
        labelMessage = view.findViewById(R.id.textOne);
        boutonInteraction = view.findViewById(R.id.btnHello);

        configurerActions();
    }

    private void configurerActions() {
        boutonInteraction.setOnClickListener(v -> {
            String messageBienvenue = "Le contenu a été mis à jour par l'utilisateur !";
            labelMessage.setText(messageBienvenue);
        });
    }
}