package ro.ase.cts;

import clase.Animal;
import clase.Girafa;
import clase.Zebra;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		Zoo zoo=new Zoo();
		Animal z1=new Zebra("Monica");
		Animal z2=new Zebra("Ion");
		Animal g1=new Girafa("Mariana");
		Animal g2=new Girafa("Floricica",500);
		
		
		zoo.AdaugareAnimal(z1);
		zoo.AdaugareAnimal(z2);
		zoo.AdaugareAnimal(g1);
		zoo.AdaugareAnimal(g2);
		
		zoo.HranesteAnimale();
		
		zoo.mutareAnimale();

	}

}
