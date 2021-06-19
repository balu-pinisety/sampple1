package java_logical_problems;
import java.util.*;
public class CouponNumbers {
public static void main(String[] args) {
	System.out.println("Program for Calling Coupon Numbers");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no.of distinct values");
	int nmb=sc.nextInt();
	Random ran= new Random();
	int distinct[]= new int[nmb];
	for(int i=0;i<nmb;i++)
	{
	int dist=ran.nextInt(10)+1;
	if(i==0) distinct[i]=dist;
	else
		{
			for(int j=0;j<i;j++) 
			{
				if(dist==distinct[j])
				{i--; break;}
				else if (j==i-1)
				distinct[i]=dist;
			}
		}
	}
	for(int a=0;a<nmb;a++) System.out.print(distinct[a]+" ");
	System.out.println();
	int count=0;
	int ticket[]= new int[10];
	for(int serial=0; serial<10; serial++)
	{
		int coupon_nmb=ran.nextInt(10)+1;
		ticket[serial]=coupon_nmb;
		System.out.println("ticket="+ticket[serial]);
		for(int a=0;a<serial;a++)
			{
			if(coupon_nmb==ticket[a]) {serial--; break;}
			}
		for(int j=0;j<nmb;j++)
		{
			if (coupon_nmb==distinct[j])
			{	count++;
				System.out.println(count);
				System.out.println("Coupon Number "+coupon_nmb+" is got on Ticket serial "+serial);
				break;
			}
		}
		
	}
}
}
