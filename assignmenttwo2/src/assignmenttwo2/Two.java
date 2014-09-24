/**
 * START
 * WHILE i<5 DO
 * 	PROMPT for integer
 * 	READ integer
 * WHILE i<5 DO
 * 	CALCULATE sum
 * CALCULATE avg
 * WHILE i<5
 * 	WHILEx<5
 * 		IF num[i] < num[x]
 * 			THEN temp=num[i]
 * 				 num[i]=num[x]
 * 			     num[x]=temp
 * PRINT sum, avg, min, max, median locations
 * STOP
 */


package assignmenttwo2;

import java.util.Scanner;


public class Two {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		
		int[] num = new int[5];
		int temp = 0, sum = 0, avg = 0;
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Please enter in a integer; ");
			num[i] = keyboard.nextInt();
			
		}

		for(int i = 0; i < 5; i++)
		{
			sum = sum + num[i];
		}
		avg = sum/5;

		
		
		
		for(int i = 0; i < 5; i++)
		{
			for(int x = 0; x < 5; x++)
			{
				if(num[i] < num[x])
				{
					temp = num[i];
					num[i] = num[x];
					num[x] = temp;
				}
					
				
				
				
			}
	
		}

		System.out.println("Sum " + sum);
		System.out.println("avg " + avg);
		System.out.println("Min " + num[0]);
		System.out.println("Max " + num[4]);
		System.out.println("Median " + num[2]);
		
	}
		
		
}		
	


