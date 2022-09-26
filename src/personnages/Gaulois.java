package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetpotion = 1;
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetpotion=" + effetpotion + "]";
	}
	public int getEffetpotion() {
		return effetpotion;
	}
	public void setEffetpotion(int effetpotion) {
		this.effetpotion = effetpotion;
	}
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

}
