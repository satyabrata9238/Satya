package QA_Matrix_JavaLoopProgram1;
//18.  Write a java Program to Fibonacci. 
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		int a=0,b=1;
		int sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the fibonacci series: ");
		int range=sc.nextInt();
		System.out.print(a+",");
		System.out.print(b);
		for(int i=1;i<=range-2;i++)
		{
		sum=a+b;
		System.out.print(","+sum);
		a=b;
		b=sum;		}
	}
}
