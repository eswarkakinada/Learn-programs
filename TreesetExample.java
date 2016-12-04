package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreesetExample {
public static void showTree(){
		
		TreeSet<String>set=new TreeSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Two");/// duplication not allowed in set
		set.add("Five");
		Iterator<String>it=set.iterator();
		while(it.hasNext())
		   {
			System.out.println(it.next());
		   }
		}
	
	
	
	
	public static void main(String[] args) {
	
showTree();
	}

}
