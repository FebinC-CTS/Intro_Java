import java.util.StringTokenizer;

public class String5 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello ");    
        sb.append("Java");  
        System.out.println(sb);
        
        sb.insert(1,"Java"); //now original string is changed    
        System.out.println(sb);

        sb.replace(1,3,"Java");    
        System.out.println(sb);

        sb.delete(1,3);    
        System.out.println(sb);

        sb.reverse();    
        System.out.println(sb);

        sb.reverse();    
        System.out.println(sb);

        System.out.println(sb.capacity());//default 16    
        sb.append("Hello");    

        System.out.println(sb.capacity());//now 16    
        sb.append("java is my favourite language");    
        System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2    

        StringTokenizer st = new StringTokenizer("My name is Febin"," ");  
        while (st.hasMoreTokens()) {  
            System.out.println(st.nextToken());  
     }  
    }
}
