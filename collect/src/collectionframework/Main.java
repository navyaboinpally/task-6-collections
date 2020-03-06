package collectionframework;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Main {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		Linkedlist list=new Linkedlist();
		list.insert(5);
		list.insert(3);
		list.insert(12);
		list.insert(19);
		list.insert(32);
		list.insert(45);
		list.insert(1);
		list.insert(76);
		list.insert(11);
		list.insert(25);
		System.out.print("Enter the method :\n(1.fetch 2.add 3.delete 4.print)");
		int s=sc.nextInt();
		
		if(s==1)
		{
			System.out.print("Enter the index:\n(between 1 to 10)");
			int n=sc.nextInt();
			list.fetch(n);
		}
		else if(s==2)
		{
			System.out.println("enter how many numbers u need to add extra");
			int t=sc.nextInt();
			for(int i=0;i<t;i++)
			{
				System.out.println("enter where u need to add in list 1.starting 2.ending  3.between");
				int k=sc.nextInt();
				if(k==1)
				{
					System.out.println("enter number to add");
					int a=sc.nextInt();
					list.addAtStart(a);
					
				}
				if(k==2)
				{
					System.out.println("enter number to add");
					int b=sc.nextInt();
					list.insert(b);
				}
				if(k==3)
				{
					System.out.println("enter at which index u needed and value to add");
					int d=sc.nextInt();
					int e=sc.nextInt();
					list.add(d,e);
				}
				System.out.println("after inserting");
                list.print();

			}
		}
		else if(s==3)
		{
			System.out.print("Enter the index:");
			int n=sc.nextInt();
			list.delete(n);
			System.out.println("\nThe Final list:");
			list.print();
		}
		else if(s==4)
		{
			
			System.out.print("The List:\n");
			list.print();
		}
		
	}
	
}
