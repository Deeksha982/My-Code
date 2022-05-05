 class Student {
	String name ; 
	int age;
	Student(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public String toString()
	{
		return name + "@" + hashCode();
	}
	
	@Override
	public int hashCode() 	{
		return age;
	}

	public static void main(String[] args) {
		Student s1 = new Student ("Deeksha",21);
		Student s2 = new Student ("Deeksha", 21);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println(s1.equals(new StringBuffer("Ravi")));
	}

 
 public boolean equals(Object O)
 {
    try
	 {
		 String name1=this.name;
		 int age1=this.age;
		 Student s = (Student)O;
		 
		 String name2=s.name;
		 int age2=s.age;
		 if(name1.equals(name2)&& age1==age2)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 } 
	 }
	 catch(ClassCastException e)
	 {
		 return false;
	 }
	 catch(NullPointerException e)
	 {
		 return false;
	 }
 }}
 
// boolean equals(object O)
// {
//	 if(O instanceof Student)
//	 {
//		 if (name.equals(O.name)&& age==O.age)
//		 {
//			 return true;
//		 }
//		 else
//		 {
//			 return false;
//		 }
//	 }
//	 else
//	 {
//		 return false ;
//	 }
// }
// 
