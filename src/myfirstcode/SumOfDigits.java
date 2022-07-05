package myfirstcode;
import java.util.*;
public class SumOfDigits {
	public static void main(String[] args)
	{
		int num=55,sum=0,digit;
		while(num>0)
		{
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println("the sum of digits of a number is:"+sum);
	}

}
