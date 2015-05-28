package CalitateTestareSoftware;

public class SefEchipa extends AngajatDecorator{

	public SefEchipa(Angajat angajatDecorat){
		super(angajatDecorat);
	}
	
	@Override
	public void afisareAngajat(){
		angajatDecorat.afisareAngajat();
		coordoneaza(angajatDecorat);
	}
	
	public void coordoneaza(Angajat angajatDecorat){
		System.out.println("Coordoneaza echipa din subordine");
	}
}
