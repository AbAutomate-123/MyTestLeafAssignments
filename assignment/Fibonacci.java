package week2.day1.assignment;

public class Fibonacci {
	
	
//	 User input for the desired range of the Fibonacci series.
//	 Displaying the generated Fibonacci series as the program output – 0, 1, 1, 2, 3, 5, 8, and 13.
	
//	Use a loop to generate the Fibonacci series within the specified range.
//	 Initialize variables to keep track of Fibonacci numbers and update them iteratively.
//	Ensure the loop continues until the next Fibonacci number exceeds the given range
//	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=100;
int f=0;//first 0 and 1 given
int s=1;//second
		for(int i=1;i<=n;i++)
		{
			
			 if(f>13)
				{
					continue;//skip after 13
				}
			
			 System.out.print(f + ", ");
		
			int fibo= f+s;
			
			f=s;
			s=fibo;
			
		
		}
	}

}
