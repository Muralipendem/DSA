public class spiralTwo{
    public static void main(String args[]){
        int n=3,count=1;
        int[][] matrix = new int[n][n];
        int left=0, right=matrix[0].length-1, top=0, bottom=matrix.length-1;
        while(left<=right && top<=bottom){
            for(int i=left; i<=right; i++){
                matrix[top][i]=count;
                count++;
            }
            top++;
            for(int i=top; i<=bottom; i++){
                matrix[i][right]=count;
                count++;
            }
            right--;
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    matrix[bottom][i]=count;
                    count++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    matrix[i][left]=count;
                    count++;
                }
                left++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+"-->");
            }
        }
        
    }
}