package CalitateTestareSoftware;

public class ProgramatorFactory {

	public Programator returneazaTipProgramator(String nume, String tipProgramator){
		
		if(tipProgramator.equals("In Training"))
			return new ProgramatorInTraining(nume);
		else
			if (tipProgramator.equals("Pe Proiect"))
				return new ProgramatorPeProiect(nume);
			else
				return null;
		
	}
}
