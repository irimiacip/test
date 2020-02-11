package test;

class Persons {
String name;
int varsta;
}

public class Class {

	public static void main(String[] args) {		

		Persons p1=new Persons();
		p1.name="ion";
		p1.varsta=23;		
		Persons p2=new Persons();
		p2.name="vasile";
		p2.varsta=23;			
		System.out.println(p2.name);
		System.out.println(p1.varsta);
	
		
	}
	
}
