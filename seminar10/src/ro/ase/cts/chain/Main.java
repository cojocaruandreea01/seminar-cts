package ro.ase.cts.chain;

public class Main {

	public static void main(String[] args) {
		Cont contEconomii=new ContEconomii(1000,"RO12345");
		Cont contCredit=new ContCredit(2000,"RO78976");
		Cont contCurent=new ContCurent(1200,"RO1864356");
		
		//curent, economii, credit
		contCurent.setUrmatorul(contEconomii);
		contEconomii.setUrmatorul(contCredit);
		
		contCurent.plateste(400);
		contCurent.plateste(700);
		contCurent.plateste(2000);
		contCurent.plateste(700);
		contCurent.plateste(700);
	}

}
