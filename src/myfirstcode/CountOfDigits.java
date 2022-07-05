package myfirstcode;
import java.util.*;
public class CountOfDigits {
public static void main(String[] args) {
	int num=456,count=0;
	while(num!=0)
	{
		num=num/10;
		count++;
		}
	System.out.println("the number of digits in 456 is "+ count);
	
}
}
