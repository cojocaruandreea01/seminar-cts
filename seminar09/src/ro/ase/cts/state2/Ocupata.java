package ro.ase.cts.state2;

public class Ocupata implements Stare {

	@Override
	public void modificareStare(Masa masa) {
		// TODO Auto-generated method stub
		if(!(masa.getStare() instanceof Ocupata)) {
			System.out.println("Masa "+masa.getCod()+" este acum ocupata");
			masa.setStare(this);
		}else {
			System.out.println("Masa "+masa.getCod()+" nu poate fi ocupata");
		}
		
	}

}
