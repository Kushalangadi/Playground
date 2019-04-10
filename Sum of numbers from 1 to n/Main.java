import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int Sum=0;
      for(int i=0;i<=n;i++)
      {
         Sum=Sum+i;
      }
      System.out.println(Sum);
	}
}