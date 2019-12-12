package java_problems;

import java.lang.Math;
import java.util.Scanner;

public class UglyNumber {
	
	
	public int getNthUglyNo(int n) {
		int ugly[] = new int [n];
		int i2 =0, i3 = 0, i5 = 0;
		int nm2 = 2;
		int nm3 = 3;
		int nm5 = 5;
		int nextUglyNo = 1;
		
		ugly[0] = 1;
		
		for(int i = 1; i < n; i++) {
			nextUglyNo = Math.min(nm2, Math.min(nm3, nm5));
			
			ugly[i] = nextUglyNo;
			
			if(nextUglyNo == nm2) {
				i2++;
				nm2 = ugly[i2]*2;
			}
			if(nextUglyNo == nm3) {
				i3++;
				nm3 = ugly[i3]*3;
			}
			if(nextUglyNo == nm5) {
				i5++;
				nm5 = ugly[i5]*5;
			}
			
		}
		return nextUglyNo;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.print("Please enter a Index #: ");
		int n = scan.nextInt();
		UglyNumber ugnObj = new UglyNumber();
		System.out.println("The " + n + "th Ugly Number is " + ugnObj.getNthUglyNo(n));
		scan.close();
		
		
		
		

	}

}
