package arrays;

/*
121. Best Time to Buy and Sell Stock
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 

Constraints:

1 <= prices.length <= 105
0 <= prices[i] <= 104
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Stocks1 {
    private static int getMaxProfit(int n, int[] prices) {
        int profit = 0;

        int minPrice = prices[0];

        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            if (prices[i] > minPrice) {
                profit = Math.max(profit, prices[i] - minPrice);
            }
        }

        return profit;
    }

    public static void main(String[] args) throws IOException {
        // Instantiate BufferReader and use InputStreamReader -> covert bytecode to
        // string
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Declare StringTokenizer -> convert the space/tab separated input to stream
        StringTokenizer st;

        // Take number of test-cases
        st = new StringTokenizer(bufferedReader.readLine());
        int t = Integer.parseInt(st.nextToken());

        while (t > 0) {

            // Take size of array
            st = new StringTokenizer(bufferedReader.readLine());
            int n = Integer.parseInt(st.nextToken());

            if (n == 0)
                return;

            // Take array input of size n
            st = new StringTokenizer(bufferedReader.readLine());
            int[] nums = new int[n];

            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
            }

            // Call solver for each data
            int ans = getMaxProfit(n, nums);
            System.out.println(ans);

            t--;
        }

    }
}
