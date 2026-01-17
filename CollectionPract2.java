// Create a Hashset of integers, add duplicate values, and print the set

import java.util.*;

public class CollectionPract2{
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>();
        h1.add(1);
        h1.add(2);
        h1.add(2);
        h1.add(3);
        h1.add(3);
        h1.add(4);

        for(Integer value: h1){
            System.out.println(value);
        }
    }
}