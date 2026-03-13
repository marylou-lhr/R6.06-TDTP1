public class Application {
    public static void main(String[] args) {
        final int age_conducteur = 20;
        final int vitesse_voiture1 = 80;
        final int vitesse_voiture2 = 80;
        final int age_conducteur = 20;

        Voiture maVoiture = new Voiture("Sedan", "Bleu");
        Conducteur moi = new Conducteur("John", age_conducteur);

        moi.demarrerVoiture(maVoiture);
        maVoiture.accelerer();
        moi.changerVitesse(maVoiture, vitesse_voiture1);
        maVoiture.ralentir();
        moi.changerVitesse(maVoiture, vitesse_voiture2);
        moi.arreterVoiture(maVoiture);
        System.out.println("fini");
    }
}
