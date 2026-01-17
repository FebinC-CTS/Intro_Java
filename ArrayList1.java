import java.util.*;

class ArrayList1 {
    public static void main(String[] args) {
        ArrayList <String> al = new ArrayList<>();
        al.add("Febin");
        al.add("Adithyan");

        //Iterator <String> itr = al.iterator();
        //while(itr.hasNext()){
          //  System.err.println(itr.next());
        //}
        for (String name: al){
            System.out.println(name);
        }
    }
}