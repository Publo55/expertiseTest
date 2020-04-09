package Services;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Roulette {

	public static void main(String[] args) throws Exception {
		
		java.io.File file = new java.io.File("C:\\Users\\Consnet04\\Downloads\\book.txt");
		 if (file.exists()) {
		System.out.println("File already exists");
		 
		 }
		 try{
			    BufferedReader reader = new BufferedReader(new FileReader("C:\\\\Users\\\\Consnet04\\\\Downloads\\\\book.txt"));
			    String line = reader.readLine();
			    while (line != null){
			        System.out.println(line);
			        line = reader.readLine();
			    }
			    reader.close();
			} catch(IOException ex){
			    System.out.println(ex.getMessage());
			}
		 Scanner keyboard = new Scanner(System.in);
	       Random generator = new Random();
	       double total = 500;
	       double amount;
	       int choice, win = 0, lose = 0, spin = 0;
	       int number;
	       int rouletteNum;
	       int result;
	       char response = 'y';
	       int resultArr[] = new int[36];

	       while (response == 'y' || response == 'Y' && total <= 0)
	       {
	           System.out.print("Enter your bet amount: ");
	           amount = keyboard.nextDouble();
	           System.out.print("0 - Even\n1 - Odd\n2 - Number\n");
	           choice = -1;
	           while (choice < 0 || choice > 2)
	           {
	               System.out.print("Place your bet on: ");
	               choice = keyboard.nextInt();
	           }
	           number = 0;
	           if (choice == 2)  
	           {
	               while (number < 1 || number > 36)
	               {
	                   System.out.print("Place your bet on number(1-36): ");
	                   number = keyboard.nextInt();
	               }
	           }
	           rouletteNum = generator.nextInt(37);
	           spin++;
	           System.out.println("Roulette number: " + rouletteNum);
	           
	           if (choice == 2)
	           {
	               if (rouletteNum == number)
	                   result = 35;
	               else
	                   result = 0;
	           }
	           else
	           {
	               if (rouletteNum == 0 || rouletteNum % 2 != choice)
	                   result = 0;
	               else
	                   result = 1;
	           }

	           
	           if (result > 0)
	           {
	               System.out.println("Congratulatons!!! You win!");
	               System.out.printf("You have won $%.2f \n", result * amount);
	               System.out.printf("Here's your money back: $%.2f \n",
	                       (result + 1) * amount);
	               total = (result + 1) * amount + total;
	               win ++;
	               resultArr[rouletteNum]++;
	               
	           }
	           else
	           {
	               System.out.println("You lose. Better luck next time!");
	               System.out.printf("You have lost $%.2f \n",
	                       (result + 1) * amount);
	               total = total - (result + 1) * (amount);
	               lose ++;
	               resultArr[rouletteNum]++;
	               
	               if (total <= 0) {
	            	   break;
	               }

	           }

	           
	           for (int totals=1; totals<36; totals++) {
	        		if( resultArr[totals] > 0 ) {
	        			System.out.println("The number " + totals + " won " + resultArr[totals] + " times.");
	        		}
	        	}
	           
	           System.out.println("You have $" + total + " remaining." );
	           System.out.println("You have won " + win + " games.");
	           System.out.println("You have lost " + lose + " games.");
	           System.out.println("The wheel has been spun " + spin + " times.");          
	           System.out.print("\nWould you like to play another game? (y/n) ");
	           response = keyboard.next().charAt(0);
	           
	           
	       }

	   }

}
