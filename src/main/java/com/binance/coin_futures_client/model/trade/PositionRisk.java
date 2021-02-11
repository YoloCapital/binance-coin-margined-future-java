package com.binance.coin_futures_client.model.trade;

import com.binance.coin_futures_client.constant.BinanceApiConstants;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;

public class PositionRisk {

    private String symbol;

    private BigDecimal positionAmt;

    private BigDecimal entryPrice;

    private BigDecimal markPrice;

    private BigDecimal unrealizedProfit;

    private BigDecimal liquidationPrice;

    private BigDecimal leverage;

    private BigDecimal maxQty;

    private String marginType;

    private String isolatedMargin;

    private Boolean isAutoAddMargin;

    private String positionSide;

    public BigDecimal getEntryPrice() {
        return entryPrice;
    }

    public void setEntryPrice(BigDecimal entryPrice) {
        this.entryPrice = entryPrice;
    }

    public BigDecimal getLeverage() {
        return leverage;
    }

    public void setLeverage(BigDecimal leverage) {
        this.leverage = leverage;
    }

    public BigDecimal getMaxQty() {
        return maxQty;
    }

    public void setMaxQty(BigDecimal maxQty) {
        this.maxQty = maxQty;
    }

    public BigDecimal getLiquidationPrice() {
        return liquidationPrice;
    }

    public void setLiquidationPrice(BigDecimal liquidationPrice) {
        this.liquidationPrice = liquidationPrice;
    }

    public BigDecimal getMarkPrice() {
        return markPrice;
    }

    public void setMarkPrice(BigDecimal markPrice) {
        this.markPrice = markPrice;
    }

    public BigDecimal getPositionAmt() {
        return positionAmt;
    }

    public void setPositionAmt(BigDecimal positionAmt) {
        this.positionAmt = positionAmt;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getUnrealizedProfit() {
        return unrealizedProfit;
    }

    public void setUnrealizedProfit(BigDecimal unrealizedProfit) {
        this.unrealizedProfit = unrealizedProfit;
    }

    public String getIsolatedMargin() {
        return isolatedMargin;
    }

    public void setIsolatedMargin(String isolatedMargin) {
        this.isolatedMargin = isolatedMargin;
    }

    public String getPositionSide() {
        return positionSide;
    }

    public void setPositionSide(String positionSide) {
        this.positionSide = positionSide;
    }

    public Boolean getIsAutoAddMargin() {
        return isAutoAddMargin;
    }

    public void setIsAutoAddMargin(Boolean isAutoAddMargin) {
        isAutoAddMargin = isAutoAddMargin;
    }

    public String getMarginType() {
        return marginType;
    }

    public void setMarginType(String marginType) {
        this.marginType = marginType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE).append("entryPrice", entryPrice)
                .append("leverage", leverage).append("maxQty", maxQty)
                .append("liquidationPrice", liquidationPrice).append("markPrice", markPrice)
                .append("positionAmt", positionAmt).append("symbol", symbol)
                .append("unrealizedProfit", unrealizedProfit).append("isolatedMargin", isolatedMargin)
                .append("positionSide", positionSide).append("isAutoAddMargin", isAutoAddMargin)
                .append("marginType", marginType).toString();
    }
}
