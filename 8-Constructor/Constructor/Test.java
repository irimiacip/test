package Constructor;

class Oameni {
	
	 String nume;
	 String prenume;
	 int varsta;
	 	 
	public String getNume() {
		return nume;
	}
	public void setNume(String numele_omului) {
		this.nume = numele_omului;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenumele_omului) {
		this.prenume = prenumele_omului;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta_omului) {
		this.varsta = varsta_omului;
	}		
	public Oameni() {
		this("vasilica");        // in aceasta varianta se face call catre celalat constructor
		//this.nume = "ion";	//  adica un constructor cheama alt constructor
								// daca lasam si a doua linie se supracrie variabile nume
	} 							// pentru a intra intr-un loop infinit ==> un constructor se apeleaza pe el //
	public Oameni(String nume_om) {
		this.nume = nume_om;
	}
	
}

public class Test {

	public static void main(String[] args) {
		Oameni om1 = new Oameni();		
		System.out.println(om1.getNume());
	    Oameni om2 = new Oameni("vasile");
	   System.out.println(om2.getNume()); 
	} 	   
}