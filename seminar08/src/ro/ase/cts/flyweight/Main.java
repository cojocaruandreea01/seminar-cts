package ro.ase.cts.flyweight;

public class Main {

	public static void main(String[] args) {
		Rezervare r1=new Rezervare(1,2,"12:00");
		Rezervare r2=new Rezervare(2,4,"14:00");
		Rezervare r3=new Rezervare(3,6,"15:00");
		
		FlyweightFactory flyFactory=new FlyweightFactory();
		Client client1=flyFactory.getClient("0745399919");
		client1.printeazaRezervare(r1);
		
		flyFactory.getClient("0740015396").printeazaRezervare(r2);
		flyFactory.getClient("0745399919").printeazaRezervare(r3);
	}

}
