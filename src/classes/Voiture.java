package classes;

public class Voiture {

    private String marque;
    private String modele;
    private double vitesse;
    private int annee;

    // Constructeur par défaut
    public Voiture() {
        marque = "Inconnue";
        modele = "Standard";
        vitesse = 0.0;
        annee = 2024;

        System.out.println("Constructeur par défaut appelé.");
    }

    // Constructeur avec paramètres
    public Voiture(String marque, String modele, double vitesse, int annee) {
        this.marque = "Inconnue";
        this.modele = "Standard";
        this.vitesse = 0.0;
        this.annee = 2024;

        setMarque(marque);
        setModele(modele);
        setVitesse(vitesse);
        setAnnee(annee);

        System.out.println("Constructeur avec paramètres appelé.");
    }

    // Constructeur de copie
    public Voiture(Voiture autreVoiture) {
        this.marque = autreVoiture.marque;
        this.modele = autreVoiture.modele;
        this.vitesse = autreVoiture.vitesse;
        this.annee = autreVoiture.annee;

        System.out.println("Constructeur de copie appelé.");
    }

    // Getters
    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public double getVitesse() {
        return vitesse;
    }

    public int getAnnee() {
        return annee;
    }

    // Setters avec validation
    public void setMarque(String marque) {
        if (marque != null && !marque.trim().isEmpty()) {
            this.marque = marque;
        } else {
            System.out.println("Erreur : marque invalide.");
        }
    }

    public void setModele(String modele) {
        if (modele != null && !modele.trim().isEmpty()) {
            this.modele = modele;
        } else {
            System.out.println("Erreur : modèle invalide.");
        }
    }

    public void setVitesse(double vitesse) {
        if (vitesse >= 0) {
            this.vitesse = vitesse;
        } else {
            System.out.println("Erreur : la vitesse doit être positive ou nulle.");
        }
    }

    public void setAnnee(int annee) {
        int anneeActuelle = java.time.Year.now().getValue();

        if (annee > 1885 && annee <= anneeActuelle) {
            this.annee = annee;
        } else {
            System.out.println("Erreur : année invalide.");
        }
    }

    // Accélérer
    public void accelerer(double augmentation) {
        if (augmentation > 0) {
            vitesse += augmentation;
            System.out.println("Nouvelle vitesse : " + vitesse + " km/h");
        } else {
            System.out.println("Erreur : l'augmentation doit être positive.");
        }
    }

    // Freiner
    public void freiner(double reduction) {
        if (reduction > 0) {
            vitesse -= reduction;

            if (vitesse < 0) {
                vitesse = 0;
                System.out.println("La voiture est arrêtée.");
            } else {
                System.out.println("Nouvelle vitesse : " + vitesse + " km/h");
            }
        } else {
            System.out.println("Erreur : la réduction doit être positive.");
        }
    }

    // Afficher les informations
    public void afficherInformations() {
        System.out.println("Marque : " + marque);
        System.out.println("Modèle : " + modele);
        System.out.println("Vitesse : " + vitesse + " km/h");
        System.out.println("Année : " + annee);
    }

    // Comparer deux voitures
    public boolean compareAvec(Voiture autre) {
        return this.marque.equals(autre.marque)
                && this.modele.equals(autre.modele);
    }

    // Estimation simple de la consommation
    public double calculerConsommation() {
        return 5 + (vitesse * 0.02);
    }
}

