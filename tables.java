import java.util.*;

class tables
{
  public static void main(String args[])
  {
      int table,times,i,result;
      Scanner sc=new Scanner(System.in);

     System.out.println("Enter The Table:");
     table=sc.nextInt();

      System.out.println("Enter The Times:");
      times=sc.nextInt();

      System.out.println("The Output Is:");
      for(i=1;i<=times;i++)
      {
            result=table*i;
            System.out.println(" "+result);
     }

  }
}


output

Enter The Table:
4
Enter The Times:
10
The Output Is:
 4
 8
 12
 16
 20
 24
 28
 32
 36
 40
