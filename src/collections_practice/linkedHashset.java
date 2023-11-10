package collections_practice;
import java.util.*;
public class linkedHashset {
	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("Gautam");
		set.add("Karan");
		set.add("Ajay");
		set.add("Karan");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		}

}
