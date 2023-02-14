package QA_Matrix_JavaLoopProgram1;
//7.  Write a java Program to find factors of a given Number. 
public class FactorOfANumber
{
	public static void main(String[] args)
	{
	    int number = 20;

	    System.out.print("Factors of " + number + " are: ");

	    for (int i = 1; i <= number; i++) {
	      if (number % i == 0) {
	        System.out.print(i + " ");
	      }
	    }
	  }
	}
