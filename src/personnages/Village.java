package personnages;

public class Village {
	private String nom;
	private int nbVillageois;
	private Chef chef;
	private Gaulois[]villageois;
	private int numvillageois;
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
		this.villageois=new Gaulois [nbVillageoisMaximum];
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois]=gaulois;
		nbVillageois=nbVillageois+1;
	}
	public void trouverHabitant(int numvillageois) {
		this.numvillageois=numvillageois;
	}
	public void VillagedesIrréductibles (Village VillagedesIrréductibles) {
		numvillageois=30;
	}
	//Gaulois gaulois = village.trouverHabitant(30);
}

