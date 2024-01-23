# Projet Jeux de plateaux : <br> Bibliothèque de jeux

## Modalités :

- Toute cette partie est à réaliser en binôme
- La durée estimée de cette partie est de 2 jours environ

## Objectifs pédagogiques :

- Mise en place d’une architecture logicielle permettant d’inclure efficacement les nouveaux jeux de plateau dans cette bibliothèque de jeux.

## Objectifs pratiques :

- Inclure deux nouveaux jeux dans notre bibliothèque de jeux : une variante du Gomoku, ainsi qu’un Puissance 4.

## **Iteration 1** – Hiérarchie de classe / Restructuration de notre code.

**Deux ressources utiles avant de commencer :**

- Les classes abstraites en Java :
  - https://www.w3schools.com/java/java_abstract.asp
  - https://www.programiz.com/java-programming/abstract-classes-methods

**Objectif de l’itération :**

- Restructurer notre code de manière à pouvoir ajouter facilement de nouveaux jeux dans la bibliothèque de jeux disponibles.

**Cahier des charges :**

- Créer une classe abstraite BoardGame dont héritent le TicTacToe, le Gomoku et le Puissance 4.
- Analyser en binôme les parties du code que vous pouvez rendre communes entre les différents jeux. Par exemple, le fait qu’il y ait un attribut Player[] ou encore la méthode getMoveFromPlayer
- Commencez également à organiser votre code en package : 
  - https://www.w3schools.com/java/java_packages.asp
- Organisez-vous de manière à pouvoir travailler en équipe : créez (et utilisez!) un répertoire sur GitHub.
  - N’oubliez pas de remplir le fichier .gitignore afin de ne pas faire passer les configurations des IDE dans le dépôt.

## **Iteration 2** – Bibliothèque de jeux

**Cahier des charges :**

- Implémenter le jeu du Gomoku et le Puissance 4.
- Réfléchissez à comment vous allez travailler en binôme :
  - Répartition des tâches ?
  - Peer programming ?
  
**Règles du Gomoku (variante) :**
- Le gomoku se joue sur une grille de 15x15 cases.
- Les joueurs jouent à tour de rôle en plaçant leur pierre de couleur sur les cases de la grille.
- Le but du jeu est de créer une suite alignée de cinq pierres de sa couleur : horizontalement, verticalement ou en diagonale.
- Si un joueur réussit à placer cinq pierres en alignement, il a gagné la partie.
- Si la grille est pleine sans qu'aucun joueur n'ait réussi à aligner cinq pierres, la partie est déclarée nulle.
  
**Règles du Puissance 4 :**

- Le Puissance 4 se joue sur une grille verticale de 6 rangées et 7 colonnes.
- Les joueurs jouent à tour de rôle en plaçant leur jeton de couleur dans une des colonnes de la grille.
- Les jetons tombent jusqu'à ce qu'ils atteignent le fond de la grille ou qu'ils rencontrent un autre jeton.
- Le but du jeu est d'aligner quatre jetons de sa couleur horizontalement, verticalement ou en diagonale.
- Si un joueur réussit à aligner quatre jetons de sa couleur, il a gagné la partie.
- Si la grille est pleine sans qu'aucun joueur n'ait réussi à aligner quatre jetons, la partie est déclarée nulle.