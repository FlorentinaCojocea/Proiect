package CalitateTestareSoftware;

public class Programator implements Angajat {
	
	private String nume;
	private int varsta;
	private double salariu;
	private String CNP;
	private String departament;
	private String tipProgramator;
	private String plata;

	public Programator(String nume, int varsta, double salariu, String CNP,
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

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getTipProgramator() {
		return tipProgramator;
	}

	public void setTipProgramator(String tipProgramator) {
		this.tipProgramator = tipProgramator;
	}

	public String getPlata() {
		return plata;
	}

	public void setPlata(String plata) {
		this.plata = plata;
	}
	
	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public double getSalariu() {
		return salariu;
	}

	public void setSalariu(double salariu) {
		this.salariu = salariu;
	}

	public String getCNP() {
		return CNP;
	}

	public void setCNP(String CNP) {
		this.CNP = CNP;
	}

	public String getDepartament() {
		return departament;
	}

	public void setDepartament(String departament) {
		this.departament = departament;
	}

	public Programator(){
		
	}

	@Override
	public String toString() {
		return "Programator: nume=" + nume + ", tipProgramator="
				+ tipProgramator + ", plata=" + plata;
	}

	public Programator(double salariu) {
		this.salariu = salariu;
	}
	
}
