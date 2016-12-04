package Collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void showMap()
	{
	Map< Integer,String >map=new TreeMap<Integer,String>();
	TreeMap<Integer,String>tmap=new TreeMap<Integer,String>();
	tmap.put(1,"Data1");
	tmap.put(25,"Data2");
	tmap.put(70,"Data3");
	tmap.put(60,"Data4");
	
	map.put(10, "Ten");
	map.put(9, "Nine");
	map.put(11, "Four");
	map.put(1, "Six");
	Set<Integer>set=map.keySet();
	Iterator<Integer>it=set.iterator();
	
	
	Set set1= tmap.entrySet();
	Iterator iterator =set1.iterator();
	while(iterator.hasNext()){
		Map.Entry eswar =(Map.Entry)iterator.next();
		System.out.println("Key is :" +eswar.getKey()+" & Value is : " +eswar.getValue());
	}
	Iterator<Integer>it1=set1.iterator();
	
	while(it1.hasNext())
	{
		System.out.println(it1.next());
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       showMap();
	}
}
