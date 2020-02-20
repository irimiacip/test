package GetterandReturn;

class Person {
	String name;
	int age;
	
	 String getName() {
		return name;
	}
	 
	 int getAge() {
		return age;
	}

	
	
	int calculateYearsToRetirement() {
		int yearsleft= 65-age;
		return yearsleft;
	}
	
	
	
}

public class App {

	public static void main(String[] args) {
 
		Person p1 = new Person();
		p1.age =34;
		p1.name="ion";
		
		int yearsleft = p1.calculateYearsToRetirement();
		System.out.println("years to retirements " + yearsleft);
		
		 int age = p1.getAge();
		 String name = p1.getName();
		 System.out.println("age of persone " + age);
		 System.out.println("name of person " + name);
		
	}

}
