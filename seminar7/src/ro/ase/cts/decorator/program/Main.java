package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.Card;
import ro.ase.cts.decorator.DecoratorConcret;
import ro.ase.cts.decorator.DecoratorContactlessTelefon;

public class Main {

	public static void main(String[] args) {
		Card card1=new Card("Ion",3000);
		card1.realizeazaPlataNormala(200);
		card1.realizeazaPlataOnline(300);
		
		//am adaugat functionalitate noua ->contactless
		DecoratorConcret cardNou=new DecoratorConcret(card1);
		cardNou.platesteContactless(400);
		cardNou.realizeazaPlataNormala(200);
		cardNou.realizeazaPlataOnline(100);

		//am adaugat functionalitate noua ->contactless cu telefonul
		DecoratorContactlessTelefon decoratorContactless=new DecoratorContactlessTelefon(card1);
		decoratorContactless.platesteContactless(300);
	}

}
