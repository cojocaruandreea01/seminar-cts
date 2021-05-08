package ro.ase.cts.chain;

public class ContCredit extends Cont{

	public ContCredit(float sold, String iban) {
		super(sold, iban);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plateste(float suma) {
		if(super.getSold()>=suma) {
			super.setSold(super.getSold()-suma);
			System.out.println("S-a realizat plata din contul de credit");
		} else {
			
			if(super.getUrmatorul()!=null) {
				super.getUrmatorul().plateste(suma);
				
			} else {
				System.out.println("Nu se poate realiza plata");
			}
		}
		
	}

}
