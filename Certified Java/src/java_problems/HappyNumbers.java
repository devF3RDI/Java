package java_problems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/* Happy Numbers
 * A happy number is defined by the following process:
 * Given any positive integer, replace the number with the sum of the two squares of it digits
 * Keep repeating the process until you reach 1 (Happy Number) or you repeat a sum and there for are in a loop. (Unhappy)
 */



public class HappyNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.print("Please enter a int, to find out if its a happy number: ");
		int num = new Scanner(System.in).nextInt();
		System.out.println(isHappyNumber(num) ? "Is Happy Number!" : "Is not Happy Number!" );
		
			
		//NOTE - To do code so that the program repeats. While there is user input.
		

	}
	
	public static boolean isHappyNumber(int num) 
	{
		
			Set <Integer> uniqueNumbers = new HashSet <Integer>();  // Hashset cannot contain duplicates.
			
			while(uniqueNumbers.add(num)) 
			{
				int value = 0;
				
				while(num>0)
				{
					value += (num % 10)*(num % 10); // This can also be written using Math.pow(num % 10, 2);
					num /= 10;
				}
				num = value;
			}
			return num == 1; // It gets to this code by trying to add a number already in the HashSet.
							 // If num == 1 its a happy number and if not it in a loop and not a happy number. 
							 // It then returns true or false (Boolean) dependant on this. 
	}

}
