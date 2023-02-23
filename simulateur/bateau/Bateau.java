package simulateur.bateau;

public class Bateau {

    private String nom;
    private double milesParcourus;
    private static int nombreBateauConstruits;

    public static int getNombreBateauConstruits() {
        return nombreBateauConstruits;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean prendLaMer() {
        return true;
    }

    public void navigue(double miles) {
        System.out.println("bateau navigue " + nom);
        milesParcourus = milesParcourus + miles;
    }

    public void arriveAuPort() {
        System.out.println("bateau arrive au port et nombre de miles parcourus est " + milesParcourus);
        milesParcourus = 0;
    }

}