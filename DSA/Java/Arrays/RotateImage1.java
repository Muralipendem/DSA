
import java.util.Arrays;

public class RotateImage1{
    public static void main(String[] args) {
        int[][] matrix={{0,1},{1,1}};
        int[][] target={{1,0},{0,1}};
        boolean isEqual = false;
        int count=1, n=matrix.length;
        for(int i=0;i<n;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
        while(count<=4){
            
            int[][] result= new int[n][n];
            for(int i=0;i<n;i++){
                result[i] = Arrays.copyOf(matrix[i], n);
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    matrix[j][n-1-i]=result[i][j];
                }
            }
            System.out.println("-----------------");
            for(int i=0;i<n;i++){
                System.out.println(Arrays.toString(matrix[i]));
                if (Arrays.equals(matrix[i], target[i])) isEqual = true;
                else {
                    isEqual = false;
                    break;
                }
            }
            if(!isEqual) count++;
            else{
                System.out.println(isEqual);
                break;
            }
        }
        if(count>3) System.out.println(isEqual);
        
    }
}