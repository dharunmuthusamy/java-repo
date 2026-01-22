//Valid paranthesis
package pack1;
import java.util.*;
import java.util.Stack;
public class Leet20 {
	public static boolean isValid(String s) {
		Stack<Character> st = new Stack<>();
		for(char ch:s.toCharArray()) {
			if(ch=='{') {
				st.push('}');
			}
			else if(ch=='(') {
				st.push(')');
			}
			else if(ch=='['){
				st.push(']');
			}
			else if(st.isEmpty() || st.pop()!=ch) {
				return false;
			}
		}
		return st.isEmpty();
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    String s= sc.next();
    System.out.print(isValid(s));
	}
}
