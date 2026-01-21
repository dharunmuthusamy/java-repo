package pack1;
class student{
	public String read() {//method
		  return "reading";
	  }
	  public String write(String a) {
		  return a;
	  }
	  public void print() {
		  int a = 20;
		  System.out.println(a);
	  }
	  public int marks(int b) {
		  return b;
}
}
public class tut {//class
	  public String read() {//method
		  return "reading";
	  }
	  public String write(String a) {
		  return a;
	  }
	  public void print() {
		  int a = 20;
		  System.out.println(a);
	  }
	  public int marks(int b) {
		  return b;
	  }
	public static void main(String[] args) {
		student hareesh = new student(); 
		tut dharun = new tut();//t-object
		System.out.println(hareesh.write("writing book"));
		System.out.println(dharun.write("writing note"));
		int mark = hareesh.marks(100);
		System.out.println(mark);
	}
}
