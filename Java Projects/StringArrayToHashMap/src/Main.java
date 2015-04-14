import java.util.*;

public class Main
{
	
	public static HashMap<String, String>  toPrefixMap(String[] s)
	{
		HashMap<String, String> hm = new HashMap<String, String>();
		
		return hm;
	}
	
	public static void main(String[] args)
	{ 
		String[] s = {"hi", "dove", "dog", "duck"};
		HashMap<String, String> hm = toPrefixMap(s);
		
		for(String key : hm.keySet()){
			System.out.printf("%s: %s", hm.get(key), key);
		}
		
		
	}
}
