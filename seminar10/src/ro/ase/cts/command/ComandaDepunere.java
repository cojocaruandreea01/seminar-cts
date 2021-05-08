package ro.ase.cts.command;

public class ComandaDepunere implements IComanda {
	private ContBancar cont;
	private float sumaDrepusa;
	
	
	public ComandaDepunere(ContBancar cont, float sumaDrepusa) {
		super();
		this.cont = cont;
		this.sumaDrepusa = sumaDrepusa;
	}


	@Override
	public void executa() {
		// TODO Auto-generated method stub
		cont.depunere(sumaDrepusa);
		
	}

}
