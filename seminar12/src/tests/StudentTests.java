package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Student;

public class StudentTests {

	@Test
	public void testConstrcutorCuParametru() {
		String nume="gigel";
		Student student=new Student(nume);
		
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testConstructorFaraParametru() {
		Student student=new Student();
		//assertNotEquals(null,student.getNume()); //ma astept  ca numele sa nu fie null
		assertNotNull("Numele este null", student.getNume());
		assertNotNull("Lista nu este initializata", student.getNote());
	}
	
	@Test
	public void testAdaugaNota() {
		Student student=new Student();
		int nota=7;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testDimensiuneLista() {
		Student student=new Student();
		int nota=7;
		student.adaugaNota(nota);
		assertEquals(1,student.getNote().size()); //verificam daca am adaugat o singura nota in lista
	}
	
	@Test
	public void testCalculMedie() {
		Student student=new Student();
		int nota1=5;
		int nota2=10;
		
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		float medie1=student.calculeazaMedie();
		float medie2=(nota1+nota2)/2.0f;
		
		//???
		//assertEquals(medie2,medie1,0,001);
	}
	
	@Test
	public void testAreRestante() {
		Student student=new Student();
		student.adaugaNota(4);
		student.adaugaNota(10);
		//assertEquals(true, student.areRestante());
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testNuAreRestante() {
		Student student=new Student();
		student.adaugaNota(10);
		student.adaugaNota(8);
		assertFalse(student.areRestante());
	}
	
	@Test
	public void testSetNume() {
		Student student=new Student();
		String nume="Ioana";
		student.setNume(nume);
		assertEquals(nume,student.getNume());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetNotaAruncaExceptie() {
		Student student=new Student();
		student.getNota(-1);
	}
	
	@Test
	public void testJUnit3GetNotaAruncaExceptie() {
		Student student=new Student();
		//1
		try {
			//2
			student.getNota(-1);
			//3 - nu este executata
			fail("Metoda nu arunca nicio exceptie");
		}
		catch(IndexOutOfBoundsException exception){
			//4
		}
		catch(Exception exception) {
			//5 - nu este executata
			fail("Metoda nu arunca IndexOutOfBoundsException, ci alt tip");
		}
		//6
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNoteNegative() {
		Student student=new Student();
		student.adaugaNota(-4);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNotePreaMari() {
		Student student=new Student();
		student.adaugaNota(200);
	}
}
