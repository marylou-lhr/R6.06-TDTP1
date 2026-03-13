public class Conducteur {
    /**
     * Nom du conducteur.
     */
    private String nom;
    /**
     * Âge du conducteur.
     */
    private int age;

    /**
     * Constructeur d'un conducteur.
     * @param name
     * @param years
     */
    public Conducteur(final String name, final int years) {
        this.nom = name;
        this.age = years;
    }

    /**
     * Retourne si oui ou non le conducteur est adulte.
     * @return true false
     */
    public boolean estAdulte() {
        final int ageAdulte = 18;
        return age >= ageAdulte;
    }

    /**
     * Démarre la voiture.
     * @param voiture
     */
    public void demarrerVoiture(final Voiture voiture) {
        if (estAdulte()) {
            System.out.println(nom + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    /**
     * Arrête la voiture.
     * @param voiture
     */
    public void arreterVoiture(final Voiture voiture) {
        System.out.println(nom + " arrête la voiture.");
    }

    /**
     * Change la vitesse actuelle à une vitesse donnée.
     * @param voiture
     * @param nouvelleVitesse
     */
    public void changerVitesse(final Voiture voiture, final int nouvelleVitesse) {
        System.out.println(nom + " change la vitesse de la voiture à " + nouvelleVitesse);
        int vitesseActuelle;
        if (voiture.getVitesse() >= nouvelleVitesse) {
            while (voiture.getVitesse() > nouvelleVitesse) {
                voiture.ralentir();
            }
        } else  {
            while (voiture.getVitesse() < nouvelleVitesse) {
                voiture.accelerer();
            }
        }
    }
}
