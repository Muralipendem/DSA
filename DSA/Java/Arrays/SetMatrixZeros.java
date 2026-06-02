
import java.util.Arrays;

public class SetMatrixZeros{
    public static void main(String[] args) {
        // int[][] matrix={{0,1,2,0},{3,4,5,2},{1,3,1,5}}; 
        int[][] matrix={{1,1,1},{1,0,1},{1,1,1}};
        int m = matrix.length, n = matrix[0].length;

        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    rows[i]=true;
                    cols[j]=true;
                }
            }
        }
        System.out.println(Arrays.toString(rows));
        System.out.println(Arrays.toString(cols));
        for(int i=0;i<rows.length;i++){
            if(rows[i]==true){
                Arrays.fill(matrix[i],0);
            }
        }
        for(int i=0;i<m;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

        for(int i=0;i<cols.length;i++){
            if(cols[i]==true){
                for(int j=0;j<m;j++){
                    matrix[j][i]=0;
                }
            }
        }
        System.out.println("--------------------------");
        
        for(int i=0;i<m;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}