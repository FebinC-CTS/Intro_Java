import java.util.Arrays;

class Array1{
    public static void main(String[] args) {
        int[] arr1 = {20,25,30,31};
        for (int i: arr1){
            System.out.println(i);
        }
        int arr2[]=new int[4];
        arr2[0]=3;
        arr2[1]=5;
        arr2[2]=1;
        arr2[3]=16;
        System.out.println("----------------");
        for (int j=0; j<arr2.length;j++){
            System.out.println(arr2[j]);
        }
        System.out.println("----------------");
        System.out.println(Arrays.toString(arr1));

        Class c=arr1.getClass();
        String name=c.getName();
        System.out.println(name);

        System.out.println(arr2.getClass().getName());

    /*  [ → means array
        I → means int (primitive type)
        So [I = “array of int”         */
    }

}