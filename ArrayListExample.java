package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void showList()
	{
		ArrayList<String>lst=new ArrayList<String>();
		lst.add("abcd");
		lst.add("eeee");
		lst.add("fghi");
		lst.add("10");
		lst.add("jjjj");
		lst.add("20");
		lst.add(3,"6");
		System.out.println("Size"+lst.size());
		System.out.println("Removed"+lst.remove(5));
		System.out.println("Size After Removal"+lst.size());
		Iterator<String>it=lst.iterator();
		Object obj=Collections.min(lst);
		Object ob=Collections.max(lst);
		System.out.println("min"+obj);
		System.out.println("max"+ob);
		Collections.sort(lst);
		for(String str:lst)
		{
			System.out.println(str);
		}
		/*while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showList();

	}

}
