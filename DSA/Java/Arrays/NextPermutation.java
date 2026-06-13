
import java.util.Arrays;

public class NextPermutation {
    public static int swapIndex(int start,int end,int[] arr,int digit){
        for(int i=end-1;i>=start;i--){
            if(arr[i]==digit){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,3,1,3,3};
        int pivot,left=-1,right=arr.length-1,swap=Integer.MAX_VALUE,pivotIndex=0,swapIndex=0,x=0;
        while(right>left+1){
            if(arr[right]<=arr[right-1]){
                right--;
            }
            else{
                left=right-1;
                pivotIndex=left;
                break;
            }
        }
        if(left>=0){
            pivot=arr[left];x=right;left=right;right=arr.length;
            while(left<right){
                if(pivot<arr[left] && swap>arr[left]){
                    swap=arr[left];
                    left++;
                }
                else left++;
            }
            swapIndex=swapIndex(x,right,arr,swap);

            swaps(pivotIndex,swapIndex);
            // int temp=arr[pivotIndex];
            // arr[pivotIndex]=arr[swapIndex];
            // arr[swapIndex]=temp;
            System.out.println(Arrays.toString(arr));
        }
        left = (left==-1) ? 0 : x;
        right=arr.length-1;
        while(left<right){
            // int temp=arr[left];
            // arr[left]=arr[right];
            // arr[right]=temp;
            swaps(left,right);
            left++;right--;
        }
        public void swaps(int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }

}
// Step 1: Find the pivot
// Scan from right to left, find the first index i where nums[i] < nums[i+1].
// This marks the point where the sequence stops increasing from the right.
// If no such index exists, the array is in descending order (last permutation).

// Step 2: Find the successor
// From the right side, find the smallest element greater than nums[i].
// This ensures we pick the "next larger" number to replace the pivot.

// Step 3: Swap pivot and successor
// Swap these two elements so the sequence becomes just slightly larger
// than the original one.

// Step 4: Reverse the suffix
// Reverse the part of the array to the right of the pivot index.
// Since it was in descending order, reversing makes it the smallest possible order.
// This guarantees the result is the immediate next permutation.

// Time Complexity: O(n) (single pass + reverse)
// Space Complexity: O(1) (in-place)
