package ro.ase.cts.facade;

public class Politie {
	//in functie de ultima cifra din CNP=> este urmarit
	
	//se poate si static dar si ca lasa birou
	public static boolean esteUrmarit(Persoana persoana) {
		return Integer.parseInt("" +persoana.getCnp().charAt(12)) % 2==0;
	}
}
