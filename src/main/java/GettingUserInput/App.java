package GettingUserInput;

import java.util.Scanner;

/**
 * Getting user input
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    name();
    varsta();
    bani();
    }
    
    public static void name() {
    	Scanner input = new Scanner(System.in);   	  
    	  System.out.println("Insert your name");
    	        String nume = input.nextLine();
    	        System.out.println("Numele tau este :" + nume);
    }
    
    public static void varsta() {
    	Scanner input = new Scanner(System.in);   	  
  	  System.out.println("Insert your age");
  	        Integer varsta = input.nextInt();
  	        System.out.println("Varsta ta este :" + varsta);
    }
    
    public static void bani() {
    	Scanner input = new Scanner(System.in);   	  
  	  System.out.println("Insert your amount");
  	        double bani = input.nextDouble();
  	        System.out.println("Banii tai sunt:" + bani);
    }
}
