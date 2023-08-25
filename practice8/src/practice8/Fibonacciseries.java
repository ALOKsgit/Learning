package practice8;

import java.util.Scanner;

public class Fibonacciseries {
	public static void printFibonacciSeries(int n)

	{
		int fib1=0;
		int fib2=1;
		if(n==1)
		{
			System.out.println(fib1);
		}
		else if(n==2)
		{
			System.out.println(fib2);
		}
		else {
		
		for(int i=3;i<=n;i++)
    {
			int nextfib=fib1+fib2;
			
			fib1=fib2;
			fib2=nextfib;
    }
		
    }
		System.out.print(" "+fib2);
     
	
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		 printFibonacciSeries(n);
		

	}

}
