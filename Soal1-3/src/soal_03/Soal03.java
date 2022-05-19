package soal_03;

import java.util.Arrays;
import java.util.Scanner;

public class Soal03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan nilai n: ");
		int n = input.nextInt();
		int arr[] = new int [n];
		for(int i = 0; i < n; i++) {
			System.out.print("Masukkan nilai ke " + i+1);
			arr[i]=input.nextInt();
		}
		System.out.print(Arrays.toString(arr));
		input.close();
	}

}
