package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class TwoSum {
    /*
     * Input Format
     * n -> int
     * nums -> arr[int]
     * target -> int
     */
    public static void main(String[] args) throws IOException {
        // Step 1 : Instantiate bufferReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Step 2 : declare stringTokenizer
        StringTokenizer st;

        // Step 3 : readLine using stringTokenizer instantiation
        st = new StringTokenizer(br.readLine());

        // parse to integer
        int n = Integer.parseInt(st.nextToken());


        int[] nums = new int[n];
        // Step 4 : readLine for array element
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(st.nextToken()); // parse each number to string (space,tab,newline separated)
        }

        // Step 5 : readLine for target value
        st = new StringTokenizer(br.readLine());
        int target = Integer.parseInt(st.nextToken());

        // Step 6 : Call the twoSum solve method
        boolean result = twoSum(n, nums, target);

        // Step 7 : Print result
        System.out.print(result);
    }

    private static boolean twoSum(int n, int[] nums, int target){
        int left = 0;
        int right = n-1;
        
        // sort the array in ascending order
        Arrays.sort(nums);

        while(left < right){
            int currSum = nums[left] + nums[right];
            if(currSum == target) return true;
            else if(currSum < target) left++;
            else right--;
        }
        
        return false;
    }
}