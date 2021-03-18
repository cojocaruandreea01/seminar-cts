package ro.ase.cts.clase;

//EAGER INITIALIZATION
public class DepartamentFinanciarEager
{
	private int nrAngajati;
	private String director;
	private double salariuDeBaza;
	
	//getInstance
	private static DepartamentFinanciarEager departamentFinanciarEager=
			new DepartamentFinanciarEager(10,"Popescu",3000);
	
	//constructorul privat
	//daca avem constructor public anuleaza Singleton
	private DepartamentFinanciarEager(int nrAngajati, String director, double salariuDeBaza) 
	{
		this.nrAngajati=nrAngajati;
		this.director=director;
		this.salariuDeBaza=salariuDeBaza;
	}
	
	//functie
	public static DepartamentFinanciarEager getInstance()
	{
		return departamentFinanciarEager;
	}
	
	//setteri
	public void setAngajati(int nrAngajati) {
		this.nrAngajati = nrAngajati;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setSalariuDeBaza(double salariuDeBaza) {
		this.salariuDeBaza = salariuDeBaza;
	}
	
	
	@Override
	public String toString() {
		return "DepartamentFinanciarEager [nrAngajati=" + nrAngajati + ", director=" + director + ", salariuDeBaza="
				+ salariuDeBaza + "]";
	}


}
