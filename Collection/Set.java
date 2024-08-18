package DATASTRUCTURE.Collection;
import java.util.*;
public class Set {
 public static void main(String[] args) {

    //Set
    HashSet<Integer> hashSet=new HashSet<Integer>();
// hashSet.add(10);
// hashSet.add(4);
// hashSet.add(6);
// hashSet.add(20);
// hashSet.add(6);

// System.out.println(hashSet);
 
//linkedHashset

LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<Integer>();

// linkedHashSet.add(10);
// linkedHashSet.add(10);
// linkedHashSet.add(60);
// linkedHashSet.add(1);
// linkedHashSet.add(20);
// linkedHashSet.addAll(hashSet);

// System.out.println(linkedHashSet.contains(1));

//TreeSet

TreeSet<String> treeSet=new TreeSet<String>();
treeSet.add("b");
treeSet.add("r");
treeSet.add("a");
treeSet.add("c");
treeSet.add("c");

System.out.println(treeSet);

}   
}
