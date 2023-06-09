package Assignment2;

import java.util.*;

class Address{
	String p;
	String at;
	String post;
	Address(String p,String at,String post)
	{
		this.p=p;
		this.at=at;
		this.post=post;
	}
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String,Object> tm=new TreeMap<>();
		Scanner so=new Scanner(System.in);
		System.out.println("Enter no of members");
		int l=so.nextInt();
		Address[] ao=new Address[l];
		String n,a;
		for(int i=0;i<l;i++)
		{
			System.out.println("Name");
			n=so.next();
			System.out.println("Plot No");
			String p=so.next();
			System.out.println("At");
			String at=so.next();
			System.out.println("Post");
			String post=so.next();
			ao[i]=new Address(p,at,post);
			tm.put(n, ao[i]);
		}
		Set<String> s=tm.keySet();
		for (String e: s)
		{
			Address b=(Address) tm.get(e);
			System.out.println("[" + e + ", " + b.p + " " + b.at + " " + b.post + "]");
		}
		
	}

}