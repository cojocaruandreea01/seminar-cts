package ro.ase.cts.factoryMethod;

public class FactoryMedic implements FactoryPersonal{

	@Override
	public PersonalSpital createPersonal(String nume, int salariu) {
		// TODO Auto-generated method stub
		return new Medic(nume,salariu);
	}

	
}
