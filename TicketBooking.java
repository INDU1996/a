package indu;

import java.util.Scanner;

public class TicketBooking {
	public static void main(String args[])
	{
	    Scanner in=new Scanner(System.in);
	    System.out.println("Enter your name ");
	    String str=in.nextLine();
	    System.out.println("Enter your mobile number");
	    long mob=in.nextLong();
	    char c;
	    char arr[][]=new char[10][];
	       arr[0]=new char[]{' ','1','2','3','4','5'};
	       arr[1]=new char[]{' ','C',' ',' ',' ','D'};
	       arr[2]=new char[]{'1',' ',' ',' ','A','A'};
	       arr[3]=new char[]{'2','A','A',' ','A','A'};
	       arr[4]=new char[]{'3','A','A',' ','A','A'};
	       arr[5]=new char[]{'4','A','A',' ','A','A'};
	       arr[6]=new char[]{'5','A','A',' ','A','A'};
	       arr[7]=new char[]{'6','A','A',' ','A','A'};
	       arr[8]=new char[]{'7','A','A',' ','A','A'};
	       arr[9]=new char[]{'8','A','A','A','A','A'};
	       for(int i=0;i<arr.length;i++)
	       {
	    	   for(int j=0;j<arr[i].length;j++)
	    	   {
	    		   System.out.print(arr[i][j]+" ");
	    		   if(j==0)
	    		   {
	    			   System.out.print("  ");
	    		   }
	    	   }
	    	   if(i==0)
 		   {
 			   System.out.println();
 		   }
	    	   System.out.println();
	       }
	       System.out.println("\nC - Conductor\nD - Driver\nA - Available\nB - Booked");
	    do
	    {
	       System.out.println("Enter the row and column");
	       int row=in.nextInt();
	       int col=in.nextInt();
	       if((row+1==2&&(col==2||col==1))||(row+1!=9&&col==3))
	       {
	    	   System.out.println("Can't able to book.. There is no seat available there..");
	       }
	       else if(arr[row+1][col]=='A')
	       {
	    	   arr[row+1][col]='B';
	    	   System.out.println("Congratss!! "+str+" Successfully booked.. \nPlease show the sms we sent to your mobile number "+mob+" while boarding");
	    	   for(int i=0;i<arr.length;i++)
		       {
		    	   for(int j=0;j<arr[i].length;j++)
		    	   {
		    		   System.out.print(arr[i][j]+" ");
		    		   if(j==0)
		    		   {
		    			   System.out.print("  ");
		    		   }
		    	   }
		    	   if(i==0)
	 		   {
	 			   System.out.println();
	 		   }
		    	   System.out.println();
		       }
	       }
	       else if(arr[row+1][col]=='B')
	       {
	    	   System.out.println("Sorry.!! Already booked");
	       }
	       else if(row<2||col<1)
	       {
	    	   System.out.println("Enter a valid row and column number");
	       }
	       System.out.println("Do you wish to continue booking?? If yes press Y else press X");
	       c=in.next().charAt(0);
	    }while(c=='Y'||c=='y');
	    in.close();

}
}
