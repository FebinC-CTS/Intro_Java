import java.util.Arrays;

public class ArrayMin {
    static void min(int arr[]){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int[] a={3,24,2,21,5};
        min(a);

        int[] copyTo=new int[4];
        System.arraycopy(a, 1, copyTo, 0,4);
        System.out.println(Arrays.toString(copyTo));
        
        int [] b = a.clone();
        System.out.println(Arrays.toString(b));
        
        min(new int[] {5,32,12,4});  // Anonymous Array
    }
}
