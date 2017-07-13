package indu;
import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		String p=new String();
		p=a.next();
		StringBuffer b=new StringBuffer();
		for(String s:p.split(" ")) {
			b.append(Character.toUpperCase(s.charAt(0)));
			if(s.length()>1) {
				b.append(s.substring(1,s.length()).toLowerCase());
				
			}
				}
			
			System.out.println(b);
		}
	
	}
