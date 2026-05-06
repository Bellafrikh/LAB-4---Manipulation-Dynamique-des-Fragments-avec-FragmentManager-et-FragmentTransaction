package com.example.fragmentslab4;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Variables nommées selon leur rôle dans l'application
    private Button boutonAllerVersPremier;
    private Button boutonAllerVersSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialiserInterface();

        // Afficher le fragment initial uniquement lors du premier lancement
        if (savedInstanceState == null) {
            afficherFragment(new FragmentOne());
        }
    }

    private void initialiserInterface() {
        boutonAllerVersPremier = findViewById(R.id.btnShowFragment1);
        boutonAllerVersSecond = findViewById(R.id.btnShowFragment2);

        // On définit les comportements au clic
        boutonAllerVersPremier.setOnClickListener(v -> afficherFragment(new FragmentOne()));
        boutonAllerVersSecond.setOnClickListener(v -> afficherFragment(new FragmentTwo()));
    }

    /**
     * Gère la transition entre les vues de manière propre.
     * On utilise le remplacement pour libérer la mémoire des anciens fragments.
     */
    private void afficherFragment(Fragment fragmentCible) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragmentCible)
                // .addToBackStack(null) // Optionnel : permet de revenir en arrière avec le bouton retour
                .commit();
    }
}