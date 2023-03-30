package programs;

import java.util.Scanner;

public class Sum {

	public static int sum(int a, int b) {
		int c = a+b;
		return c;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int x = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int y = sc.nextInt();
		
		System.out.println("The sum of the given numbers is: "+sum(x,y));
	}
}
