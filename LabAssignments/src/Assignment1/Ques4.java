package Assignment1;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int row;
	System.out.println("Enter the number of rows");
	row=sc.nextInt();
	int[][] arr=new int[row][];
	for(int i=0;i<row;i++) {
		arr[i]=new int[i+1];
	}
	for(int i=0;i<row;i++) {
		for(int j=0;j<=i;j++) {
			arr[i][j]=(j+1);
		}
	}
	PrintTheArray(arr);
  }
public static void PrintTheArray(int[][] arr) {
	for(int[] a: arr) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
			if(i<a.length) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
