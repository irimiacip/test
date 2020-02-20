package MethodsParameters;

class Person {
	
	public void speak (String text) {
		System.out.println("afisare text" + text);
	}
	
	public void age (int age) {
		System.out.println("my age " + age);
	}
	
   public void move (String direction , double distance , int age){
	   System.out.println("eu ma plimb spre " + direction + " am facut o distant de " + distance + " si am varsta de " + age);
   }
}

public class App {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.speak("hello");
		p1.age(35);
		p1.getClass();
		System.out.println(p1.getClass());
		p1.move("N-N-V", 34.4, 35) ;
				
	}

}
