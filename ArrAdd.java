import java.util.Arrays;

public class ArrAdd {
    public static void main(String args[]){  
        int a[][]={{1,3,4},{3,4,5},{5,6,7}};  
        int b[][]={{1,3,4},{3,4,5},{5,6,7}};  
        int add1[][]= new int [3][3];
        int mul1[][] = new int[3][3];
        for(int i =0;i<a.length;i++){
            for (int j=0; j<a[i].length;j++){
                add1[i][j]=a[i][j]+b[i][j];
            }
        }         
        System.out.println("Addition of Matrices: "+Arrays.deepToString(add1)); //[[I@372f7a8d, [I@2f92e0f4] for toString... so use deepToString
                
        for(int i =0;i<a.length;i++){ //rows of a
            for (int j=0; j<b[0].length;j++){ //columns of b
                for(int k=0; k<a[0].length;k++){ // columns of a / rows of b
                    mul1[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Multiplication of Matrices: "+Arrays.deepToString(mul1)); //for toString... so use deepToString

        //Arrays.sort(mul1); // Only for 1D. Complicated for 2D        
        //System.out.println("Sorted Array: " + Arrays.toString(mul1));  [[I@5674cd4d, [I@63961c42, [I@65b54208]

        //Arrays.equals() // Only for 1D
        System.out.println(Arrays.deepEquals(add1, mul1));  //Checks if both arrays are equal or not
    }
}
