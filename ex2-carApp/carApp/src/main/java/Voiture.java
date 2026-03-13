public class Voiture {
    /**
     * Modèle de la voiture.
     */
    private String modele;
    /**
     * Couleur de la voiture.
     */
    private String couleur;
    /**
     * Vitesse de la voiture.
     */
    private int vitesse;

    /**
     * Constructeur de la voiture.
     * @param model
     * @param color
     */
    public Voiture(final String model, final String color) {
        this.modele = model;
        this.couleur = color;
        this.vitesse = 0;
    }

    /**
     * Récupère la vitesse de la voiture.
     * @return int
     */
    public int getVitesse() {
        return this.vitesse;
    }

    /**
     * Accélère la voiture.
     */
    public void accelerer() {
        final int incr = 10;
        final int vitesseMax = 120;

        if (vitesse + incr <= vitesseMax) {
            vitesse += incr;
            // afficher détails
            System.out.println("Modèle : " + modele);
            System.out.println("Couleur : " + couleur);
            System.out.println("Vitesse actuelle : " + vitesse);
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    /**
     * Ralentis la voiture.
     */
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

