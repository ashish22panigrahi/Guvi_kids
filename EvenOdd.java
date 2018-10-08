package guvi_kids;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		if(n>=0) {
		if(n%2==0) {
			System.out.println("Even");
			}
		else {
			System.out.println("Odd");
		}
		}
		else {
			System.out.println("Invalid");
		}
		}
		
}
	


