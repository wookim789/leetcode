package leetcode.dayone.problem;

import java.util.ArrayList;
import java.util.List;

public class BestTimeToBuyAndSellStock {
    /*
     * [problem]
     * You are given an array prices where prices[i] is the price of a given stock on the ith day.
     * You want to maximize your profit by choosing a single day
     * to buy one stock and choosing a different day in the future to sell that stock.
     * Return the maximum profit you can achieve from this transaction.
     * If you cannot achieve any profit, return 0.
     *
     * [example]
     * Input: prices = [7,1,5,3,6,4]
     * Output: 5
     * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
     * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
     *
     * [boundary condition]
     * 1 <= prices.length <= 10^5
     * 0 <= prices[i] <= 10^4
     *
     * [line]
     * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan&id=level-1
     *
     * 아쉽게도 솔루션을 보고 풀었다...
     * 이 문제는 외워두면 요긴할 듯
     * */

    public int getMaxProfit(int[] prices){

        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int idx = 0; idx < prices.length; idx++){
            if(prices[idx] < minPrice){
                minPrice = prices[idx];
            }else if(maxProfit < prices[idx] - minPrice){
                maxProfit = prices[idx] - minPrice;
            }
        }
        return maxProfit;
    }
}
