import java.util.*;

/*
	This project aims to take a string
	and split that string by space.
	
	If a string contains quotes, do not
	split by space within the quotes.
	
	Assume that words do not contain quotes
	internally
*/

public class Main
{
	/* Util function to println */
	public static void sopl(String s){
		System.out.println(s);
	}
	
	
	public static void main(String[] args)
	{
		String testString = "Foo     \"wat Bar\"";
		ArrayList<String> result = Split.splitBySpace(testString);
		
		sopl("Test string:");
		sopl(testString);
		
		sopl("Result: \n");
		for(String s: result)
			sopl(s);
			
	}
}
