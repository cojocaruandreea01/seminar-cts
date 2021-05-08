package ro.ase.cts.chain;

public abstract class Cont {
	private Cont urmatorul;
	private float sold;
	private String iban;
	
	
	public Cont(float sold, String iban) {
		super();
		this.sold = sold;
		this.iban = iban;
		this.urmatorul=null;
	}

	public Cont getUrmatorul() {
		return urmatorul;
	}

	public float getSold() {
		return sold;
	}

	public void setUrmatorul(Cont urmatorul) {
		this.urmatorul = urmatorul;
	}

	public void setSold(float sold) {
		this.sold = sold;
	}
	
	
	public abstract void plateste(float suma);
	
	
	
	
}
