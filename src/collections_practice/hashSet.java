package collections_practice;
import java.util.*;
public class hashSet {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("Gautam");
		set.add("Karan");
		set.add("Ajay");
		set.add("Gautam");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		}

	}


