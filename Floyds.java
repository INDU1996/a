package indu;
import java .util.Scanner;
public class Floyds {
	    public static void main(String args[])
	    {
		
	        int range, i, j, k=1;
	        Scanner scan = new Scanner(System.in);
			
	        System.out.print("Enter Range  : ");
	        range = scan.nextInt();
			
	        System.out.print("Floyd's Triangle :\n");
	        for(i=1; i<=range; i++)
	        {
	            for(j=1; j<=i; j++, k++)
	            {
	                System.out.print(k + " ");
	            }
	            System.out.println();
				
	        }
	    }
	}
