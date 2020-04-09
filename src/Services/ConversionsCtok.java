package Services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConversionsCtok {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				System.out.println("Enter Celsius Amount:");		
				
				float celsius = Float.parseFloat(br.readLine());
				
				float kelvin = celsius + 273.15F;
				
				System.out.println("Kelvin: "+ kelvin);

	}

}
