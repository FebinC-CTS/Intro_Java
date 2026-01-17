public class ArraytoString {
    public static void main(String[] args) {
        char[] charArray={'H','e','l','l','o',' ','W','o','r','l','d'};
        System.out.println(charArray); // toString() not required to print String s, int i, char c, char[] c as In Java, System.out.println(...) is overloaded for these types:
                                       //int[], double[], Object[] toString() is required

        String s = new String(charArray,6,5);
        System.out.println(s);

        String s1="java";//creating string by Java string literal    

        char ch[]={'s','t','r','i','n','g','s'};    
        String s2=new String(ch);//converting char array to string  

        String s3=new String("example");//creating Java string by new keyword    

        System.out.println(s1);    
        System.out.println(s2);    
        System.out.println(s3);    
 
    }
}
