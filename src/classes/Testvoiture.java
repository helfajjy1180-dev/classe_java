package classes;

public class Testvoiture {

   public static void main(String[] args) {

        // TEST 1 : Constructeur par défaut
        System.out.println("===== TEST 1 : Constructeur par défaut =====");
        Voiture voiture1 = new Voiture();
        voiture1.afficherInformations();

        // TEST 2 : Constructeur avec paramètres
        System.out.println("\n===== TEST 2 : Constructeur avec paramètres =====");
        Voiture voiture2 = new Voiture("Toyota", "Corolla", 0, 2022);
        voiture2.afficherInformations();

        // TEST 3 : Constructeur de copie
        System.out.println("\n===== TEST 3 : Constructeur de copie =====");
        Voiture voiture3 = new Voiture(voiture2);
        voiture3.afficherInformations();

        // TEST 4 : Comparaison des objets
        System.out.println("\n===== TEST 4 : Comparaison =====");
        System.out.println("voiture2 == voiture3 : " + (voiture2 == voiture3));
        System.out.println("Même marque et modèle : "
                + voiture2.compareAvec(voiture3));

        // TEST 5 : Accélération
        System.out.println("\n===== TEST 5 : Accélération =====");
        voiture2.accelerer(120);
        voiture2.afficherInformations();

        // TEST 6 : Freinage
        System.out.println("\n===== TEST 6 : Freinage =====");
        voiture2.freiner(30);
        voiture2.afficherInformations();

        // TEST 7 : Indépendance de la copie
        System.out.println("\n===== TEST 7 : Indépendance de la copie =====");
        voiture3.accelerer(80);
        System.out.println("Voiture 2 :");
        voiture2.afficherInformations();
        System.out.println("Voiture 3 :");
        voiture3.afficherInformations();

        // TEST 8 : Valeurs invalides dans les setters
        System.out.println("\n===== TEST 8 : Valeurs invalides =====");
        voiture2.setVitesse(-50);
        voiture2.setAnnee(1800);
        voiture2.setMarque("   ");
        voiture2.setModele(null);
        voiture2.afficherInformations();

        // TEST 9 : Accélération invalide
        System.out.println("\n===== TEST 9 : Accélération invalide =====");
        voiture2.accelerer(-10);

        // TEST 10 : Freinage invalide
        System.out.println("\n===== TEST 10 : Freinage invalide =====");
        voiture2.freiner(-20);

        // TEST 11 : Freinage supérieur à la vitesse
        System.out.println("\n===== TEST 11 : Freinage excessif =====");
        voiture2.setVitesse(20);
        voiture2.freiner(50);
        voiture2.afficherInformations();

        // TEST 12 : Vitesse nulle et valeurs limites
        System.out.println("\n===== TEST 12 : Valeurs limites =====");
        voiture2.setVitesse(0);
        voiture2.afficherInformations();
        voiture2.setAnnee(1885);
        voiture2.setAnnee(java.time.Year.now().getValue() + 1);

        // TEST 13 : Consommation estimée
        System.out.println("\n===== TEST 13 : Consommation =====");
        System.out.println("Consommation estimée : "
                + voiture2.calculerConsommation());

    }
}

