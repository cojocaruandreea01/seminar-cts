package clase;

public class ZooKeeper {
	private String nume;

	public ZooKeeper(String nume) {
		super();
		this.nume = nume;
	}
	
	//metoda feed pt un Animal
	public void feed(Animal a) {
		System.out.println("Ingrijitorul" + this.nume + " hraneste animalul  " +a.getNume());
	}
}
