package simulateur.bateau;

public class Bateau {

    private final String nom;
    private double milesParcourus;
    private static int nombreBateauConstruits;
    private Coque coque;

    public Bateau(String nom) {
        this.nom = nom;
        nombreBateauConstruits++;
    }

    public static int getNombreBateauConstruits() {
        return nombreBateauConstruits;
    }

    public String getNom() {
        return nom;
    }

    public boolean prendLaMer() {
        return true;
    }

    public void navigue(double miles) {
        System.out.println(this.nom + " navigue ");
        milesParcourus = milesParcourus + miles;
    }

    public void arriveAuPort() {
        System.out.println(this.nom + " arrive au port et nombre de miles parcourus est " + milesParcourus);
        milesParcourus = 0;
    }

    public Coque getcoque() {
        return coque;
    }

    public void setcoque(Coque coque) {
        this.coque = coque;
    }

}