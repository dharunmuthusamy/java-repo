package pack1;
import java.util.Stack;
import java.util.*;
public class stack2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Stack<Character> st = new Stack<Character>();
	String a = sc.nextLine();
	for(char s:a.toCharArray()) {
		st.push(s);
	}
	StringBuffer sb = new StringBuffer();
	for(int i=0;i<a.length();i++) {
		sb.append(st.pop());
	}
    System.out.println(sb.toString());
	}	
}
