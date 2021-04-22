package ro.ase.cts.state2;

public class Libera implements Stare {

	@Override
	public void modificareStare(Masa masa) {
		if(!(masa.getStare() instanceof Libera)) {
			System.out.println("Masa "+masa.getCod()+" este acum eliberata");
			masa.setStare(this);
		}else {
			System.out.println("Masa "+masa.getCod()+" nu poate fi eliberata");
		}
	}

}


