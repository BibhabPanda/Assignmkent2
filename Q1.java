package Assignment2;

import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet ts=new TreeSet();
		Scanner so=new Scanner(System.in);
		System.out.println("Enter the elements");
		int n=so.nextInt();
		while (n!=-1)
		{
			ts.add(n);
			n=so.nextInt();
		}
		System.out.println("Enter the element to find");
		System.out.println(ts.contains(so.nextInt()));
		System.out.println("Enter the element to remove");
		ts.remove(so.nextInt());
		System.out.println(ts);

	}

}
