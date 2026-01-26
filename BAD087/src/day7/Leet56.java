package day7;
import java.util.*;
import java.util.Comparator;
public class Leet56 {
	public static int[][] merge(int[][] interval){
		if(interval.length==0) return new int[0][0];
		Arrays.sort(interval,new Comparator<int[]>(){
			public int compare(int a[],int b[]) {
				return a[0]-b[0];
		}});
		List <int[]> list= new ArrayList<>();
		list.add(interval[0]);
		for(int i=1;i<interval.length;i++) {
			int[] lastMerged = list.get(list.size()-1);
			int currStart = interval[i][0];
			int currEnd = interval[i][1];
			if(lastMerged[1]>=currStart) {
				lastMerged[1] = Math.max(lastMerged[1], currEnd);
			}else {
				list.add(interval[i]);
			}
		}
		return list.toArray(new int[list.size()][]);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[][] arr = new int[n][2];
	for(int i=0;i<n;i++) {
		for(int j=0;j<2;j++) {
			arr[i][j] = sc.nextInt();
		}
	}
	int res[][] = merge(arr);
	System.out.print(Arrays.deepToString(res));
}
}
