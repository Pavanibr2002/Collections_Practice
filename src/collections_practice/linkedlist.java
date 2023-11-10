package collections_practice;
import java.util.*;
public class linkedlist {
		public static void main(String[] args) {
			LinkedList<String> li=new LinkedList<String>();
			li.add("Ravi");
			li.add("Vijay");
			li.add("Ravi");
			li.add("Ajay");
			Iterator<String> itr=li.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}

	}

}
