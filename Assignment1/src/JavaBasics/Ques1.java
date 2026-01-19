
package JavaBasics;
import java.util.Arrays;
public class Ques1 {
  public static void main(String[] args) {
	  int a=0;
	  int b=1;
	  int[] fib=Fibonacci(a,b);
	  System.out.println(Arrays.toString(fib));
	  System.out.println(FindAverage(fib));
  }
  public static int FindAverage(int[] fib) {
	  int sum=0;
	  for(int i=0;i<fib.length;i++) {
		  sum+=fib[i];
	  }
	  return sum/20;
  }
  public static int[] Fibonacci(int a,int b) {
	  int[] arr=new int[20];
	  arr[0]=0;
	  arr[1]=1;
	  for(int i=2;i<20;i++) {
		  arr[i]=arr[i-1]+arr[i-2];
	  }
	  return arr;
  }
}

