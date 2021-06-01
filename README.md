# Space Invaders

## Rapport (dernière actualisation le 01/06)

### Sprints et fonctionnalités réalisées

#### Fonctionnalité n°1 : Déplacer un vaisseau dans l'espace de jeu.

- Story n°1 : 
Créer un espace de jeu. Un espace de jeu est créé aux dimensions données (2D). Cet espace de jeu est vide.

- Story n°2 : 
Positionner un nouveau vaisseau dans l’espace de jeu. Un nouveau vaisseau est créé. Le vaisseau est positionné aux coordonnées transmises. Si un nouveau vaisseau essaye d’être positionné en dehors des limites de l’espace jeu, alors une exception devra être levée. Contraintes : La position souhaitée est transmise par ses coordonnées x et y. Le coin supérieur gauche de l’espace jeu (point en haut à gauche) a pour coordonnées (0,0) La taille du vaisseau est réduite pour l'instant à son minimum (1 seul point).

- Story n°3 : 
Déplacer le vaisseau vers la droite dans l'espace de jeu
Le vaisseau se déplace d'un pas vers la droite Si le vaisseau se trouve sur la bordure droite de l'espace de jeu, le vaisseau doit rester immobile (aucun déplacement, aucune exception levée : le vaisseau reste juste à sa position actuelle).

- Story n°4 : 
Déplacer le vaisseau vers la gauche dans l'espace de jeu. Le vaisseau se déplace d'un pas vers la gauche. Si le vaisseau se trouve sur la bordure gauche de l'espace de jeu, le vaisseau doit rester immobile (aucun déplacement, aucune exception levée : le vaisseau reste juste à sa position actuelle).

### Fonctionnalité n°2 : Dimensionner le vaisseau

- Story n°1 :
Positionner un nouveau vaisseau avec une dimension donnée. Donner une dimension au vaisseau lors de sa création reviend à ajouter un nouveau comportement à l'application existante.

- Story n°2 :
Faire en sorte qu'il soit impossible de positionner un nouveau vaisseau qui déborde de l'espace de jeu. Lever une exception si pour une une position (x,y) donnée, un vaisseau déborde de l'espace de jeu (c-a-d en sort partiellement).

- Story n°3 :
Déplacer un vaisseau vers la droite en tenant compte de sa dimension en examinant le cas normal et le cas limite.

- Story n°4 :
Déplacer un vaisseau vers la gauche en tenant compte de sa dimension en examinant le cas normal et le cas limite.

### Fonctionnalité en cours d’implémentation :
Aucune

### Diagramme de classes :
![image](https://user-images.githubusercontent.com/82202487/119581703-5fe44580-bdc3-11eb-9e6a-637125b2c63e.png))


### Nuage de mots :

![image](https://user-images.githubusercontent.com/82202487/119581932-e4cf5f00-bdc3-11eb-9c9b-4e7b8506d18f.png)

### Difficultés rencontrées :
Aucune

### Remarques diverses
Pour pouvoir, mettre en place les tests, il a été nécessaire d’ajouter une fonctionnalité supplémentaire qui permet de représenter l’espace de jeu dans une chaîne ASCII.

## Glossaire
- Vaisseau : véhicule commandé par le joueur, pouvant se déplacer de droite à gauche et ayant la possibilité de lancer des missiles destinés à détruire le(s) envahisseurs.

- Envahisseur : ennemi qui apparaît à l'écran, se déplace automatiquement et qui doit être détruit par un missile lancé depuis le vaisseau du joueur.

- Missile : projectile envoyé à la verticale par le vaisseau vers l'envahisseur dans le but de le détruire.

La définition des termes métiers relatifs au projet doit se trouver dans le glossaire Ce glossaire doit être compléter au fil des séances...
