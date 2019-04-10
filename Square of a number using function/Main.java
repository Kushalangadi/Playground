import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      
      
        int s = square(n);
        n = s;
      
      System.out.println(n);
      
	}
  public static int square(int m)
  {
    int sq ;
    sq= m*m;
  return sq;
  }
}