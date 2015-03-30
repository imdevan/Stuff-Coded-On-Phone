import java.util.ArrayList;

public class Split
{
	/* return arrayList of strings */
	public static ArrayList<String> splitBySpace(String s)
	{
		/* ArrayList to return */
		ArrayList<String> r = new ArrayList<String>();
		
		/* Stringbuilder */
		StringBuilder sb = new StringBuilder();
		
		boolean inQuotes = false;
		
		for(int i = 0; i < s.length(); i++){
			Character c = s.charAt(i);
			
			// Alpha
			if(Alpha.contains(c)){
				sb.append(c);
			}
			// Quote
			else if(c == '\"'){
				// is c in between words?
				if(!inWord(i,s))
					if(inQuotes)
						inQuotes = false;
					else
						inQuotes = true;
			}
			// Space
			else if(c == ' '){
				if(inQuotes){
					sb.append(c);
				}else{
					// handle spaces
					r.add(sb.toString());
					sb.setLength(0);
					
					// handle multiple spaces
					// this is definitely a little 
					// off right now
					while(i < s.length()){
						if(s.charAt(i+1) == ' ')
							i++;
						else 
							break;
					}
					
				}
			}
		}
		
		
		/* Add last word to r */
		r.add(sb.toString());
		
		/* return r */
		return r;
	}
	
	private static boolean inWord(int i, String s){
		if((i == 0) || (i == s.length()-1))
			return false;
			
		else if(Alpha.contains(s.charAt(i-1))
			&& Alpha.contains(s.charAt(i+1)))
			return true;
		else
			return false;
	}
}
