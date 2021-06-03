package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class GrupaFixtureTests {
	private Grupa grupa;

	@Before
	public void setUp() throws Exception {
		grupa = new Grupa(1010); 
		for(int i = 0; i<1000;i++) {
			Student s = new Student();
			for(int j=0;j<10;j++) {
				s.adaugaNota(10);  
			}
			grupa.adaugaStudent(s);
		}
	}

	@Test(timeout=500)
	public void testGetPromovabilitate_Error() { 
		grupa.getPromovabilitate(); 
	}
}
