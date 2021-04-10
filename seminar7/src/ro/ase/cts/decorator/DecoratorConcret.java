package ro.ase.cts.decorator;

public class DecoratorConcret extends DecoratorAbstract{

	public DecoratorConcret(Card card) {
		super(card);
	}

	@Override
	public void platesteContactless(int suma) {
		if(super.getCard().getSold()>suma) {
			System.out.println("A facut plata Contactless"+suma);
			super.getCard().setSold(super.getCard().getSold() - suma);
		}
	}

}
