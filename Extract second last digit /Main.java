import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in= new Scanner(System.in);
      int n= in.nextInt();
      int f=n%100;
      int b=f/10;
      System.out.println(b);
	}
}