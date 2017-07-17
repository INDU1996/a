package indu;

import java.util.Scanner;

public class MeetingRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of n(number of person)");
			int n=sc.nextInt();
			System.out.println("Enter the stating meeting time of every person");
			int s[]=new int[n];
			for(int i=0;i<n;i++){
				s[i]=sc.nextInt();
			}
			System.out.println("Enter the finishing meeting time of every person");
			int f[]=new int[n];
			for(int i=0;i<n;i++){
				f[i]=sc.nextInt();
			}
			int t[]=new int[n];
			for(int i=0;i<n;i++){
			int diff=f[i]-s[i];
			t[i]=diff;
			}
			int sum=0;
			for(int i=0;i<n;i++){
				sum=sum+t[i];
			}
			int max=0;
			for(int i=0;i<n;i++){
				if(t[i]>max){
					max=t[i];
				}
			}
			int max_meeting=n*(n-1);
			System.out.println("The maximum time taken of single meeting is: "+max);
			System.out.println("The total time taken by all meeting is: "+sum);
			System.out.println("The maximum number of meeting posible is:"+max_meeting);
		}

	}
