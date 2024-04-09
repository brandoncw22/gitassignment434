package basic;

import java.util.Scanner;

public class Basic
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value\n");
		int val = input.nextInt();
		System.out.printf("\n%d\n", val);
	}
}
