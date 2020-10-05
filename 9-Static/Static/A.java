package Static;


 class Oameni {
	 
    //public private  protected , final pentru o variabila
	//public  private protected , final  pentru o metoda
	     // dupa care urmeaza STATIC sau NU 
	    // dupa care urmeaza VOID sau CE INTOARCE METODA

	 public String nume;
	 public static String description;   //==> nu se face copie a aceste variabile in  mai multe obiecte.
	                                    // ==> apartine clasei si este UNICA !!!
	 public String adress;
	 
	 public final static   String  XXX_YYY ="Steaua";

	 public static String birthlocation;  
	 
	public void showAdress() { 				// o metoda care nu este statica , poate apela variabile STATICE cat si NON-STATICE
		System.out.println(adress);
	}
	
	public static void showbirthlocation() {  // o metoda statica apeleaza DOAR DOAR static variable
		System.out.println(birthlocation);
	}
}


public class A {

	public static void main(String[] args) {
		
		Oameni om1 = new Oameni();
		Oameni om2 = new Oameni();
		
		om1.nume = "ion";
		om2.nume = "vasile";
		om1.description = "maria";
		om2.description="ioana";    //!!!!!! atentie ==> se suprascrie valoare description....deoarece nu se fac copi ale variabile
		                            // asa cum am zis este UNICA. 
		 							// in consecinta la rulare se va dubla informatie legate de ioana.
				
		System.out.println(om1.nume);
		System.out.println(om2.nume);
		
		System.out.println(om1.description);  //
		System.out.println(om2.description);   // aici se vad consecintele in care se apeleaza in mod NE-STATIC o variabila STATICA.
		
		Oameni.description = "sunt la baza animale";  // ASA se initializeaza si se foloeste o variabila statica
		 System.out.println(Oameni.description);
		
		Oameni.birthlocation="bucuresti";
		Oameni.showbirthlocation();   // acesta este modul corect de apelare a unei metode statice 
		 
		 System.out.println(Oameni.XXX_YYY);
	}

}
