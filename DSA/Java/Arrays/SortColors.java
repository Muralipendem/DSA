
import java.util.Arrays;


public class SortColors{
    public static void main(String[] args) {
        int[] sorts={2,0,1,0,2,0,1,0};
        //Bubble Sort
        // for(int i=0;i<sorts.length;i++){
        //     for(int j=0;j<(sorts.length-1-i);j++){
        //         if(sorts[j]>sorts[j+1]){
        //             int temp=sorts[j];
        //             sorts[j]=sorts[j+1];
        //             sorts[j+1]=temp;
        //         }
        //     }
        // }
        // System.out.println(Arrays.toString(sorts));
        //Another Approach
        int zeros=0,ones=0,twos=0,count=0;
        for(int i=0;i<sorts.length;i++){
            if(sorts[i]==0) zeros++;
            else if(sorts[i]==1) ones++;
            else twos++;
        }

        while(count<sorts.length){
            if(zeros!=0){
                sorts[count]=0;
                zeros--;
            }
            else if(zeros==0 && ones!=0){
                sorts[count]=1;
                ones--;
            }
            else if(zeros==0 && ones==0 && twos!=0){
                sorts[count]=2;
                twos--;
            }
            count++;
        }
        System.out.println(Arrays.toString(sorts));
    }
}