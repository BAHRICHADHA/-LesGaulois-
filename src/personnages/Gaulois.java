package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetpotion = 1;
	private int nb_trophees;
	private Equipement trophees[] = new Equipement[100];

	

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}

	//private String prendreParole() {
		// TODO Auto-generated method stub
		//return "Le gaulois" + nom + " : ";
	//}
	private String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
		}

	//public void frapper(Romain romain) {
		//System.out.println(nom + "envoie un grand coup dans le machoire de " + romain.getNom());
		//romain.recevoirCoup(force / 3);
	//}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la
		m�choire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) *
		effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,
		nb_trophees++) {
			this.trophees[nb_trophees] = trophees[i];
		}
		return;
    }

	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetpotion=" + effetpotion + "]";
	}

	public static void main(String[] args) {
		asterix (nom = "Ast�rix", force = 8);
		System.out.println(asterix);

	}

}
