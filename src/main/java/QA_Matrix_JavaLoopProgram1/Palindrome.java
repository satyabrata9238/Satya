package QA_Matrix_JavaLoopProgram1;

public class Palindrome {

	public static void main(String[] args) {
		String str = "Level";
		String reversedStr="";
		for(int i=0; i<str.length(); i++) {
			reversedStr = str.charAt(i)+reversedStr;
		}
		if(str.toLowerCase().equals(reversedStr.toLowerCase())) {
			System.out.println("This is a Palindrome string : "+str);
		}
		else {
			System.out.println("This is not a Palindrome string : "+str);
		}
	}

}
