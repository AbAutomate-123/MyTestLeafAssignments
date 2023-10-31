package week2.day1.assignment;

public class Palindrome {
	
//	Assignment Details:
//		- Create a class to solve this problem with a meaningful name.
//		- Implement the logic for reversing the digits of the given number
//		- Check whether the given input and the output are equal. If they are equal, then the given input is a Palindrome 
//		and if not, the given input is not a Palindrome.
//		- For Example
//		 Input: 121 -> Output: It is a Palindrome (because the number reads the same backward and forward)
//		 Input: 12345 -> Output: It is not a Palindrome (since the reversed number, 54321, is not the same as original)
//		 
//		Requirements:
//		 - To reverse a number and check for palindrome, Declare two variables of int data type such as
//		- ‘input’ to assign the given number
//		- ‘output’ to store the reversed form of the input number
//		- Use for loop to reverse the digits of 'input'.
//		- Finally, compare ‘input’ with ‘output’ to print whether the given input is a palindrome or not.
//		Hints to solve:
//		- Implement a 'for' loop where the control variable ‘i’ starts with the value of the ‘input’ variable, continues as 
//		long as ‘i’ is greater than 0, and update ‘i’ by dividing it by 10 in each iteration.
//		- Use appropriate operator to calculate the remainder by dividing the ‘input’ by 10. Assign this value to an integer 
//		variable ‘rem’.
//		- Use ‘if’ statement to compare the output with the given input.
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input=171;
int output=0;

for (int i = input; i >0 ; i=i/10) {
	//to get the last digit 

	int lastNum=i%10;
	
	System.out.println(lastNum);

	output =(output*10)+lastNum;
	
}

System.out.println(output);

if(input==output) {
	System.out.println("The number is palindrome");
}else {
	System.out.println("The number is not palindrome");
}

	}

}
