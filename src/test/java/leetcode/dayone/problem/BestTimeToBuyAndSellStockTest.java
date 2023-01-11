package leetcode.dayone.problem;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {
    BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

    @Test
    void getMaxProfitFromInputByMaxProfitTest1(){
        int[] input = {7, 1, 5, 3, 6, 4};

        int actual = bestTimeToBuyAndSellStock.getMaxProfit(input);
        int expected = 5;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void getMaxProfitFromInputByMaxProfitTest2(){
        int[] input = {1,2,4,2,5,7,2,4,9,0,9};

        int actual = bestTimeToBuyAndSellStock.getMaxProfit(input);
        int expected = 9;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void getNoHaveProfitFromInputByMaxProfitTest(){
        int[] input = {7, 6, 4, 3, 1};

        int actual = bestTimeToBuyAndSellStock.getMaxProfit(input);
        int expected = 0;

        assertThat(actual).isEqualTo(expected);
    }
}