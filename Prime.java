# project14
import java.io.*;
import java.util.*;
public class Prime
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n,i;
    n=sc.nextInt();
    if((n%2==0)||(n%3)==0)
    {
      System.out.println("Not prime");
    }
    else
    {
      System.out.println("Prime");
    }
  }
}
