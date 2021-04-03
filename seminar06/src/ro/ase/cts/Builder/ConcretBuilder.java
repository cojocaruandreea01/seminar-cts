package ro.ase.cts.Builder;

//aceasta clasa implementeaza interfata

public class ConcretBuilder implements AbstractBuilder {

	private Rezervare rezervare;
	
	public ConcretBuilder() {
		super();
		this.rezervare = new Rezervare(0,false,false,false,false,"");
	}

	//facem un constructor pentru cod(atunci cand initializez ii dau ca parametru codul)
	public ConcretBuilder(int cod) {
		rezervare=new Rezervare(cod, false,false,false,false,"");
	}
	
	@Override
	public Rezervare build() {
		return this.rezervare;
	}
	//setteri pt toate atributele din clasa rezervare
	//nu au tipul returnat void --> ci tipul builderului(ConcretBuilder)
	
	public ConcretBuilder setCodRezervare(int codRezervare) {
		rezervare.setCodRezervare(codRezervare);
		return this;
	}
	public ConcretBuilder setAreMancareINclusa(boolean areMancareINclusa) {
		rezervare.setAreMancareINclusa(areMancareINclusa);
		return this;
	}
	public ConcretBuilder setAreBauturaInclusa(boolean areBauturaInclusa) {
		rezervare.setAreBauturaInclusa(areBauturaInclusa);
		return this;
	}

	public ConcretBuilder setAreScaun(boolean areScaun) {
		rezervare.setAreScaun(areScaun);
		return this;
	}

	public ConcretBuilder setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
		return this;
	}

	public ConcretBuilder setGenMuzica(String genMuzica) {
		rezervare.setGenMuzica(genMuzica);
		return this;
	}

}
