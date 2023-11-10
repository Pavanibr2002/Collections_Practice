package collections_practice;
import java.util.*;
public class stack {
	public static void main(String args[])
	{
		Stack<String> st=new Stack<String>();
		st.push("Ayush");
		st.push("Garvit");
		st.push("Amit");
		st.push("Ashish");
		st.push("Garima");
		st.pop();
		Iterator<String> itr=st.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
