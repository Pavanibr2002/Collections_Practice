package collections_practice;
import java.util.*;
public class vector {
	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("Ravi");
		v.add("Vijay");
		v.add("Ravi");
		v.add("Ajay");
		Iterator<String> itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

}

}
