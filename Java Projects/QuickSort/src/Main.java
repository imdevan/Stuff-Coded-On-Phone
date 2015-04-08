import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		int[] intArray = {1, 2, 4,7,4,3,4};
		QuickSort.sort(intArray);
		
		for(int num : intArray)
			System.out.println(num);
	}
}
