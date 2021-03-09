import java.util.ArrayList;
import java.util.List;

public class Calcul {
	private List<String> operateurAutoriser;
	private int nb1;
	private String operateur;
	private int nb2;
	private boolean afficheLeZero;
	
	public Calcul(List<String> operateurAutoriser) {
		this.operateurAutoriser = new ArrayList<>(operateurAutoriser);
		//this.operateurAutoriser.addAll(operateurAutoriser);
		this.nb1 = 0;
		this.operateur = null;
		this.nb2 = 0;
		this.afficheLeZero = false;
	}
	
	public int ajouterNombres(int decimal) throws Exception {
		if (decimal <10 && decimal >=0) {
			if (this.operateur == null) {
				this.nb1 *=10;
				this.nb1+=decimal;
				return this.nb1;
			}else {
				afficheLeZero = (decimal==0);
				this.nb2 *=10;
				this.nb2+=decimal;
				return this.nb2;
			}
		}else {
			throw new Exception("Erreur : nombres pas compris en 0 et 9 nombres =" + decimal);
		}
	}
	
	public String ajouterOperateur(String operateur) throws Exception {
		if (this.operateurAutoriser.contains(operateur)) {
			this.operateur = operateur;
			return operateur;
		}else {
			throw new Exception("Erreur : operateur inconnue operateur ="+operateur+ " operateur autoriser =" + this.operateurAutoriser);
		}
	}
	
	public String calcul() throws Exception {
		if (operateur==null) {
			return this.nb1+"";
		}
		
		int resultat =0;
		switch(operateur) { 
		case "+": 
			resultat = this.nb1+this.nb2;
			break; 
		case "-": 
			resultat = this.nb1-this.nb2;
		break; 
		case "*": 
			resultat = this.nb1*this.nb2; 
			break; 
		case "/": 
			if (this.nb2 ==0){
				throw new Exception("Erreur : Division par 0");
			}
			resultat = this.nb1/this.nb2;	 
			break;
		default: System.out.println("Erreur : Operateur inconnu"); //Normalement arrive jamais  
	}
		
	System.out.println(this.nb1 + this.operateur + this.nb2 + "=" + resultat);
	return (this.nb1 +" "+ this.operateur +" "+ this.nb2 + " = " + resultat);
		
	}

	public void reinitialisation() {
		this.nb1=0;
		this.nb2=0;
		this.operateur=null;
		this.afficheLeZero=false;
	}
	
	public int getNb1() {
		return nb1;
	}

	public String getOperateur() {
		return operateur;
	}

	public int getNb2() {
		return nb2;
	}
	
	@Override
	public String toString() {
		if(this.operateur ==null) {
			return this.nb1 +"";
		}else if (this.nb2==0 && !afficheLeZero) {
			return this.nb1 +" "+ this.operateur;
		}else{
			return this.nb1 +" "+ this.operateur +" "+ this.nb2 ;
		}
	}
}
