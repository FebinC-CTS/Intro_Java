import java.util.*;

class HashMap1{
    public static void main(String[] args) {
        HashMap <String, Integer> hp = new HashMap<>();
        hp.put("Febin", 252);
        hp.put("Adithyan", 250);

        System.out.println("Value of Febin: "+hp.get("Febin"));

        for(Map.Entry<String,Integer> entry : hp.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ": " +value);
        }

        if(hp.containsKey("Febin")){
            System.out.println("Febin is present!");
        }

        hp.remove("Adithyan");

        /*for(Map.Entry<String,Integer> entry : hp.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ": " +value);
        }*/

        for(Map.Entry m:hp.entrySet()){  
            System.out.println(m.getKey()+" "+m.getValue());  
      }  
    System.out.println(hp);

    }
}