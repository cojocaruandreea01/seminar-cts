package ro.ase.cts.proxy;

public class OperatorRezervari implements IOperatorRezervari{

	@Override
	public void realizeazaRezervare(String numeClient, int nrPersoane) {
		System.out.println("A fost realizata rezervarea pentru "+nrPersoane+" persoane "+"pentru: "+numeClient);
		
	}
	
}
