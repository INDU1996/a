package indu;

import java.util.Scanner;

public class SquareOrNot {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int [] a=new int[8];
		System.out.println("enter the numbers");
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
			}
		if(a[0]==a[2]&&a[1]==a[7]&&a[3]==a[5]&&a[4]==a[6]){
			System.out.println("the points make square");
			}
	    else
		System.out.println("not form square");
	}
}
