# Space Invaders

## Rapport (dernière actualisation le 04/05)

### Sprints et fonctionnalités réalisées

#### Fonctionnalité n°1 : Déplacer un vaisseau dans l'espace de jeu.

- Story n°1 : 
Créer un espace de jeu. Un espace de jeu est créé aux dimensions données (2D). Cet espace de jeu est vide.

- Story n°2 : 
Positionner un nouveau vaisseau dans l’espace de jeu. Un nouveau vaisseau est créé. Le vaisseau est positionné aux coordonnées transmises. Si un nouveau vaisseau essaye d’être positionné en dehors des limites de l’espace jeu, alors une exception devra être levée. Contraintes : La position souhaitée est transmise par ses coordonnées x et y. Le coin supérieur gauche de l’espace jeu (point en haut à gauche) a pour coordonnées (0,0) La taille du vaisseau est réduite pour l'instant à son minimum (1 seul point).

### Fonctionnalité en cours d’implémentation :
Aucune

### Diagramme de classes :
![image](https://user-images.githubusercontent.com/82202487/117062168-6848e380-ad23-11eb-94e0-690379511157.png)


### Nuage de mots :

![image](https://user-images.githubusercontent.com/82202487/117066215-bf9d8280-ad28-11eb-9ce7-e0b86cea5d78.png)

### Difficultés rencontrées :
Aucune

### Remarques diverses
Pour pouvoir, mettre en place les tests, il a été nécessaire d’ajouter une fonctionnalité supplémentaire qui permet de représenter l’espace de jeu dans une chaîne ASCII.

## Glossaire
- Vaisseau : véhicule commandé par le joueur, pouvant se déplacer de droite à gauche et ayant la possibilité de lancer des missiles destinés à détruire le(s) envahisseurs.

- Envahisseur : ennemi qui apparaît à l'écran, se déplace automatiquement et qui doit être détruit par un missile lancé depuis le vaisseau du joueur.

- Missile : projectile envoyé à la verticale par le vaisseau vers l'envahisseur dans le but de le détruire.

La définition des termes métiers relatifs au projet doit se trouver dans le glossaire Ce glossaire doit être compléter au fil des séances...
