public class Application {
    public static void main(final String[] args) {
        final int ageConducteur = 20;
        final int vitesseVoitureApresAcceleration = 80;
        final int vitesseVoitureApresRalentissement = 30;

        Voiture maVoiture = new Voiture("Sedan", "Bleu");
        Conducteur moi = new Conducteur("John", ageConducteur);

        moi.demarrerVoiture(maVoiture);
        maVoiture.accelerer();
        moi.changerVitesse(maVoiture, vitesseVoitureApresAcceleration);
        maVoiture.ralentir();
        moi.changerVitesse(maVoiture, vitesseVoitureApresRalentissement);
        moi.arreterVoiture(maVoiture);
        System.out.println("fini");
    }
}
