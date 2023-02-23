public class Magasin {
    private String nomMagasin;
    private String adresseMagasin;
    Chaussure chaussureEnVitrine;
    public String getNomMagasin() {
        return nomMagasin;
    }
    public String getAdresseMagasin() {
        return adresseMagasin;
    }
    public Chaussure getChaussureEnVitrine() {
        return chaussureEnVitrine;
    }
    public static void main(String args[]) {
        Chaussure chaussure = new Chaussure();
        chaussure.marche();
        Chaussure basket = new Basket();
        basket.marche();


    }
}
