package Services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvesionsKtoc {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				System.out.println("Enter Kelvin Amount:");		
				
				float kelvin = Float.parseFloat(br.readLine());
				
				float celsius = kelvin - 273.15F;
				
				System.out.println("Celsius: "+ celsius);

				

	}

}
