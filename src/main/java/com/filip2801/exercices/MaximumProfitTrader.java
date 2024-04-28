package com.filip2801.exercices;

import java.util.List;
import java.util.stream.LongStream;

public class MaximumProfitTrader {

    public static long maximumProfit(List<Integer> prices) {
        return maximumProfit(0, 0, prices, 0);
    }

    private static long maximumProfit(long shares, long cashFlow, List<Integer> prices, int priceIndex) {
        if (priceIndex == prices.size()) {
            return cashFlow;
        } else if (priceIndex == prices.size() - 1) {
            var currentPrice = prices.get(priceIndex);
            return cashFlow + shares * currentPrice;
        }

        var currentPrice = prices.get(priceIndex);

        // buy
        var buyResult = maximumProfit(shares + 1, cashFlow - currentPrice, prices, priceIndex + 1);

        // sell
        long sellResult;
        if (shares > 0  && prices.get(priceIndex + 1) < currentPrice) {
            sellResult = maximumProfit(0, cashFlow + shares * currentPrice, prices, priceIndex + 1);
        } else {
            sellResult = cashFlow;
        }

        // do nothing
        var doNothingResult = maximumProfit(shares, cashFlow, prices, priceIndex + 1);

        return LongStream.of(buyResult, sellResult, doNothingResult, 0).max().getAsLong();
    }

}
