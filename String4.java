public class String4 {
    public static void main(String[] args) {
        String s="  Sachin";    
        System.out.println(s.toUpperCase());//SACHIN    
        System.out.println(s.toLowerCase());//sachin    
        System.out.println(s); //Sachin(no change in original)
  
        System.out.println(s);  //  Sachin      
        System.out.println(s.trim());

        System.out.println(s.startsWith("  Sa"));  //true    
        System.out.println(s.endsWith("n"));  //true 

        System.out.println(s.charAt(3));

        System.out.println(s.length());

        int a=10;    
        String s1=String.valueOf(a);    
        System.out.println(s1+10);    

        String replaceString=s.replace("Sachin","Dhoni");      
        System.out.println(replaceString);   
    }
}
