package indu;

import java.util.Scanner;

public class AvgSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		System.out.println("Enter the array element");
		int len1;
		int len2;
		if(size%2==0) {
			len1=size/2;
		}
		else {
			len1=size/2+1;
		}
		len2=size-len1;
		int div1[]=new int[len1];
		int div2[]=new int[len2];
		int tot1=0;
		int tot2=0;
		for(int i=0;i<len1;i++) {
			div1[i]=sc.nextInt();
			tot1+=div1[i];
		}
		for(int i=0;i<len2;i++) {
			div2[i]=sc.nextInt();
			tot2+=div2[i];
		}
		int avg1=tot1/len1;
		int avg2=tot2/len2;
		if(avg1==avg2) {
			System.out.println("POSSIBLE");
		}
		else {
			System.out.println("NOT POSSIBLE");
		}
		sc.close();
	}

}
