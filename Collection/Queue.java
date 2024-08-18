package DATASTRUCTURE.Collection;
import java.util.*;
public class Queue {
    public static void main(String[] args) {
        //Queue
  LinkedList<Integer>queue=new LinkedList<Integer>();
// queue.offer(10);
// queue.offer(20);
// queue.add(11)  ;
// queue.offer(1);


// System.out.println(queue);
// queue.poll();
// System.out.println(queue);
// System.out.println(queue.peek());

Deque<Integer> deque=new ArrayDeque<Integer>();

// deque.offer(10);
// deque.offer(20);
// deque.offerLast(100);
// deque.pollLast();
// deque.offerFirst(200);

// System.out.println(deque);
PriorityQueue<Integer> priorityQueue=new PriorityQueue<Integer>();

// priorityQueue.offer(10);
// priorityQueue.offer(3);
// priorityQueue.offer(20);
// priorityQueue.offer(2);
// priorityQueue.add(1);

// System.out.println(priorityQueue);

// HashMap<Integer,String> hashMap=new HashMap<Integer,String>();

// hashMap.put(2,"Ullas");
// hashMap.put(1, "ABC");
// System.out.println(hashMap);

// TreeMap<Integer,String> hashMap1=new TreeMap<Integer,String>();

// hashMap1.put(2,"Ullas");
// hashMap1.put(1, "ABC");

// System.out.println(hashMap.values());

int a[]={10,30,1,4,2,6,8,90};
int b[]={10,20,1,4,2,6,8,90};
Arrays.sort(a);
// for(int i:a)
// {
   
//     System.out.print(i+",");
// }


System.out.println(Arrays.binarySearch(a, 6));
System.out.println(Arrays.compare(a, b));


    }
}
