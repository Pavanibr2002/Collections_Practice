package collections_practice;
import java.util.*;
public class deque {

	public static void main(String[] args) {
		Deque<String> deq=new ArrayDeque<String>();
		deq.add("Gautam");
		deq.add("Karan");
		deq.add("Ajay");
		for(String str:deq) {
			System.out.println(str);
		}

	}

}
