package collections_practice;
import java.util.*;
public class priorityQueue {
	public static void main(String args[])
	{
		PriorityQueue<String> q=new PriorityQueue<String>();
		q.add("Amit Sharma");
		q.add("Vijay Raj");
		q.add("JaiShankar");
		q.add("Raj");
		System.out.println("head: "+q.element());
		System.out.println("head: "+q.peek());
		System.out.println("iterating the queue elements");
		Iterator itr=q.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		q.remove();
		q.poll();
		System.out.println("After removing two elements");
		Iterator<String> itr2=q.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}

}
}
