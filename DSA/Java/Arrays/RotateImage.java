
import java.util.Arrays;


public class RotateImage{
    public static void main(String[] args) {
        int[][] matrix={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        
        int n=matrix.length;
        for(int i=0;i<n;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

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
        }
    }
}