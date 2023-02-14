package QA_Matrix_JavaLoopProgram1;
//14. Write a java Program to reverse the given Number.
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args) {
		/*static int reversedNumber(int num)
	{
		int reverse_num=0;
		int digit=0;
		while(num!=0)
		{
			digit=num%10;
			reverse_num=reverse_num*10+digit;
			num=num/10;
		}
		return reverse_num;
	}
	public static void main(String[] args) 
	{
		int num,reverse=0;
		System.out.println("Enter a Number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		reversedNumber(num);
		System.out.println("Original number:"+num);
		System.out.println("Reverse number is :" +reversedNumber(num));
	}
}
*/
	
		int number,reverse=0;
		System.out.println("Enter a Number:");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		System.out.println("Original number:"+number);
		while(number!=0){
	    	  int reminder =number%10;
	    	  reverse = reverse *10+reminder;
	    	  number=number/10;
	    	  System.out.println(+reverse);
      }
	}
}

