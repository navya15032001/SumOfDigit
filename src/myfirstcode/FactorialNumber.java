package myfirstcode;
import java.util.*;
public class FactorialNumber {
public static void main(String[] args) {
	int fact=1;
	int number=5;
	for(int i=1;i<=number;i++)
	{
     fact=fact*i;
	}
	System.out.println("The factorial of the" +number+" is"+ fact);
}
}
