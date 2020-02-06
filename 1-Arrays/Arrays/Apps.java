package Arrays;

public class Apps {

	public static void main(String[] args) {

		int value =7;  //(value type) primitiva
		
		int [] values;  //(referince type)  variabila care tine o referinta catre o  lista de intregi  (referince variable)
		                //default value for referince is null 
		values = new int[3];
		values[0]=1;
		values[1]=2;
		values[2]=3;
		for(int i=0;i<values.length;i++) {
			System.out.println(values[i]);
		}
		
		int [] values_1 = {3,4,5};
		for(int i=0;i<values.length;i++) {
			System.out.println(values_1[i]);
		}		
		String [] words = new String[3];
		words[0]="steaua";
		words[1]="dinamo";
		words[2]="rapid";
		
		for(String word : words) {
			System.out.println(word);
		}
	}

}
