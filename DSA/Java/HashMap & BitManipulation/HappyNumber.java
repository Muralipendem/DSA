import java.util.Scanner;
public class HappyNumber {
    //Hash Approach TC-O(log(n)), SC-O(1) using Floyd algo
    //Cycle detection with floyd approach

    // public static boolean isHappy(int n) {
    //     int slow=n;
    //     int fast=n;
    //     while(true){
    //         slow=next(slow);
    //         fast=next(next(fast));
    //         if(slow==fast) break;
    //     }
    //     return slow == 1;
    // }

    //Hash Approach TC-O(log(n)), SC-O(log(n)) using Hash
    //Cycle detection with hash approach
    
    // public static boolean isHappy(int n) {
    //     HashSet<Integer> seen = new HashSet<>();
    //     while (n != 1 && !seen.contains(n)) {
    //         seen.add(n);
    //         n = next(n);
    //     }
    //     return n == 1;
    // }

    //Normal Approach TC-O(log(n)), SC-O(1) using maths(My approach)
    public static boolean isHappy(int n) {
        while(n>=10){
            n=next(n);
        }
        return (n==1 || n==7);
    }


    // Compute the next number in the sequence: sum of squares of digits.
    private static int next(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to check for happy numbers (Ctrl+D to end):");
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.printf("%d -> %s%n", num, isHappy(num) ? "Happy" : "Not Happy");
        }
        sc.close();


    }
}