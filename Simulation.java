public class Simulation {
    private MaPremiereClasse maPremiereClasse;
    public void afficheSimulation(){
        maPremiereClasse.getId();
        //maPremiereClasse.id; (id etant encapsulé en private, classe 
        //simulation ne peut pas y acceder)
    }
    
}
