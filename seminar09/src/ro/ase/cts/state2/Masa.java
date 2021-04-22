package ro.ase.cts.state2;

public class Masa {
	private int nrMasa;
	private Stare stare;
	
	public Masa(int cod) {
		super();
		this.nrMasa = cod;
		this.stare = new Libera();
	}
	public int getCod() {
		return nrMasa;
	}
	public void setCod(int cod) {
		this.nrMasa = cod;
	}
	public Stare getStare() {
		return stare;
	}
	void setStare(Stare stare) {
		this.stare = stare;
	}

	public void rezervaMasa() {
		// TODO Auto-generated method stub
		Stare s = new Rezervata();
		s.modificareStare(this);
	}
	public void ocupaMasa() {
		// TODO Auto-generated method stub
		Stare s = new Ocupata();
		s.modificareStare(this);
	}
	public void elibereazaMasa() {
		// TODO Auto-generated method stub
		Stare s = new Libera();
		s.modificareStare(this);
	}
	public void ridicareRezervare() {
		// TODO Auto-generated method stub
		ocupaMasa();
	}
}