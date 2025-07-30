package avinash;

public class Widening_Type_Conversion 
{
      public static void main(String[] args)
      {
    	  int a = 19;
    	  long k = a;
    	  float l = k;
    	  System.out.println("Integer: "+a);
    	  System.out.println("Long: "+k);
    	  System.out.println("Float: "+l);
    	  if(a==k && k==l)
    	  {
    		  System.out.println("No data lost");
    	  }
    	  else
    	  {
    		  System.out.println("Data lost");
    	  }
      }
}
