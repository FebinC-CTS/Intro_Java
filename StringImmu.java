public class StringImmu {
    public static void main(String[] args) {
        String originalString = "Java";
        System.out.println("Original String: "+originalString);

        originalString.concat(" Programming");
        String modifiedString = originalString.concat(" Programming");
        System.out.println("After modification, original string doesn't change: "+originalString);
        System.out.println("Modified String: "+modifiedString);
        System.out.println(originalString.toUpperCase());
        String upOriginalString=originalString.toUpperCase();
        System.out.println(upOriginalString);
    
    }
}
