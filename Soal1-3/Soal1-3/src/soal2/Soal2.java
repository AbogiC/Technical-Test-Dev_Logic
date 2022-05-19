package soal2;

import java.util.Arrays;
import java.util.Scanner;

public class Soal2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan nilai n: ");
		int n = input.nextInt();
		//case 1
//		for(int i = 0; i < n; i++){
//			for(int j = 0; j <= i; j++){
//				System.out.print(i+1);
//			}
//			System.out.println();
//		}
		
		//case 2
//		for(int i = 0; i < n; i++){
//			for(int j = i+1; j > 0; j--){
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		//case 3
		
		
		//case 4
		int a = 1;
		int arr[][] = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[j][i]=a;
				a++;
			}
		}
		System.out.print(Arrays.toString(arr));
		input.close();
	}

}
