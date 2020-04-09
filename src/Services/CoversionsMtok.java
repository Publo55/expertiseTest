package Services;

import java.util.*;
public class CoversionsMtok {

	public static void main(String[] args) {
		double miles;
		double kilometers;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter Miles:");
		miles = scan.nextDouble();

		kilometers = miles * 1.6;

		System.out.println("Kilometers " + kilometers );

	}

}
