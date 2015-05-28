package CalitateTestareSoftware;

public class FirmaMain {

	public static void main(String[] args) {
		
		//testare composite
		Programator prog1 = new Programator("Popescu", 25, 2000, "123456789023", "Java");
		Programator prog2 = new Programator("Ionescu", 35, 3500, "1235423457634", "Java");
		Director mngProg = new Director("Mircea - Manager Java");
		mngProg.adaugareAngajat(prog1);
		mngProg.adaugareAngajat(prog2);
		
		Consultant cons1 = new Consultant("Gigel", 40, 3000, "1212325476272", "Sap");
		Consultant cons2 = new Consultant("Alexandra", 32, 2800, "2351647282946", "Sap");
		Director mngCons = new Director("Matei - Manager Consultanta");
		mngCons.adaugareAngajat(cons1);
		mngCons.adaugareAngajat(cons2);
		
		Director director = new Director("Mara - Director general");
		director.adaugareAngajat(mngProg);
		director.adaugareAngajat(mngCons);
		director.afisareAngajat();
		
		//System.out.println("Sters!");
		//director.stergeAngajat(mngCons);
		//director.afisareAngajat();
		
		//testare factory
		System.out.println("Test Factory");
		ProgramatorFactory factory = new ProgramatorFactory();
		System.out.println(factory.returneazaTipProgramator("Popescu","In Training").toString());
		System.out.println(factory.returneazaTipProgramator("Marin", "Pe Proiect").toString());
		
		//testare decorator
		System.out.println("Test Decorator");
		Angajat angajat = new Programator("Gelu", 40, 3000, "12323676327", "Sap");
		Angajat manager = new Manager(new Programator("Ioana", 40, 3000, "22323676327", "Sap"));
		System.out.println("Programator simplu angajat");
		angajat.afisareAngajat();
		//mngProg.adaugareAngajat(angajat);
		//director.afisareAngajat();
		
		System.out.println("Manager pe departamentul de programatori");
		manager.afisareAngajat();
		
		Angajat sefEchipa = new SefEchipa(new Programator("Andra", 40, 3000, "21323676327", "Sap"));
		System.out.println("Seful de echipa");
		sefEchipa.afisareAngajat();
	}

}
