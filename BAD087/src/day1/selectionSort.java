
package day1;
import java.util.*;
public class selectionSort {
	public static int[] selectionSorting(int arr[]){ //O(n^2)
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            if(arr[i]!=arr[min]){
                    int temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp; 
                }
        }
        return arr;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(selectionSorting(arr)));
	}
}
