package ro.ase.cts.program;

import ro.ase.cts.clase.DepartamentFinanciarEager;
import ro.ase.cts.clase.DepartamentFinanciarLazy;

public class Main {
	public static void main(String[] args) {
		//Eager
		DepartamentFinanciarEager primulDepartamentFinanciarEager =DepartamentFinanciarEager.getInstance();
		DepartamentFinanciarEager aldoileaDepartamentFinanciarEager =DepartamentFinanciarEager.getInstance();
		
		System.out.println(primulDepartamentFinanciarEager.toString());
		System.out.println(aldoileaDepartamentFinanciarEager.toString());
		
		primulDepartamentFinanciarEager.setDirector("Gigel");
		aldoileaDepartamentFinanciarEager.setAngajati(20);
		
		System.out.println(primulDepartamentFinanciarEager.toString());
		System.out.println(aldoileaDepartamentFinanciarEager.toString());
		
		//Lazy
		DepartamentFinanciarLazy primulDepartamentFinanciarLazy=DepartamentFinanciarLazy.getInstance(50, "Ionel", 1000);
		DepartamentFinanciarLazy aldoileaDepartamentFinanciarLazy=DepartamentFinanciarLazy.getInstance(60, "Ion", 500);//nu mai intra in if(==null)
		//imi afiseaza doar prima instanta de 2 ori: Ionel
		
		System.out.println(primulDepartamentFinanciarLazy.toString());
		System.out.println(aldoileaDepartamentFinanciarLazy.toString());
	}
}
