public class String3 {
    public static void main(String[] args) {
        String s1="Java";
        String s2="Java";
        System.out.println("s1==s2: " +(s1==s2));

        String s3= new String("Java");
        String s4= new String("Java");
        System.out.println("s3==s4: " +(s3==s4));

        String s5=s1.intern();
        System.out.println("s5==s1: " +(s5==s1));
        System.out.println("s5==s2: " +(s5==s2));

        String s6 = new String("Java").intern();
        System.out.println("s6==s1: " +(s6==s1));

        // s1, s2, s5, s6 → all point to the same pooled "Java" object.
        // s3, s4 → each point to different heap objects "Java".
    }
}
