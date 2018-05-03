import java.Scanner;

public class Comparestrings {
class CompareStrings
{
   public static void main(String args[])
   {
      String s1, s2;
      Scanner in = new Scanner(System.in);
 
      System.out.println("isat1");
      s1 = in.nextLine();
 
      System.out.println("isat2");
      s2 = in.nextLine();
 
      if (s1.compareTo(s2) > 0)
         System.out.println("isat1>isat2");
      else if (s1.compareTo(s2) < 0)
         System.out.println("isat1<isat2");
      else   
         System.out.println("isat1=isat2");
   }
}
