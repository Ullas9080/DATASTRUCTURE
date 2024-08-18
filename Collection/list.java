package DATASTRUCTURE.Collection;
import java.util.*;

public class list{
public static void main(String args[]) throws InterruptedException
{

// int a[]=new int[2];
// a[0]=1;
// a[1]=2;
// a[2]=3;


//ArrayList
ArrayList<Integer> list=new ArrayList<>();

// list.add(1);
// list.add(2);
// list.add(3);

// list.add(1,4);

// System.out.println(list);


LinkedList<Integer> link=new LinkedList<Integer>();

// link.add(10);
// // Thread.sleep(1000);
// link.add(20);
// System.out.println(link);

//Vector

Vector<Integer> vector=new Vector<Integer>();

// vector.add(1);
// vector.add(3);
// vector.add(4);

// System.out.println(vector);

//Stack

Stack<Integer> stack=new Stack<Integer>();

stack.push(1);
stack.push(1);
stack.push(3);

System.out.println(stack.pop());
System.out.println(stack);
}
}