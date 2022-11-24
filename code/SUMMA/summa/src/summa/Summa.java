package summa;

import java.util.Scanner;

public class Summa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("inserisci due numeri");
		int n1, n2;
		
		n1 = input.nextInt();
		n2 = input.nextInt();
		
		System.out.println(" Somma : ");
		System.out.println(n1 + n2);
		System.out.println("media : ");
		System.out.println((n1 + n2)/2 );
		
		
		
	}

}
