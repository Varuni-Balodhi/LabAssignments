package Assignment1;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int n,grade;
	 System.out.println("Enter the number of students");
	 n=sc.nextInt();
	 int[] arr=new int[n];
	 for(int i=0;i<n;i++) {
		 while(true) {
		 try {	
			 System.out.println("Enter the grade for student"+(i+1));
			 grade=sc.nextInt();
			 if(grade<0||grade>100) {
				 System.out.println("Invalid input");
				 continue;
			 }
			 arr[i]=grade;
			 break;
		 }catch(Exception e) {
			 System.out.println("Invalid input");
			 sc.next();
		 }
	 }
}
	 System.out.println(findavg(arr));
 }
 public static double findavg(int[] arr) {
	 int sum=0;
	  for(int i:arr) {
		  sum+=i;
	  }
	  return (double) sum/arr.length;
 }
}
