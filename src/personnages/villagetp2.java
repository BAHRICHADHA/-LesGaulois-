package personnages;
public enum Equipement{
    CASQUE("casque"), BOUCLIER("bouclier");
    private String nom;
    public Equipement(String nom){
        this.nom=nom;
    }
    public String toString(){
        return nom;
    }
}

public class Village {
	private String nom;
	private int nbVillageois;
	private Chef chef;
	private Gaulois[]villageois;
	private int numvillageois;
    private int numHabitant;
    private chef Abraracourcix;
    private gaulois Astérix;
	public Village(String nom) {
		this.nom = nom;
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}

	public Village(int nbVillageoisMaximum, String nom ) {
		this.nom=nom;
		villageois=new Gaulois [nbVillageoisMaximum];
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois]=gaulois;
		nbVillageois++;
	}
	public void trouverHabitant(int numvillageois) {
		this.numvillageois=numvillageois;
	}
    public void force(int force){
        this.force=force;
    }
	public static void VillagedesIrréductibles (Village VillagedesIrréductibles) {
		private static final int numHabitant=30;
        force Abraracourcix;
        Abraracourcix=new force(6);
        force Astérix;
        Astérix=new force(8);
        force Obélix;
        Obélix=new force(25);
        afficherVillageois(Chef,Obélix);
	}
	//Gaulois gaulois = village.trouverHabitant(30);
    // permet de récuperer la référence de l'habitant 30 qui se trouve  dans le tableau villageois
    // Gaulois gaulois = village.trouverHabitant(1);
    //System.out.println(gaulois);
    //permet d'afficher la référnce de l'habitant 1
    public void afficherVillageois(Chef,Gaulois){
        system.out.println("Dans village du chef"+Chef+"vivent les légendaires gaulois:",Gaulois)
    }
}
public class Romain {
    private Equipements[2]equipements;
    int nbEquipement=0;
    private String nom;
    private int force>0;
    public Romain (String nom, int force) {
        this.nom = nom;
        this.force = force;
    }
    public void sEquiper(int equipement){
        if nbEquipement=2{
            system.out.println("Le soldat"+nom+"est déjà bien protégé !")
        }
        if 
    }
    public void recevoirCoup(int forceCoup) {
        force>0;
        a=force;
        force -= forceCoup;
        if (force > 0) {
        parler("Aïe !");
        } else {
        parler("J'abandonne...");
        }
        a -= forceCoup;
        system.out.println(Equipement.CASQUE);
        system.out.println(Equipement.BOUCLIER);

    }
}
