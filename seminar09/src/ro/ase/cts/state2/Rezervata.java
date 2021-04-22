package ro.ase.cts.state2;

public class Rezervata implements Stare {

	@Override
	public void modificareStare(Masa masa) {
		// TODO Auto-generated method stub
		if(masa.getStare() instanceof Libera) {
			System.out.println("Masa "+masa.getCod()+" este acum rezervata");
			masa.setStare(this);
		}else {
			System.out.println("Masa "+masa.getCod()+" nu poate fi rezervata");
		}
	
	}

}
