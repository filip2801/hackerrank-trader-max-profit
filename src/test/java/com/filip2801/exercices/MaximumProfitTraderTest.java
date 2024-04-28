package com.filip2801.exercices;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.filip2801.exercices.MaximumProfitTrader.maximumProfit;
import static org.assertj.core.api.Assertions.assertThat;

class MaximumProfitTraderTest {

    @Test
    public void test1() {
        assertThat(maximumProfit(Arrays.asList(3))).isEqualTo(0);
    }


    @Test
    public void test2() {
        assertThat(maximumProfit(Arrays.asList(5,3,2))).isEqualTo(0);
    }


    @Test
    public void test3() {
        assertThat(maximumProfit(Arrays.asList(1, 2, 100))).isEqualTo(197);
    }

    @Test
    public void test4() {
        assertThat(maximumProfit(Arrays.asList(1, 3, 1, 2))).isEqualTo(3);
    }

    @Test
    public void test5() {
        assertThat(maximumProfit(Arrays.asList(3, 4, 5, 3, 5, 2))).isEqualTo(5);
    }
}