package ro.ase.cts.flyweight;

public class Rezervare {
	private int nrMasa;
	private int nrPersoane;
	private String ora;
	
	public Rezervare(int nrMasa, int nrPersoane, String ora) {
		super();
		this.nrMasa = nrMasa;
		this.nrPersoane = nrPersoane;
		this.ora = ora;
	}

	@Override
	public String toString() {
		return "Rezervare [nrMasa=" + nrMasa + ", nrPersoane=" + nrPersoane + ", ora=" + ora + "]";
	}

	
	
	
}
