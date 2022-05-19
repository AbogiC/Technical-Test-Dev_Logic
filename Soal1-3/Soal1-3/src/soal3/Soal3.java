package soal3;

import java.util.Scanner;

public class Soal3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan nilai n: ");
		int n = input.nextInt();
		int arr[] = new int [n];
		for(int i = 0; i < n; i++) {
			System.out.print("Masukkan nilai ke-" + (i+1));
			arr[i]=input.nextInt();
		}
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(arr[i]>arr[j]) {
					int a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			if(arr[i]%3!=0) {
				System.out.print(arr[i]+" ");
			}
		}
		input.close();
	}

}
