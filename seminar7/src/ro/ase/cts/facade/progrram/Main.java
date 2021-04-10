package ro.ase.cts.facade.progrram;

import ro.ase.cts.facade.BirouCredite;
import ro.ase.cts.facade.Persoana;
import ro.ase.cts.facade.Politie;
import ro.ase.cts.facade.VerificatorPersoana;

public class Main {

	public static void main(String[] args) {
		Persoana persoana=new Persoana("Georgel", "2991108045311");
		if(persoana.getVarsta() >=18) {
			if(!Politie.esteUrmarit(persoana)) { //sunt diferite if ul de la politie cu cel de la birou pt ca politie e statica
				BirouCredite birou=new BirouCredite();
				if(!birou.areCredit(persoana)) {
					System.out.println("S-a creat contul!");
				}
			}
		}
		
		Persoana persoana2=new Persoana("Marian", "1990022123113");
		if(VerificatorPersoana.verificaPersoana(persoana2)) {
			//////////
		}
	}

}
