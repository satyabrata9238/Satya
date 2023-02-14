package QA_Matrix_JavaLoopProgram1;
//9.  Write a java Program to find Perfect Number
public class PerfectNumber {

	public static void main(String[] args) {
		int num=28,sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if (num%i==0)//finding factor
			{
				sum=sum+i;//adding factor to sum
			}
		}
		if(num==sum)//checking perfect number or not
		{
			System.out.println(num+ "  is a perfect number");
		}
		else
		{
		System.out.println(num+ " is not a perfect number");
		}
	}
}
