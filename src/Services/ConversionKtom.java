package Services;

import java.util.Scanner;

public class ConversionKtom {

	public static void main(String[] args) {
		double kilometers;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter kilometers:");
		kilometers = scan.nextDouble();

		double miles = kilometers * 1.621;
		

		System.out.println("miles " + miles);

	}

}
