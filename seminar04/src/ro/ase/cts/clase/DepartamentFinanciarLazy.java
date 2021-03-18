package ro.ase.cts.clase;

//LAZY INITIALIZATION
public class DepartamentFinanciarLazy {
	private int nrAngajati;
	private String director;
	private double salariuDeBaza;
	
	//getInstance ->o amanam pt ca este Lazy
	private static DepartamentFinanciarLazy departamentFinanciarLazy=null;
			
	//constr privat
	private DepartamentFinanciarLazy(int nrAngajati, String director, double salariuDeBaza) 
	{
		this.nrAngajati=nrAngajati;
		this.director=director;
		this.salariuDeBaza=salariuDeBaza;
	}
	
	//functia satica getInstance ce returneaza departament
	//daca o facem syncronize => ThreadSafe
	public static synchronized DepartamentFinanciarLazy getInstance(int nrAngajati, String director, double salariuDeBaza)
	{
		if(departamentFinanciarLazy ==null) {
			departamentFinanciarLazy=new DepartamentFinanciarLazy(nrAngajati, director, salariuDeBaza);
		}
		return departamentFinanciarLazy;
	}


	public void setNrAngajati(int nrAngajati) {
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
		return "DepartamentFinanciarLazy [nrAngajati=" + nrAngajati + ", director=" + director + ", salariuDeBaza="
				+ salariuDeBaza + "]";
	}
	
	
	
	
}
