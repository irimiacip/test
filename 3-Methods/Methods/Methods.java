package Methods;

class Person{
	String name;
	int age;
	
	void speak() {
		System.out.println("I am " + name + " and I have " + age + " years old");
	}
}

public class Methods {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age =12;
		p1.name="gigi";
               System.out.println(p1.name);
               System.err.println(p1.age);
               p1.speak();
        
        Person p2 = new Person();
        p2.age =15;
        p2.name ="ana";
        System.out.println(p2.age);
        System.out.println(p2.name);
        p2.speak();
	}

}
 