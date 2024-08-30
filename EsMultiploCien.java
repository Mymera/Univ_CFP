/***Martha Mera***/
package esc1;
import java.util.Scanner;

public class EsMultiploCien {
	
	public static void main(String[] args) {

	Scanner value = new Scanner(System.in);

	//a number is requested 
	System.out.print("Type a integer: ");
	
	//the entered number is stored
	int numbers = value.nextInt();
	
	//the number is validated if is modal of 100
	int mod1=numbers%100;
	
	//if the result is 0 it will be a multiple of 100, otherwise it will not.
	String res1 =(mod1==0)? "Si" : "No";


	//the results are printed
	System.out.println("Number type is: "+numbers);
	System.out.println("Is the number a multiple of 100?: "+res1);
		
	}
	

}
