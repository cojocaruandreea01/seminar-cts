package ro.ase.cts.Builder;

public class Main {

	public static void main(String[] args) {
		Rezervare r1=new Rezervare(1234,false,false,false,true,"jazz");
		//ne folosim de builder
		Rezervare r2=new ConcretBuilder().setCodRezervare(15).setAreScaun(true).build();
		Rezervare r3=new ConcretBuilder(16).setAreBauturaInclusa(true).build();
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		//cele 2 au acelasi cod--> s-a facut shallow copy si s-a pierdut
		ConcretBuilder br=new ConcretBuilder();
		Rezervare r4=br.setCodRezervare(17).setAreBauturaInclusa(true).build();
		Rezervare r5=br.setCodRezervare(18).setAreBauturaInclusa(true).build();
		System.out.println(r4);
		System.out.println(r5);

	}

}
