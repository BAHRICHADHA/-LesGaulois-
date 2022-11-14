package personnages;

public class Trophee {
	Gaulois gaulois;
    Equipement Equipement;
    String nom;
    String trophee;
    
    public Trophee(Gaulois gaulois,Equipement equipement){
        this.gaulois=gaulois;
        this.equipement=equipement;
    }
    public Gaulois get_gaulois(){
        return gaulois;
    }
    public Equipement get_equipement(){
        return equipement;
    }
    public String donnerNom(Gaulois gaulois){
        return nom; 
    }
}
