package ro.ase.cts.facade;

public class BirouCredite {

	//pe baza penultimei cifre din CNP =>au credite
	public boolean areCredit(Persoana persoana) {
		return	Integer.parseInt(""+ persoana.getCnp().charAt(11)) %2 ==0;
	}
}
