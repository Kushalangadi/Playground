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
      int search1 = in.nextInt();
      int search2 = in.nextInt();
      int element_index1 =-1;
      int element_index2 =-1;
      for(int i=0;i<=arrs-1;i++)
      {
        if(search1==arr[i])
        {
          element_index1 = i;
        }
        else if (search2==arr[i])
        {
          element_index2 = i;
        }
      }
      System.out.println(element_index1);
      System.out.println(element_index2);
}
}
