package Learn;

import java.util.Scanner;

public class Tests {
	public static void s(){
		int a,b,c=0;
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		b=s.nextInt();
		System.out.println("Multiplication of given number "+b+" is" );
		for(a=1;a<=10;a++)
		
			 System.out.println(b+"*"+a+" = "+(b*a));
		}
		
	

	public static void main(String[] args) {
		
s();
	}

}
