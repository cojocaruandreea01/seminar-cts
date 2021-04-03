package ro.ase.cts.Adapter;

public class BiletAdapter extends Bilet implements BiletOnline{

	public BiletAdapter(int pret) {
		super(pret);
	}

	@Override
	public void vindeBiletOnline() {
		super.vinde();
	}

	@Override
	public void rezervaBiletOnline() {
		super.rezerva();
	}
	
	
}
