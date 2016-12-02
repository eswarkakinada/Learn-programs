package ComparbleOrComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student12 {
	int  id,age;
	String name;
	
	public Student12(int id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}
}


class nameComparator implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		Student12 s1 =(Student12)obj1;
		Student12 s2 =(Student12)obj2;
		return(s1.name.compareTo(s2.name));
	}}

	class ageComparator implements Comparator{

		@Override
		public int compare(Object obj1, Object obj2) {
			Student12 s1 =(Student12)obj1;
			Student12 s2 =(Student12)obj2;
			if(s1.age==s2.age)
			return 0;
			else if (s1.age<s2.age)
				return -1;
			else
				return 1;
		}

}

	
public class Student1{
	public static void main(String[] args) {
		ArrayList a1= new ArrayList();
		a1.add(new Student12(1,24,"Eswar"));
		a1.add(new Student12(2,21,"Harsha"));
		a1.add(new Student12(3,22,"Teja"));
		a1.add(new Student12(4,24,"Ankitha"));
		a1.add(new Student12(5,21,"Harika"));
		a1.add(new Student12(6,22,"Navya"));
		
		Collections.sort(a1,new nameComparator());
		Iterator it = a1.iterator();
		while(it.hasNext()){
			Student12 s1= (Student12)it.next();
			System.out.println(s1.name+" " +s1.id+" " +s1.age);
		}
		
		System.out.println("-------------------");
		
		Collections.sort(a1,new ageComparator());
		Iterator it1 = a1.iterator();
		while(it1.hasNext()){
			Student12 s2= (Student12)it1.next();
			System.out.println(s2.name+" " +s2.id+" " +s2.age);
		}
		
}


	
	
	
}
