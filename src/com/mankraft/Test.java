package com.mankraft;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	
	public static void main(String args[])
	{
	ArrayList<Student> al=new ArrayList<Student>();

	al.add(new Student(111,"srinath",12));
	al.add(new Student(141,"palsa",14));
	al.add(new Student(101,"goud",16));
	
	Collections.sort(al);
	for(Student st:al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
	}
	
	
	
	}

}
