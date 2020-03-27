package test1;

import java.util.Scanner;

class Base {
	
	public int retunr_base() {
		
		Scanner input = new Scanner(System.in);   	  
		  System.out.println("Insert base number");
		        int base = Integer.parseInt(input.nextLine());
		        
	  return base;
	}
	
}

class Exp {
public int retunr_exp() {
		
		Scanner input = new Scanner(System.in);   	  
		  System.out.println("Insert exp number");
		        int exp = Integer.parseInt(input.nextLine());
		        
	  return exp;
	}
}

public class Main {

	public static void main(String[] args) {
		int value;
		Base b = new Base();
		int base_number = b.retunr_base();
		
		Exp e = new Exp();
		int exp_number = e.retunr_exp();
		
		if (exp_number==2) {
			value =base_number * base_number;
			System.out.println(value);
		}else {
		for (int i=2; i<=exp_number;i++) {			
			value = base_number * base_number;			
			value = base_number * value;
			if(i==exp_number) {
				System.out.println(value);
			}			
		}
		
		}	
		
	}

}
