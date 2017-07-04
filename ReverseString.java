package rev;
import java.lang.*;
 import java.io.*;
 import java.util.*;

public class ReverseString {
	public static void main(String args[]){
		String str="indu";
		StringBuffer s1=new StringBuffer(str);
		StringBuffer s2=s1.reverse();
		System.out.println(s2);
	}
}