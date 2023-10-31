package week2.day1.assignment;



public class IsPrimeNumber {
	
//	Assignment Details:
//		- Create a class by name: IsPrime
//		- Create a main method using shortcut
//		- Write a logic to find if the given number is prime or not
//		- Print if it is prime or not
//		Requirements:
//		- Create a Java class named IsPrimeNumber.
//		- Add a main method in the IsPrimeNumber class, either by typing it or using a shortcut(Type 
//		main +ctrl+space & Enter).
//		- Inside the main method, write java code to print the number is prime or not in the c

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num=13;
	boolean flag=false;
for(int i=2;i<num;i++) {
	
	//number divisible by 1 or by itself
	if(num%i==0) {
		
		flag =true;
	}
	
	
}

if(!flag) {
	System.out.println("The no is prime"+num);
}else {
	System.out.println("The no is not prime"+num);
}
	}

}

// others logic found in whatsapp

//int n=73,factor=0;
//if(n>1) {
//	for(int i=1;i<=n;i++) 
//	{
//		if(n%i==0) 
//		{
//			factor++;
//		}
//	}
//	if(factor==2)
//	{
//		System.out.println(n + " is a prime number");
//	}
//	else{
//		System.out.println(n + " is not a prime number");
//		}				
//		
//	}
//	
//else{
//	System.out.println(n + " is not a prime number");
//    }		
//}	
