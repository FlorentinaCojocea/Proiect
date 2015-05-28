package CalitateTestareSoftware;

import java.util.ArrayList;
import java.util.List;

public class Director implements Angajat{

	private List<Angajat> listaAngajati = new ArrayList<Angajat>();
	private String nume;
	private int n = 0; //nr de angajati

	@Override
	public void afisareAngajat() {
		System.out.println(nume+" ");
		// TODO Auto-generated method stub
		for(Angajat angajat:listaAngajati){
			angajat.afisareAngajat();
		}
	}
	
	public void adaugareAngajat(Angajat angajat){
		listaAngajati.add(angajat);
	}
	
	public void stergeAngajat(Angajat angajat){
		listaAngajati.remove(angajat);
	}
	
	public int getNumarAngajati(){
		return n;
	}
	
	public void setNumarAngajatiZero(){
		n = 0;
	}
	
	//public List<Angajat> returnareSubordonati(){
		//return listaAngajati;
	//}
	
	public Director(String nume){
		this.nume = nume;
	}

}
