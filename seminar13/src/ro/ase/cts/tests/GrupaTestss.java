package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class GrupaTestss {

	@Test
	public void testConstructor_Right() {
		Grupa grupa=new Grupa(1078);
		assertEquals(1078, grupa.getNrGrupa());
	}
	@Test
	public void testConstructor_LowerBoundry() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	@Test
	public void testConstructor_UpperBoundry() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	@Test(expected = IllegalArgumentException.class)
	public void testConstructor_ErrorUpper() {
		new Grupa(2000); 
	}
	@Test(expected = IllegalArgumentException.class)
	public void testConstructor_ErrorLower() {
		new Grupa(900); 
	}

	@Test(timeout=200)
	public void testConstructor_Performance() {
		new Grupa(1000); 
	}

	@Test
	public void testConstructor_Existence() {
		Grupa grupa = new Grupa(1000);
		assertNotNull(grupa.getStudenti());
	}

	@Test
	public void testGetPromovabilitate_Right() {
		Grupa grupa = new Grupa(1000);
		for(int i = 0; i<8;i++) {
			Student s = new Student();
			s.adaugaNota(10);
			grupa.adaugaStudent(s);
		}
		for(int i = 0; i<2;i++) {
			Student s = new Student();
			s.adaugaNota(4);
			grupa.adaugaStudent(s);
		}
		float promo = grupa.getPromovabilitate();
		assertEquals(0.8,promo,0.01);
	}
	@Test
	public void testGetPromovabilitate_LowerBoundry() {
		Grupa grupa = new Grupa(1000);
		for(int i = 0; i<8;i++) {
			Student s = new Student();
			s.adaugaNota(10);
			grupa.adaugaStudent(s);
		} 
		float promo = grupa.getPromovabilitate();
		assertEquals(1,promo,0.01);
	}
	@Test
	public void testGetPromovabilitate_UpperBoundry() {
		Grupa grupa = new Grupa(1000);
		for(int i = 0; i<2;i++) {
			Student s = new Student();
			s.adaugaNota(4);
			grupa.adaugaStudent(s);
		}
		float promo = grupa.getPromovabilitate();
		assertEquals(0,promo,0.01); 
	}
	@Test
	public void testGetPromovabilitate_InverseRel() {
		int nrIntegralisti = 31;
		int nrRestantieri = 2;
		Grupa grupa = new Grupa(1000);
		for(int i = 0; i<nrIntegralisti;i++) {
			Student s = new Student();
			s.adaugaNota(10);
			grupa.adaugaStudent(s);
		}
		for(int i = 0; i<nrRestantieri;i++) {
			Student s = new Student();
			s.adaugaNota(4);
			grupa.adaugaStudent(s);
		}
		float promo = grupa.getPromovabilitate();
		assertEquals(nrIntegralisti,promo*(nrRestantieri+nrIntegralisti),0.001); 
	}
	@Test
	public void testGetPromovabilitate_Cardinality1Integralist() {
		Grupa grupa = new Grupa(1000); 
		Student s = new Student();
		s.adaugaNota(10);
		grupa.adaugaStudent(s); 
		float promo = grupa.getPromovabilitate();
		assertEquals(1,promo,0.01); 
	}
	@Test
	public void testGetPromovabilitate_Cardinality1Restantier() {
		Grupa grupa = new Grupa(1000); 
		Student s = new Student();
		s.adaugaNota(4);
		grupa.adaugaStudent(s); 
		float promo = grupa.getPromovabilitate();
		assertEquals(0,promo,0.01); 
	}
}
