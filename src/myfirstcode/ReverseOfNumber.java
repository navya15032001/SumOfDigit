package myfirstcode;
import java.util.*;
public class ReverseOfNumber {
public static void main(String[] args)
{
	int temp=969, num=969,i=0;
	while(num>0)
	{
		int r=num%10;
		i=(i*10)+r;
		num=num/10;
	}
	System.out.println("the reverse of the number is: " +i);
	if(temp==i) {
		System.out.println("the number is palindrome");
	}
	else {
		System.out.println("the number is not a pelindrome");
	}
}

}
