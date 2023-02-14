package QA_Matrix_JavaLoopProgram1;
//Write a java Program to find Strong Number.
public class StrongNumber {

	public static void main(String[] args) {
		int num=145,sum=0;
		int temp=num,r;
		int fact=1;
		while(temp!=0)
		{
			r=temp%10;
			fact=1;
			for(int i=1;i<=r;i++)
			{
				fact*=i;
				sum+=fact;
				temp/=10;
		}
		if(num==sum)
		{
			System.out.println(num+"  is strong number");
		}
		else
		{
		System.out.println(num+"  is not a strong number");
		}
	}
  }
}
