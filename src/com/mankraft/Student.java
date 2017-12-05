package com.mankraft;


 class Student implements Comparable<Student>
{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age)
    {
    	this.rollno=rollno;
    	this.name=name;
    	this.age=age;
    }
	@Override
	public int compareTo(Student st) {
   if(age==st.age)
       System.out.println("haiii this comparable");
    	   return 0;  
      
       else if(age>st.age)
       
    	   
    	 return 1;  
       else
    	   return -1;
       }
		
	}
	
