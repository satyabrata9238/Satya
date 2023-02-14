package QA_Matrix_JavaLoopProgram1;
//Write a java Program to find Neon Number.
public class NeonNumber {
	public static boolean isNeon(int num)
	{
		int sum=0;
		int square=num*num;
		boolean b=false;
		while(square>0)
		{
			int d=square%10;
			sum+=d;
			square/=10;
		}
		if(sum==num)
		{
			return true;
		}
		else
		{
		  return false;
		}
	}
	public static void main(String[] args) {
		int num=9;
		if(isNeon(num))
		{
			System.out.println(num+" is a neon Number");
		}
		else
		{
			System.out.println(num+" is not neon Number");
		}
	}
}
