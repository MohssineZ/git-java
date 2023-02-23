package simulateur.bateau;

public class Simulation {
    public static void main(String[] args) {
        Bateau monBateau = new Bateau("titanic");
        Coque maCoque = new Coque(5);
        Coque maCoque2 = new Coque(3);
        monBateau.setcoque(maCoque);
        System.out.println(
                "points de vie de mon bateau " + monBateau.getNom() + " : " + monBateau.getcoque().getPointDeVie());
        monBateau.prendLaMer();
        monBateau.navigue(500);
        monBateau.prendLaMer();
        monBateau.navigue(120);
        monBateau.arriveAuPort();
        Bateau monBateau2 = new Bateau("titanic2");
        monBateau2.setcoque(maCoque2);
        System.out.println(
                "points de vie de mon bateau " + monBateau2.getNom() + " : " + monBateau2.getcoque().getPointDeVie());
        monBateau2.prendLaMer();
        monBateau2.navigue(500);
        monBateau2.arriveAuPort();
        monBateau2.prendLaMer();
        monBateau2.navigue(120);
        monBateau2.arriveAuPort();
        System.out.println("nombre de bateau construit: " + Bateau.getNombreBateauConstruits());

    }
}
