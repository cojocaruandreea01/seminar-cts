package ro.ase.cts.proxy;

public class Main {

	public static void main(String[] args) {
		OperatorRezervari operator=new OperatorRezervari();
		operator.realizeazaRezervare("Andrei", 1);
		
		ProxyOperatorRezervari proxy=new ProxyOperatorRezervari(operator, 4);
		proxy.realizeazaRezervare("Ion", 1);
		proxy.realizeazaRezervare("Ionela", 4);

	}

}
