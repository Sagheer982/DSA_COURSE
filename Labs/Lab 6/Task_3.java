import java.util.Arrays;
public class Task_3{  
    public static boolean twoSum(int[] arr, int K) {
        
        Arrays.sort(arr);
     
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int sum = arr[left] + arr[right];

            if (sum == K) {
                return true;  
            } else if (sum < K) {
                left++;  
            } else {
                right--; 
            }
        }
        
        return false; 
    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 6};
        int K = 10;
        System.out.println("8 , 4, 1, 6");
        if (twoSum(arr, K)) {
            System.out.println("Yes, there are two numbers that sum to " + K);
        } else {
            System.out.println("No, there are no two numbers that sum to " + K);
        }
    }
}
