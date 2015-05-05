package main.java.org.gradle.test;

import java.util.List;

public class HelloWorld {
	public static void main(String[] args)
	{
		int a = 10;
		String d = new String("aa");
		changevalue(d);
		System.out.println(d);
		
//		List<Integer> s;?
	}
	
	
	
	public static void changevalue(Integer a)
	{
		a = 20;
	}
	
	public static void changevalue(String a)
	{
		a = "bb";
	}
}
