import java.util.stream.Collectors;
import java.util.*;  

public class StringConcat {
    public static void main(String[] args) {

        //"+" (String concatenation) Operator
        String s= "Sachin" + " Tendulkar";
        System.out.println(s);
        String s1=50+30+"Sachin"+40+40;  
        System.out.println(s1);
        //After a string literal, all the + 
        // will be treated as string concatenation operator.
        
        System.out.println("----------------------------");

        //Using the String.concat() Method
        String s10="Sachin ";  
        String s2="Tendulkar";  
        String s3=s10.concat(s2);
        System.out.println(s3);  

        System.out.println("----------------------------");

        //Java StringBuilder or StringBuffer Class
        String firstName = "Febin";
        String lastName = "Chandy";
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, ");
        sb.append(firstName);
        sb.append(" ");
        sb.append(lastName);
        System.out.println(sb);
        String result = sb.toString();
        System.out.println(result);

        System.out.println("----------------------------");

        //String.join() Method
        String result1 = String.join(" ","Hello,", firstName, lastName);
        System.out.println(result1);

        System.out.println("----------------------------");

        //String.format() Method
        String result2 = String.format("Hello, %s %s", firstName, lastName);
        System.out.println(result2);

        System.out.println("----------------------------");

        //Collectors.joining() Method (Java 8 and above versions)
        List<String> liststr = Arrays.asList("abc","pqr","xyz");
        String str = liststr.stream().collect(Collectors.joining(", "));
        System.out.println(str.toString());

        System.out.println("----------------------------");

        //Substring using .substring
        String s5="Sachin Tendulkar";    
        System.out.println("Original String: " + s5);  
        System.out.println("Substring starting from index 6: " +s5.substring(6));//Tendulkar    
        System.out.println("Substring starting from index 0 to 6: "+s5.substring(0,6)); //Sachin 
        System.out.println("Substring starting from index 0 to 6: "+s5.substring(0)); //Sachin Tendulkar

        System.out.println("----------------------------");

        String text= new String("Hello, My name is Sachin");  
        String text1= new String("Hello. My. name. is. Sachin");  

        /* Splits the sentence by the delimeter passed as an argument */  
        String[] sentences = text.split("\\.");  //split where . is present no . here
        String[] sentences2 = text1.split("\\.");  

        String[] sentences1 = text.split(",");  

        System.out.println(Arrays.toString(sentences)); 
        System.out.println(Arrays.toString(sentences2));  
 
        System.out.println(Arrays.toString(sentences1));  

    }
}
