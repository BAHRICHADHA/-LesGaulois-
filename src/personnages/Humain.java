package personnages;

public class Humain {
	package personnages ;
	public class Humain {
	    private String nom ;
	    protected String boisson ;
	    private int qargent ;
	    public Humain(String nom , String boisson , int qargent ){
	        this.nom = nom ;
	        this.boisson = boisson ;
	        this.qargent = qargent ;
	    }
	    private String prendreParole() {
	        return "Le gaulois " + nom + " : ";
	        }

	    public String parler(String texte){
	        return prendreParole() + " "+ texte + " ";
	    }
	    public String getNom( ){
	        return nom ;
	    }
	    /*public String getboisson() {
	        return boisson;
	    }*/

	    public int getArgent(){
	        return qargent ;
	    }
	    public void direBonjour (){

	        System.out.println( parler("Bonjour ! Je m'appelle ")+getNom()+ " et j'aime boire du " +boisson); ;

	    }
	    public void boire(){
	        System.out.println( parler("Mmmmmm , un bon verre de " )+ boisson +"!GLOUPS ! ");


	    }


	        /*public void setqargent(int qargent) {
	                this.qargent = qargent;
	        }*/
	    public int gagnerArgent(int gain){
	        int x=getArgent();
	        return qargent=x+gain;
	    }

	    public int perdreArgent(int perte ){
	        int x=getArgent();
	        return qargent=x-perte;
	    }

	    public void acheter(String bien , int prix ){
	                if(getArgent()>prix) {
	                        System.out.println( parler("j'ai ")+getArgent()+"sous en poche .Je vais m'offrir un "+ bien + " à "+ prix +" sous");
	                perdreArgent(prix);
	                }
	                else if(getArgent()<prix) {
	                        System.out.println(parler("je n'ai plus que")+getArgent()+"sous en poche.Je ne peux meme pas m'offrir un "+bien+" à "+prix+" sous");
	                }

	    }


	}

}
