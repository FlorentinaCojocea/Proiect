package CalitateTestareSoftware;

public class Consultant implements Angajat{
	
	private String nume;
	private int varsta;
	private double salariu;
	private String CNP;
	private String departament;
	
	public Consultant(String nume, int varsta, double salariu, String CNP,
			String departament) {

		this.nume = nume;
		this.varsta = varsta;
		this.salariu = salariu;
		this.CNP = CNP;
		this.departament = departament;
	}

	public void afisareAngajat() {
		// TODO Auto-generated method stub
		System.out.println(nume+" "+varsta+" "+salariu+" "+departament+" "+CNP);
	}
	
	

}
