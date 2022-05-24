package soal2;

import java.util.Scanner;

public class Soal2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan nilai n: ");
		int n = input.nextInt();
		//case 1
		for(int i = 0; i < n; i++){
			for(int j = 0; j <= i; j++){
				System.out.print((i+1) + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		//case 2
		for(int i = 0; i < n; i++){
			for(int j = i+1; j > 0; j--){
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		//case 3
		int o = 1;
		int x = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(o + " ");
				o = o + x;
				if(o == 5 || o == 1) {
					x = x*(-1);
				}
			}

			System.out.println();
		}
		System.out.println();
		
		//case 4
		int k = 1;
		int l = 1 + n; 
		int arr[][] = new int[n][n];
		for(int i = 0; i < n; i++) {
			if(i%2==0) {
				for(int j = 0; j < n; j++) {
					arr[j][i] = k++;
				}
				k = k + n;
			} else {
				for(int j = n-1; j >=0; j--) {
					arr[j][i] = l++;
				}
				l = l + n;
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		input.close();
	}

}
