//The CharSequence interface is used to represent the sequence of characters. 
// String, StringBuffer and StringBuilder classes implement it. 
// It means, we can create strings in Java by using these three classes.

class String2{
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("Hello"); 
        System.out.println(sb);

        sb.append(" World!");
        System.out.println(sb);

        sb.insert(6, "JAVA ");
        System.out.println(sb);

        sb.delete(6,11);
        System.out.println(sb);

        System.out.println("-------------------------");
        
        StringBuilder sb1=new StringBuilder("Hello");
        System.out.println(sb1);

        sb1.append(" World!");
        System.out.println(sb1);

        sb1.delete(6,sb1.length());
        System.out.println(sb1);

        sb1.insert(sb1.length(), " Java!");
        System.out.println(sb1);
    }

 

}