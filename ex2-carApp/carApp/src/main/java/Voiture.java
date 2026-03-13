public class Voiture {
    private String modele;
    private String couleur;
    private int vitesse;

    public Voiture(String model, String color) {
        this.modele = model;
        this.couleur = color;
        this.vitesse = 0;
    }

    public int getVitesse() {
        return this.vitesse;
    }

    public void accelerer() {
        final int incr = 10;
        if (vitesse + incr <= 120) {
            vitesse += incr;
            // afficher détails
            System.out.println("Modèle : " + modele);
            System.out.println("Couleur : " + couleur);
            System.out.println("Vitesse actuelle : " + vitesse);
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void ralentir() {
        final int incr = 10;
        if (vitesse - incr >= 0) {
            vitesse -= incr;
            // afficher détails
            System.out.println("Modèle : " + modele);
            System.out.println("Couleur : " + couleur);
            System.out.println("Vitesse actuelle : " + vitesse);
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }
}

