public class Conducteur {
    private String nom;
    private int age;

    public Conducteur(final String name, final int years) {
        this.nom = name;
        this.age = years;
    }

    public boolean estAdulte() {
        final int ageAdulte = 18;
        return age >= ageAdulte;
    }

    public void demarrerVoiture(final Voiture voiture) {
        if (estAdulte()) {
            System.out.println(nom + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    public void arreterVoiture(final Voiture voiture) {
        System.out.println(nom + " arrête la voiture.");
    }

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
