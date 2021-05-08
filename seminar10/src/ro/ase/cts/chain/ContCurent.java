package ro.ase.cts.chain;

public class ContCurent extends Cont{

	public ContCurent(float sold, String iban) {
		super(sold, iban);	
	}

	@Override
	public void plateste(float suma) {
		if(super.getSold()>=suma) {
			super.setSold(super.getSold()-suma);
			System.out.println("S-a realizat plata din contul curent");
		} else {
			
			if(super.getUrmatorul()!=null) {
				super.getUrmatorul().plateste(suma);
				
			} else {
				System.out.println("Nu se poate realiza plata");
			}
		}
		
	}

}
