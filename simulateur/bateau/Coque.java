package simulateur.bateau;

public class Coque {
    private int pointDeVie;
    private int pointDeVieMax;

    public int getPointDeVie() {
        return pointDeVie;
    }

    public void setPointDeVie(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    public int getPointDeVieMax() {
        return pointDeVieMax;
    }

    public void setPointDeVieMax(int pointDeVieMax) {
        this.pointDeVieMax = pointDeVieMax;
    }

    public Coque(int pointDeVie) {
        this.pointDeVie = pointDeVie;
        this.pointDeVieMax = pointDeVie;
    }

}
