package ro.ase.cts.Adapter;

public class Main {

	public static void rezervaSiVindeBiletLaCasa(Bilet bilet) {
		bilet.rezerva();
		bilet.vinde();
	}
	
	public static void rezervaSiVindeBiletPePlatforma(BiletOnline biletOnline) {
		biletOnline.rezervaBiletOnline();
		biletOnline.vindeBiletOnline();
	}
	
	public static void main(String[] args) {
		Bilet bilet=new Bilet(20);
		rezervaSiVindeBiletLaCasa(bilet);
		
		BiletAdapter biletAdapter=new BiletAdapter(30);
		rezervaSiVindeBiletPePlatforma(biletAdapter);
	}

}
