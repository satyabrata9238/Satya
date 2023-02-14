package QA_Matrix_JavaLoopProgram1;
//19. Write a java program to find Armstrong number.
public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=153,sum=0;
		int r,temp=num,power=1,c=0;
		while(temp!=0)
	{
	  c++;
	  temp=temp/10;
	}
		temp=num;
		while(temp!=0)
	{
	  r=temp%10;
	  power=1;
	  for(int i=1;i<=c;i++)
	{
		  power=power*r;
	}
	sum=sum+power;
	temp=temp/10;
	}
	if (num==sum)
	{
	  System.out.println(num+ "is armstrong number");
	}
	else
	{
      System.out.println(num+ "is not a armstrong number");
	}
  }
}
