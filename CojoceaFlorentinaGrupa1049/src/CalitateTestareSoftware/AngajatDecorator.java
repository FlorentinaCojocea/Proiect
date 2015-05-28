package CalitateTestareSoftware;

public abstract class AngajatDecorator implements Angajat{

	protected Angajat angajatDecorat;
	
	public AngajatDecorator(Angajat angajatDecorat){
		this.angajatDecorat = angajatDecorat;
	}
	
	public void afisareAngajat(){
		angajatDecorat.afisareAngajat();
	}
}
