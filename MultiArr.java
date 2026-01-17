import java.util.Arrays;

public class MultiArr {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i[]:arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("------------");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                    System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<arr.length;i++){ 
            int index = Arrays.binarySearch(arr[i], 5); 
            if(index >= 0){ //System.out.println("Found 5: " + Arrays.binarySearch(arr,5));   For 1D Array
                System.out.println("Found 5 at row " + i + ", column " + index);            
            }
        }

    }
}
