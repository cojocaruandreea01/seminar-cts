package ro.ase.cts.simpleFactory;

public class Program {

	public static void main(String[] args) {
		try {
			//FactoryPersonal factory=new FactoryPersonal();
			PersonalSpital persoana1;
			PersonalSpital persoana2;
			persoana1=FactoryPersonal.createPersonal(TipPersonal.Medic, "Ion", 1500);
			persoana2=FactoryPersonal.createPersonal(TipPersonal.Asistent, "Maria", 2500);
			System.out.println(persoana1);
			System.out.println(persoana2);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
