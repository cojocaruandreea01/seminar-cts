package ro.ase.cts.decorator;

public class Card implements CardAbstract {

	private String titular;
	private int sold;
	
	public Card(String titular, int sold) {
		super();
		this.titular = titular;
		this.sold = sold;
	}
	
	public String getTitular() {
		return titular;
	}

	public int getSold() {
		return sold;
	}

	
	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setSold(int sold) {
		this.sold = sold;
	}

	@Override
	public void realizeazaPlataOnline(int suma) {
		if(sold>suma) {
			System.out.println("S-a platit online: "+suma);
			sold=sold-suma;
		}
	}

	@Override
	public void realizeazaPlataNormala(int suma) {
		if(sold>suma) {
			System.out.println("S-a platit normal: "+suma);
			sold=sold-suma;
		}
	}
}
