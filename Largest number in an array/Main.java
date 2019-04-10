import java.util.Scanner;
class Main{
  public static void main(String args[])
  {
    
        // Type your code here
      Scanner in = new Scanner (System.in);
      int arrs = in.nextInt();
      int arr[]= new int[arrs];
      for(int i=0;i<=arrs-1;i++)
      {
        arr[i]=in.nextInt();
      }
      int max = 0;
    if (arr[0]>max)
    {
      max = arr[0];
    }
    if (arr[1]>max)
    {
      max = arr[1];
    }
    for(int i=2;i<=arrs-1;i++)
    {
      if(arr[i]>max)
      {
        max = arr[i];
      }
    }
    System.out.println(max);
}
}
