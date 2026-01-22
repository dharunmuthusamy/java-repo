package pack1;

import java.util.Arrays;
import java.util.Scanner;
	
public class Leet242 {
	public static boolean isValid1(String s1,String s2) {
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
	}
	public static boolean isValid2(char[] c1,char[] c2) {
		int [] freq = new int[26];
		if(c1.length!=c2.length) {
			return false;
		}
		for(char ch:c1) {
			freq[ch-'a']++;
		}
		for(char ch:c2) {
			freq[ch-'a']--;
		}
		for(int x:freq) {
			if(x!=0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.print(isValid2(s1.toCharArray(),s2.toCharArray()));
	}
}
