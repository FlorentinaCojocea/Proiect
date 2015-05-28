package CalitateTestareSoftware;

public class Manager extends AngajatDecorator{

	public Manager(Angajat angajatDecorat){
		super(angajatDecorat);
	}
	
	@Override
	public void afisareAngajat(){
		angajatDecorat.afisareAngajat();
		atribuieTask(angajatDecorat);
	}
	
	public void atribuieTask(Angajat angajatDecorat){
		System.out.println("Atribuie task");
	}
}
