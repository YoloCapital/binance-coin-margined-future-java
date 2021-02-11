package com.binance.coin_futures_client.model.trade;

import com.binance.coin_futures_client.constant.BinanceApiConstants;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;

public class CommissionRate {

    private String symbol;

    private BigDecimal makerCommissionRate;

    private BigDecimal takerCommissionRate;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getMakerCommissionRate() {
        return makerCommissionRate;
    }

    public void setMakerCommissionRate(BigDecimal makerCommissionRate) {
        this.makerCommissionRate = makerCommissionRate;
    }

    public BigDecimal getTakerCommissionRate() {
        return takerCommissionRate;
    }

    public void setTakerCommissionRate(BigDecimal takerCommissionRate) {
        this.takerCommissionRate = takerCommissionRate;
    }
    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("symbol", symbol)
                .append("makerCommissionRate", makerCommissionRate)
                .append("takerCommissionRate", takerCommissionRate)
                .toString();
    }
}
