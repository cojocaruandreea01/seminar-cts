package ro.ase.cts.proxy;

public class ProxyOperatorRezervari implements IOperatorRezervari {

	private OperatorRezervari operator;
	private int nrMinimPersoane;
	
	public ProxyOperatorRezervari(OperatorRezervari operator, int nrMin) {
		super();
		this.operator = operator;
		this.nrMinimPersoane=nrMin;
	}

	@Override
	public void realizeazaRezervare(String numeClient, int nrPersoane) {
		//conditie din cerinta 
		if(nrPersoane >=nrMinimPersoane) {
			operator.realizeazaRezervare(numeClient, nrPersoane);
		}
		else {
			System.out.println("Va rugam sa veniti fara rezervare");
		}
		
	}

}
