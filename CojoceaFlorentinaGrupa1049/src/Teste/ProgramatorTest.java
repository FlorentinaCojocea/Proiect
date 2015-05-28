package Teste;

import junit.framework.TestCase;

import CalitateTestareSoftware.Director;
import CalitateTestareSoftware.Programator;

public class ProgramatorTest extends TestCase{
	
	private Programator programator;
	private Director dir = null;

	public void setUp() throws Exception {
		//System.out.println("setUp Unit test");
		programator = new Programator("Ion", 35, 2800.01, "180050585413", "C#");
	}
	
	//functie ce se apeleaza automat la sfarsitul fiecarui unit test
	public void tearDown() throws Exception{
		//System.out.println("Terminare test - stergere obiecte");
		programator = null;
		super.tearDown();
		}

	public void testGePlata() {
		programator.setPlata("Lunar");
		assertTrue(programator.getPlata() == "Lunar");
	}
	
	//verificare plata <> null
	public void testSetPlata(){
		programator.setPlata("Lunar");
		assertNotNull(programator.getPlata());
	}
	
	public void testSetPlata2(){
		programator.setPlata("Pe zile lucrate");
		assertFalse(programator.getPlata() == "Lunar");
	}
	
	//verificare CNP sa contina exact 13 cifre
	public void testCNP(){
		programator.setCNP("1234565890121");
		//assertTrue(programator.getCNP().length() == 13);
		assertEquals("Contine 13 cifre", programator.getCNP().length(), 13);
	}
	
	//verificare ca CNP-ul sa inceapa cu 1 sau 2
	public void testCNP1(){
		programator.setCNP("1451234561214");
		if(programator.getCNP().length() == 13){
			assertEquals("Gen masculin", "1", programator.getCNP().substring(0,1));
		}	
		else
			System.out.println("nu contine 13 cifre!");
	}
	
	public void testCNP2(){
		programator.setCNP("2451234561214");
		if(programator.getCNP().length() == 13){
			assertEquals("Gen feminin", "2", programator.getCNP().substring(0,1));
		}	
		else
			System.out.println("nu contine 13 cifre!");
	}
	
	//verificare an valid, un angajat nu trebuie sa aiba varsta mai mare de 60 de ani
	public void testCNP3(){
	    int expected = 55;//2015-60
	    int value = Integer.parseInt(programator.getCNP().substring(1,3));
	    assertTrue("An valid",value >= expected);
	}
	
	//verificare an valid, un angajat trebuie sa fie major
	public void testCNP4(){
	    int expected = 97;//2015-18
	    int value = Integer.parseInt(programator.getCNP().substring(1,3));
	    assertFalse(value >= expected);
		}
	
	//verificare luna valida: valoarea din CNP < 12
	public void testCNP5(){
		int value = Integer.parseInt(programator.getCNP().substring(3, 5));
		assertTrue(value <= 12);
	}
	
	//verificare luna, an, ziua diferite de null
	public void testCNP6(){
		try{
			//pentru an
			int value = Integer.parseInt(programator.getCNP().substring(1, 3));
			if (value == 0)
			assertFalse("Setter-ul pentru CNP nu arunca exceptie cand anul este 0", true);
			//pentru luna
			value = Integer.parseInt(programator.getCNP().substring(3, 5));
			if (value == 0)
			assertFalse("Setter-ul pentru CNP nu arunca exceptie cand luna este 0", true);
			//pentru zi
			value = Integer.parseInt(programator.getCNP().substring(5, 7));
			if (value == 0)
			assertFalse("Setter-ul pentru CNP nu arunca exceptie cand ziua este 0", true);
			}
			catch(Exception ex){
				assertTrue(true);
			}
	}
	
	//verificare cnp <> null
	public void testCNP7(){
		assertNotNull(programator.getCNP());
	}
	
	//numele sa aiba cel putin 2 caractere
	public void testSetNume(){
		if(programator.getNume().length() < 2)
		assertFalse("Setter-ul pentru nume nu arunca exceptie cand numele nu are mai putin de 2 caractere", true);
	}
	
	//verificare daca exista cifre in nume
	public void testSetNume2(){
		if(programator.getNume().matches("[a-zA-Z]+") == false)
			assertFalse("Nu trebuie sa fie introduse cifre si alte caractere in nume!", true);
	}
	
	//verificare nume <> null
	public void testSetNume3(){
		assertNotNull(programator.getNume());
	}
	
	//verificare varsta angajat ( sa fie cuprinsa intre 18 si 60 de ani)
	public void testVarsta(){
		if(programator.getVarsta() <= 18)
			assertFalse("Setter-ul pentru varsta nu arunca exceptie atunci cand angajatul e minor!", true);
		if(programator.getVarsta() >=60)
			assertFalse("Setter-ul pentru varsta nu arunca exceptie atunci cand angajatul trebuie fie la pensie!", true);
	}
	
	//verificare varsta = anul din CNP in functie de anul curent
	public void testVarsta2(){
		int value = Integer.parseInt(programator.getCNP().substring(1,3));
		int expected = (2015 - value) % 100;
		assertEquals(expected, programator.getVarsta());
	}
	
	//verificare departament <> null
	public void testDepartament(){
		assertNotNull(programator.getDepartament());
	}
	
	//verificare tipProgramator <> null
	public void testTipProgramator(){
		programator.setTipProgramator("In Training");
		assertNotNull(programator.getTipProgramator());
	}
	
	//verificare toString (programator<>null)
	//public void testToString() throws Exception{
		//assertNotNull(programator.toString());
	//}
	
	//verificare obiecte
	public void testObiecte(){
		Programator expected = new Programator("Ion", 35, 2900, "1234123123", "C#");
		assertNotSame(expected, programator);
	}
	
	//verificare salariu pe valori negative 
	public void testValoriNegativeSalariu(){
		try{
		if(programator.getSalariu() < 0)
		assertFalse("Setter-ul pentru salariu nu arunca exceptie pe valori negative", true);
		}
		catch(Exception ex){
			assertTrue(true);
		}
	}
	
	public void testSalariu(){
		double expected = 2800.01;
		assertEquals("Testare salariu", expected, programator.getSalariu());
	}
	
	//verificare daca salariul are valoarea 0
	public void testSalariuZero(){
		try{			
		   if(programator.getSalariu() == 0.0)
		   assertFalse("Setter-ul nu arunca exceptie pe 0", true);
		}
		catch(Exception ex){
			assertTrue(true);
		}
	}
	
	//verificare valori pozitive cu maxim 2 zecimale
	public void testSalariuZecimale(){
		try{
			int value = 0;
			String sal = String.valueOf(programator.getSalariu());
	        for (int i = 0; i < sal.length(); i++){
	        	String point = String.valueOf(sal.charAt(i));
	        	if (point.equals("."))      		
	        	   value = i;
	        }
			String afterpoint = sal.substring(value + 1, sal.length());
		    if(afterpoint.length() > 2)
		    assertFalse("Setter-ul nu arunca exceptie pe numarul de zecimale > 2", true);
		}
		catch(Exception ex){
		    assertTrue(true);
		}
	}
	
	//verificare valori pozitive care depasesc o limita data
	public void testLimitValueDeposit(){
		try{
			double valoare = 150000.00;
			//programator.setSalariu(valoare);
			if(programator.getSalariu() > valoare)
			fail("Salariul are o valoare peste limita!");
		}
		catch(Exception ex){
			
		}
	}
	
	//verificare numar angajati
	public void testSetNumarAngajati(){
		dir = new Director("Mara");
		dir.setNumarAngajatiZero();
		assertEquals(dir.getNumarAngajati(), 0);
	}
	
	public void testProgramator(){
		assertNotNull(programator);
	}
	
	//verificare 2 obiecte 
	public void testNotEqual(){
		Programator programator2 = new Programator("Ion", 35, 2800.01, "180050585413", "C#");
		assertNotSame(programator2, programator);
	}
	
	//verificare nume
	public void testNume(){
		String nume1 = "Ion";
		assertEquals(nume1, programator.getNume());
	}
	
	public void testNume2(){
		String nume1 = "Ion";
		assertSame(nume1, programator.getNume());
	}
	
	public void testNume3(){
		String nume1 = "iON";
		//assertEquals(nume1, programator.getNume());
		assertNotSame(nume1, programator.getNume());
	}
}
