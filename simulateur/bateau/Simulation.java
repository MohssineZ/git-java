package simulateur.bateau;

public class Simulation {
    public static void main(String[] args) {
        Bateau monBateau = new Bateau();
        Bateau monBateau2 = new Bateau();
        monBateau.setNom("le titanic");
        monBateau.prendLaMer();
        monBateau.navigue(500);
        monBateau.navigue(120);
        // monBateau.arriveAuPort();
        monBateau.prendLaMer();
        monBateau.navigue(120);
        monBateau.arriveAuPort();
        monBateau2.setNom("le titanic 2");
        monBateau2.prendLaMer();
        monBateau2.navigue(500);
        monBateau2.arriveAuPort();
        monBateau2.prendLaMer();
        monBateau2.navigue(120);
        monBateau2.arriveAuPort();

    }
}
