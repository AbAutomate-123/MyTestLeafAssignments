package week2.day1.assignment;

public class FindOddNumbers {
	
//	Assignment Details:
//		Create a class named FindOddNumbers with integer variable as maxRange with value 10
//		 -Write a logic to print the odd numbers from 1 to 10.
//		Requirements:
//		Create a java class named FindOddNumbers
//		 - Declare a with integer variable as maxRange with value 10
//		 - Use for loop to iterate
//		 - Divide the value and check the reminder is equal to 1 using if condition
//		Hints to Solve:
//		 1. Initialize the for loop from 1 and condition with <= maxRange
//		 2. Divide the number by 2 and if the remainder is 1 -> the number is odd. 
//		 3. Use mod (%) operator to find reminder 
//	

	public static void main(String[] args) {
		
		
		System.out.println("Odd numbers between 1 to 10");
		for (int i=1;i<=10;i++) {
					
					if(i%2==1) {
						System.out.println(i);
					}
			}

	}

}
