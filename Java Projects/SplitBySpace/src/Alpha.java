
import java.util.*;public class Alpha
{
	private static HashSet<Character> alpha;
	
	private static void init(){
		alpha = new HashSet<Character>();

		alpha.add('a');
		alpha.add('b');
		alpha.add('c');
		alpha.add('d');
		alpha.add('e');
		alpha.add('f');
		alpha.add('g');
		alpha.add('h');
		alpha.add('i');
		alpha.add('j');
		alpha.add('k');
		alpha.add('l');
		alpha.add('m');
		alpha.add('n');
		alpha.add('o');
		alpha.add('p');
		alpha.add('q');
		alpha.add('r');
		alpha.add('s');
		alpha.add('t');
		alpha.add('u');
		alpha.add('v');
		alpha.add('w');
		alpha.add('x');
		alpha.add('y');
		alpha.add('z');
	}
	
	public static boolean contains(Character c){
		if(alpha  == null)
			init();
			
		/* 
			check if alpha set contains
			lowercase c
		*/
		return alpha.contains(
			Character.toLowerCase(c)
			);
	}
}
