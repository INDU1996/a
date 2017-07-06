package indu;
import java.util.Scanner;
public class AmstrongorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, nu, num=0, rem;
        Scanner a = new Scanner(System.in);

        n = a.nextInt();
		
        nu = n;
		
        while(nu != 0)
        {
            rem = nu%10;
            num = num + rem*rem*rem;
            nu = nu/10;
        }
        if(num == n)
        {
            System.out.print("Armstrong Number");
        }
        else
        {
            System.out.print("Not an Armstrong Number");
        }
	}

}
