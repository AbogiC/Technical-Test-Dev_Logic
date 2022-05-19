package soal1;

import java.util.Scanner;

public class Soal1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan nilai n: ");
		int n = input.nextInt();
		for(int i = 0; i < n; i++) {
			if((i+1)%3==0) {
				System.out.print("OK ");
			} else if((i+1)%4==0) {
				System.out.print("YES ");
			} else {
				System.out.print((i+1)+" ");
			}
		}
		input.close();
	}
}
