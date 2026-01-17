public class StringComp {
    public static void main(String[] args) {
        String s1 = "Febin";
        String s2 = "Febin";
        String s3 = new String("Febin");
        String s4 = "fEBIN";

        //equals check only the content of the string
        //.equals()
        System.out.println(s1.equals(s2));  
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4));

        System.out.println("----------------------------");
    
        //In Java, the == operator compares references rather than values.
        //==
        System.out.println(s1==s2);  
        System.out.println(s1==s3);
        System.out.println(s1==s4);

        System.out.println("----------------------------");

        // String class compareTo() method compares values lexicographically and returns an integer value 
        // that describes if first string is less than, equal to or greater than second string.
        //compareTo()
        System.out.println(s1.compareTo(s2));  
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));

        //s1 == s2 : The method returns 0.
        //s1 > s2 : The method returns a positive value.
        //s1 < s2 : The method returns a negative value.

        System.out.println("----------------------------");

        //startWith() and endsWith()
        String str = "String Compare";  
        System.out.println(str.startsWith("String")); // true  
        System.out.println(str.endsWith("Compare"));  // true 
        System.out.println(str.startsWith("Stri")); // true  
        System.out.println(str.endsWith("mpare"));  // true 


    }
}
