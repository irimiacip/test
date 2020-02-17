package Class;

class Persons {
String name;
int varsta;
 // clasa contine : 

  //  instance variable
  // methods  

  void speak() {
	  System.out.println("Hello omule " + name + " unde este ? Cati ani ai " + varsta);
  }
}

public class Class {

	public static void main(String[] args) {		
		Persons p1=new Persons();
		p1.name="ion";
		p1.varsta=23;		
		p1.speak();
		Persons p2=new Persons();
		p2.name="vasile";
		p2.varsta=23;
		p2.speak();
		System.out.println(p2.name);
		System.out.println(p1.varsta);			
	}
	
}
