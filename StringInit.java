public class StringInit {
    public static void main(String[] args){
        char ch[] = {'F','E','B','I','N'};
        String first = new String(ch); //String first = new String("FEBIN"); 
        System.out.print(first);

        String last="CHANDY";
        System.out.println(" "+last);

        String full1=first + " " + last;
        System.out.println(full1);

        String full=first.concat(" ").concat(last);
        System.out.println(full);
    }
}
// Java String class provides a lot of methods to perform operations on strings such as 
// compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring()...

