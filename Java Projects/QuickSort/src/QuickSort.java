
import java.util.*;public class QuickSort
{
	public static void sort(int[] a, int s, int e){
		if(s >= e)
			return;
			
		int pi = getPivot(a, s, e);
		int pivot = a[pi];
		int si = s;
		
		swap(a, pi, e);
		for(int i = s; i < e; i++){
			if(a[i] < pivot){
				swap(a, i, si++);
			}
		}
		swap(a, si, e);
		
		sort(a, s, si);
		sort(a, si+1, e);
	}
	public static void sort(int[] intArray){
		sort(intArray, 0, intArray.length-1);
	}
	
	public static int getPivot(int[] a, int s, int e){
		Random r = new Random();
		int i1 = r.nextInt(e-s)+s;
		int i2 = r.nextInt(e-s)+s;
		int i3 = r.nextInt(e-s)+s;
		if(a[i1] < Math.max(a[i2], a[i3]) && a[i1] > Math.min(a[i2], a[i3])){
			return i1;
		}else if(a[i2] < Math.max(a[i1], a[i3])  && a[i2] > Math.min(a[i1], a[i3])){
			return i2;
		} else{
			return i3;
		}
	}
	
	public static void swap(int[] a, int s, int e){
		int temp = a[s];
		a[s] = a[e];
		a[e] = temp;
	}
}
