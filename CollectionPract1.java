//Write a program to insert 5 students into an ArrayList and display them

import java.util.ArrayList;
import java.util.Iterator;


public class CollectionPract1 {
    public static void main(String[] args) {
        ArrayList<String> st5 = new ArrayList<>();
        st5.add("Febin");
        st5.add("Adithyan");
        st5.add("Anirudh");
        st5.add("Angela");
        st5.add("Christina");

        /*for(String name: st5){
            System.out.println(name);
        }*/
       Iterator<String> itr = st5.iterator();
       while(itr.hasNext()){
        System.out.println(itr.next());
       }
    }
}
