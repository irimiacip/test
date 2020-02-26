package Setter_Getter_This;


class Oameni {
	
	String nume;  // instance variabile
	String prenume; // instance variabile
	Integer varsta;
	
	
	public String getNume() {
		System.out.println(nume);
		return nume;
	}
	public void setNume(String numele) {
		this.nume = numele;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenumele) {
		this.prenume = prenumele;
	}
	public Integer getVarsta() {
		return varsta;
	}
	public void setVarsta(Integer varsta) {
		this.varsta = varsta;
	}

		
}

public class A {

	public static void main(String[] args) {

		Oameni om1 = new Oameni();
		om1.setNume("Vasile");
		om1.setPrenume("Ionescu");
		om1.setVarsta(35);
		System.out.println(om1.getNume());
		//om1.getNume();
		om1.getPrenume();
		om1.getVarsta();
	}

}
