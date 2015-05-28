package Teste;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import junit.framework.TestCase;

import CalitateTestareSoftware.Programator;

public class TestFisier extends TestCase{
	
	Programator prog = new Programator(2345);

	public void setUp() throws Exception {
		System.out.println("setUp Unit test");
		prog = new Programator(5000.0);
	}
	

	public void testData(){
	try {
		
		//test citire fisier text
		getTest("ValoriSalariu.txt");
		
		this.prog.setSalariu(2500);
		
		assertEquals("Testare", this.prog.getSalariu(), 350.0);
	
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	}
	
	//test pentru preluare valori din fisier
	private void getTest(String fileName) 
			throws Exception{
		File inputFile = new File(fileName);
		if(inputFile.exists()){
			BufferedReader reader = 
					new BufferedReader(new FileReader(inputFile));
			
			String linieCurenta;
			
			while((linieCurenta = reader.readLine())!=null){
				//ignoram liniile care incep cu #
				if(linieCurenta.startsWith("#"))
					continue;
				else
				{
					System.out.println(linieCurenta);
				}
			}
		}
		else
			System.out.println("Lipsa fisier date intrare");
	}


}
