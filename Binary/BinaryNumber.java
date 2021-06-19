package java_logical_problems;
import java.util.*;
public class BinaryNumber {
public static void main(String[] args) {
	System.out.println("Program to find the Binary number");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to find binary value:");
	int nmb=sc.nextInt();
	int Binary=0,Sum=0;
	while(nmb>0) 
	{
	for(int i=0; i<nmb; i++) 
	{
		
		if (nmb == (int)Math.pow(2,i))
		{
			Sum=(int) Math.pow(10,(i));
			Binary+=Sum;
			nmb-=(int) Math.pow(2,(i));
			break;
		}
		else if (nmb < (int)Math.pow(2,i)) 
		{
			Sum=(int) Math.pow(10,(i-1));
			Binary+=Sum;
			nmb-=(int) Math.pow(2,(i-1));
			break;
		}
	}
	}
	System.out.println(Binary);
}
}