public class CapacityOfShip{
    public static void main(String[] args) {
        int[] weights={1,2,3,1,1};
        int days=4;
        int left=0,right=0;
        for (int w : weights) {
            left = Math.max(left, w);   
            right += w;               
        }
        int res = right;
    
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int count = 1, sum = 0;
    
            for (int w : weights) {
                if (sum + w > mid) {
                    count++;
                    sum = 0;
                }
                sum += w;
            }
    
            if (count <= days) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(res);
    } 

}