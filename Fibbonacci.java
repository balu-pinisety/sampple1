package java_logical_problems;
import java.util.*;
public class Fibbonacci {
public static void main(String[] args) {
	System.out.println("Program for Fibbonacci series");
	Scanner sc = new Scanner(System.in);		
	System.out.println("Enter a number for a range: ");
	int rng = sc.nextInt();
	int a=0,b=1,c;
	System.out.println("fibonnaci series for given range:");
	System.out.print(a+" "+b+" ");
	for(int i=1;i<rng;i++)
	{
		c=a+b;
		a=b;
		b=c;
		System.out.print(c+" ");
	}
}
}
