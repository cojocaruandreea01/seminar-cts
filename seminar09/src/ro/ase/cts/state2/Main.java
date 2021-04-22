package ro.ase.cts.state2;

public class Main {

	public static void main(String[] args) {
		Masa masa = new Masa(3);
		 
		masa.elibereazaMasa();
		masa.ridicareRezervare();
		masa.rezervaMasa();
		masa.ridicareRezervare();
		
		//masa.setStare(new Libera());
		
		masa.rezervaMasa();
		masa.elibereazaMasa();

	}

}
