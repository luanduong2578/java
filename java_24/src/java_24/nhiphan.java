package java_24;

import java.util.Scanner;

public class nhiphan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cs = new Scanner(System.in);
		System.out.println("Nhap so thap phan: ");
		int thapphan = cs.nextInt();
		int sothapphan = thapphan;
		String nhiphan ="";
		while (thapphan>0) {
			nhiphan = (thapphan%2) + nhiphan;
			thapphan = thapphan/2;
		}
		
		System.out.println("so nhi phan cua " + sothapphan + ": " + nhiphan );
		
		
	}

}
