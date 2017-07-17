package indu;

import java.util.Scanner;

public class EncodeString {
	 public static void main(String args[])
	    {
	        Scanner x=new Scanner(System.in);
	        String x1=x.nextLine();
	        String x2=x.nextLine();
	        for(int i=0;i<x1.length();i++)
	        {
	            int a=((int)x1.charAt(i))+10;
	            if(a>122)
	            {
	                a=a-26;
	            }
	            System.out.print((char)a);
	        }
	        System.out.print(" ");
	        for(int j=0;j<x2.length();j++)
	        {
	            if(j==0||j==x2.length()-1)
	            {
	                System.out.print(x2.charAt(j));
	            }
	            else
	            {
	            int b=((int)x2.charAt(j))+10;
	            if(b>122)
	            {
	                b=b-26;
	            }
	            System.out.print((char)b);
	            }
	        }
	    }
}
