# LAB-4---Manipulation-Dynamique-des-Fragments-avec-FragmentManager-et-FragmentTransaction
**Auteur :** Zaynab Bellafrikh (4IIR-G2)  
**Institution :** EMSI - École Marocaine des Sciences de l'Ingénieur

##  Présentation
Ce projet est une application Android pédagogique démontrant l'utilisation des **Fragments**. L'objectif est de comprendre comment diviser une interface utilisateur en plusieurs parties réutilisables et comment naviguer entre elles dynamiquement au sein d'une seule activité (`MainActivity`).

##  Fonctionnalités
- **Navigation Dynamique** : Basculement entre deux fragments sans changer d'activité.
- **Gestion du Cycle de Vie** : Utilisation correcte des méthodes de cycle de vie (`onViewCreated`, `onResume`, etc.).
- **Optimisation de la Mémoire** : Utilisation de `replace()` pour économiser les ressources système.
- **Design Modulaire** : Séparation claire entre la logique de navigation et le contenu des écrans.

##  Structure du Projet

### 1. MainActivity (Le Contrôleur)
La `MainActivity` sert de conteneur principal. Elle gère la barre de navigation (les boutons en haut) et le remplacement du contenu dans le `fragment_container`.

### 2. Fragments (Les Écrans)
- **FragmentOne** : Affiche un message de bienvenue et contient un bouton interactif qui modifie le texte localement.
- **FragmentTwo** : Un second écran plus simple pour démontrer la transition fluide.

### 3. Layouts (L'Interface)
- `activity_main.xml` : Structure verticale avec une zone de boutons et un `FrameLayout` pour le contenu dynamique.
- `fragment_one.xml` & `fragment_two.xml` : Designs spécifiques à chaque fragment.

##  Corrections et Améliorations (Refactoring)
Dans ce Lab, nous avons apporté les corrections suivantes pour rendre le code plus **"humain"** et robuste :

1. **Variables Explicites** : Remplacement des noms génériques (ex: `btn1`, `tv`) par des noms descriptifs (`boutonNavigationUn`, `labelMessage`).
2. **Synchronisation XML/Java** : Correction des erreurs d'ID (`btnShowFragment1`) pour assurer la liaison entre le design et le code.
3. **Méthode de Remplacement Unique** : Centralisation de la logique de changement de fragment dans une seule méthode pour éviter la duplication de code.
4. **Correction du Package** : Alignement du nom du package sur la structure réelle du dossier (`com.example.fragmentslab4`).

<img width="307" height="637" alt="image" src="https://github.com/user-attachments/assets/4cd54a6d-7727-40a2-a397-0688d7435bf8" />

<img width="302" height="642" alt="image" src="https://github.com/user-attachments/assets/5e9ba104-aa4a-4800-9002-0a81a7840369" />

<img width="288" height="625" alt="image" src="https://github.com/user-attachments/assets/c2d8fd5d-e844-4ae5-b86c-a627820ecb91" />

---
*Réalisé dans le cadre du Lab 4 - Développement Mobile.*
