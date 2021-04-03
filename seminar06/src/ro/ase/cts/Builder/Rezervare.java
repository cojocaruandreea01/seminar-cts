package ro.ase.cts.Builder;

public class Rezervare {
	private int codRezervare;
	private boolean areMancareINclusa;
	private boolean areBauturaInclusa;
	private boolean areScaun;
	private boolean areMuzicaAmbientala;
	private String genMuzica;
	
	
	public Rezervare(int codRezervare, boolean areMancareINclusa, boolean areBauturaInclusa, boolean areScaun,
			boolean areMuzicaAmbientala, String genMuzica) {
		super();
		this.codRezervare = codRezervare;
		this.areMancareINclusa = areMancareINclusa;
		this.areBauturaInclusa = areBauturaInclusa;
		this.areScaun = areScaun;
		this.areMuzicaAmbientala = areMuzicaAmbientala;
		this.genMuzica = genMuzica;
	}

	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}
	public void setAreMancareINclusa(boolean areMancareINclusa) {
		this.areMancareINclusa = areMancareINclusa;
	}
	public void setAreBauturaInclusa(boolean areBauturaInclusa) {
		this.areBauturaInclusa = areBauturaInclusa;
	}

	public void setAreScaun(boolean areScaun) {
		this.areScaun = areScaun;
	}

	public void setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala = areMuzicaAmbientala;
	}

	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}

	@Override
	public String toString() {
		return "Rezervare [codRezervare=" + codRezervare + ", areMancareINclusa=" + areMancareINclusa
				+ ", areBauturaInclusa=" + areBauturaInclusa + ", areScaun=" + areScaun + ", areMuzicaAmbientala="
				+ areMuzicaAmbientala + ", genMuzica=" + genMuzica + "]";
	}
	
	
	
	
}
