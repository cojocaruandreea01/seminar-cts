package ro.ase.cts.strategy;

public class PlataCash implements ModPlata{

	@Override
	public void realizeazapPlata(int suma) {
		System.out.println("S-a realizat plata cash pentru suma de "+suma);
		
	}

}
