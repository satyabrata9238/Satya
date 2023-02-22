package QA_Matrix_JavaLoopProgram1;
//5. Write a program to to wish good morning , after noon , evening according to time with if condition.
import java.util.Calendar;

public class Wish_GM_GA_GN {
	
	    public static String getGreetings()
	    {
	        Calendar c = Calendar.getInstance();
	        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

	        if(timeOfDay < 12){
	            return "Good morning";
	        }else if(timeOfDay < 16){
	            return "Good afternoon";
	        }else if(timeOfDay < 21){
	            return "Good evening";
	        }else {
	            return "Good night";
	        }
	    }
	}
