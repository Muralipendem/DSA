import java.util.*;
public class spiralArray{
    public static void main(String[] args){
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        ArrayList<Integer> spiral = new ArrayList<>();
        int left=0, right=matrix[0].length-1, top=0, bottom=matrix.length-1;
        while(left<=right && top<=bottom){
            for(int i=left; i<=right; i++){
                spiral.add(matrix[top][i]);
            }
            top++;
            for(int i=top; i<=bottom; i++){
                spiral.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    spiral.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    spiral.add(matrix[i][left]);
                }
                left++;
            }
        }
        System.out.println(spiral);

    }
}