package ro.ase.cts.factoryMethod;

public class Medic extends PersonalSpital {

	public Medic(String nume, int salariu) {
		super(nume, salariu);
	}

	@Override
	public String toString() {
		return "Medic [getNume()=" + getNume() + ", getSalariu()=" + getSalariu() + "]";
	}

	
	

}
