package FizzBuzz.test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	

    		for(int i=1; i<=150; i++)
    		{
    			String number="";

    			if(i%3==0)
    			  number+="Fizz ";
    			if(i%5==0)
    			  number+="Buzz";
    			if(number.length()==0)
    			  number=Integer.toString(i);

    			System.out.println(number);
    		}
    	
    }
}
