package com.binance.client.model.market;

import com.binance.client.constant.BinanceApiConstants;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;

public class MarkPrice {

    private String symbol;

    private String pair;

    private BigDecimal markPrice;

    private BigDecimal indexPrice;

    private BigDecimal estimatedSettlePrice;

    private BigDecimal lastFundingRate;

    private Long nextFundingTime;

    private BigDecimal interestRate;

    private Long time;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getPair() {
        return pair;
    }

    public void setPair(String pair) {
        this.pair = pair;
    }

    public BigDecimal getMarkPrice() {
        return markPrice;
    }

    public void setMarkPrice(BigDecimal markPrice) {
        this.markPrice = markPrice;
    }

    public BigDecimal getIndexPrice() { return indexPrice; }

    public void setIndexPrice(BigDecimal indexPrice) { this.indexPrice = indexPrice; }

    public BigDecimal getEstimatedSettlePrice() {
        return estimatedSettlePrice;
    }

    public void setEstimatedSettlePrice(BigDecimal estimatedSettlePrice) {
        this.estimatedSettlePrice = estimatedSettlePrice;
    }

    public BigDecimal getLastFundingRate() {
        return lastFundingRate;
    }

    public void setLastFundingRate(BigDecimal lastFundingRate) {
        this.lastFundingRate = lastFundingRate;
    }

    public Long getNextFundingTime() {
        return nextFundingTime;
    }

    public void setNextFundingTime(Long nextFundingTime) {
        this.nextFundingTime = nextFundingTime;
    }

    public BigDecimal getInterestRate() { return interestRate; }

    public void setInterestRate(BigDecimal interestRate) { this.interestRate = interestRate; }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("symbol", symbol).append("pair", pair)
                .append("markPrice", markPrice).append("indexPrice", indexPrice)
                .append("estimatedSettlePrice", estimatedSettlePrice).append("lastFundingRate", lastFundingRate)
                .append("nextFundingTime", nextFundingTime).append("interestRate", interestRate).append("time", time).toString();
    }
}
