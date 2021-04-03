package ro.ase.cts.Builder;

//a doua varianta de builder
public class RezervareBuilderV2 implements AbstractBuilder{
	private int codRezervare;
	private boolean areMancareINclusa;
	private boolean areBauturaInclusa;
	private boolean areScaun;
	private boolean areMuzicaAmbientala;
	private String genMuzica;
	
	public RezervareBuilderV2() {
		this.codRezervare=0;
		this.areBauturaInclusa=false;
		this.areMancareINclusa=false;
		this.areMuzicaAmbientala=false;
		this.areScaun=false;
		this.genMuzica=null;
	}

	@Override
	public Rezervare build() {
		
		return new Rezervare(codRezervare, areMancareINclusa, areBauturaInclusa, areScaun, areMuzicaAmbientala, genMuzica);
	}

	public RezervareBuilderV2 setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}

	public RezervareBuilderV2 setAreMancareINclusa(boolean areMancareINclusa) {
		this.areMancareINclusa = areMancareINclusa;
		return this;
	}

	public RezervareBuilderV2 setAreBauturaInclusa(boolean areBauturaInclusa) {
		this.areBauturaInclusa = areBauturaInclusa;
		return this;
	}

	public RezervareBuilderV2 setAreScaun(boolean areScaun) {
		this.areScaun = areScaun;
		return this;
	}

	public RezervareBuilderV2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala = areMuzicaAmbientala;
		return this;
	}

	public RezervareBuilderV2 setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}
	
	
	

}
