

import java.util.Scanner;
import java.io.*;
public class ShiftCipherApp {
	public static void main(String[] args) throws IOException
	{
	Scanner sc = new Scanner(System.in);
	int shift;
	String message;
	System.out.println("Shift Cipher Algorithm Quiz");
	System.out.println("===========================");
	System.out.print("How many shifts would you want to use? ");
	try {
	shift = sc.nextInt();
	sc.nextLine(); // Consume the next line
	} catch (Exception e) {
	System.out.println("That is not an integer.");
	System.exit(0);
	return;
	}
	System.out.println("Please enter a message to hit enter to encrypt it.");
	message = sc.next();
	sc.close();
	
	ShiftCipher sc1 = new ShiftCipher (message, shift);
	sc1.cipher();
	System.out.println (" Ciphered : " + sc1.getCiphered());
	sc1.decipher();
	System.out.println(" Desciphered : " + sc1.getDeciphered());
	}
}
