package ro.ase.cts.decorator;

//functionalitate noua
public class DecoratorContactlessTelefon extends DecoratorAbstract {

	public DecoratorContactlessTelefon(Card card) {
		super(card);
	}

	@Override
	public void platesteContactless(int suma) {
		if(super.getCard().getSold()>suma) {
			System.out.println("A facut plata Contactles cu telefonul"+suma);
			super.getCard().setSold(super.getCard().getSold() - suma);
		}
	}

}


