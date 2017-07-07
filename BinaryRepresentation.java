package indu;

public class BinaryRepresentation {
	public static void main(String[] args) {
	    int num1=2;
	    int num2=5;
	    int nirbinary = (num1 << 2) | (num2 << 5) ;
	    System.out.println(nirbinary);
	    String nir=  Integer.toBinaryString(nirbinary);
	    System.out.println(nir);
	    }
}
