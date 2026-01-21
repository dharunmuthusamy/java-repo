package pack1;

import java.util.*;

class stackArray{
		int size;
		int top;
		int arr[];
		public stackArray(int size) {
			this.size = size;
			top = -1;
			arr = new int[size];
		}
		boolean isFull() {
			if(top==size-1) {
				return true;
			}
			return false;
		}
		
		void push(int data) {
			if(isFull()) {
				System.out.println("Stack overflow");
				return;
			}else {
				top++;
				arr[top] = data;
			}
		}
		boolean isEmpty() {
			if(top==-1) {
				return true;
			}
			return false;
		}
		int pop() {
			if (isEmpty()){
				System.out.println("Stack underflow");
				return -1;
			}
			return arr[top--];
		}
		public int peek() {
			if(top==-1) {
				return -1;
			}
			return arr[top];
		}
		void traverse() {
			for(int i=top;i>=0;i--) {
				System.out.print(arr[i]+" ");
			}
		}
	}
public class Stack {
	public static void main(String[] args) {
		stackArray st = new stackArray(5);
		st.push(5);
		st.push(4);
		st.push(3);
		st.push(2);
		st.push(1);
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.pop());
		st.push(7);
		System.out.println(st.peek());
		System.out.println(Arrays.toString(st.arr));
		st.traverse();
	}
}
