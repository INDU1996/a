package indu;

import java.util.Scanner;

public class MaxLength {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the string");
		Scanner s=new Scanner(System.in);
String a=s.next();
String b="";
int i=0;
int j=0;
String max="";
for(i=0;i<a.length();i++){
	for(j=i+1;j<a.length();j++){
		b=a.substring(i,j+1);
		System.out.println(b);
		if(max.length()<b.length()){
			max=b;
			
		}
     }
	}
System.out.println("Largest String is:"+max);
String c=new StringBuffer(max).reverse().toString();	
if(c.equals(a)){
	System.out.println("");
}
else {
	System.out.println(max);
}

	}
}
