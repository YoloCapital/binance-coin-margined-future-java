package com.binance.coin_futures_client.model.trade;

import com.binance.coin_futures_client.constant.BinanceApiConstants;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;

public class Order {

    private String clientOrderId;

    private BigDecimal cumQty;

    private BigDecimal cumBase;

    private BigDecimal executedQty;

    private Long orderId;

    private BigDecimal avgPrice;

    private BigDecimal origQty;

    private BigDecimal price;

    private Boolean reduceOnly;

    private String side;

    private String positionSide;

    private String status;

    private BigDecimal stopPrice;

    private Boolean closePosition;

    private String symbol;

    private String pair;

    private String timeInForce;

    private String type;

    private String origType;

    private Long updateTime;

    private String workingType;

    private Boolean priceProtect;

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public BigDecimal getCumQty() {
        return cumQty;
    }

    public void setCumQty(BigDecimal cumQty) {
        this.cumQty = cumQty;
    }

    public BigDecimal getCumBase() {
        return cumBase;
    }

    public void setCumBase(BigDecimal cumBase) {
        this.cumBase = cumBase;
    }

    public BigDecimal getExecutedQty() {
        return executedQty;
    }

    public void setExecutedQty(BigDecimal executedQty) {
        this.executedQty = executedQty;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(BigDecimal avgPrice) {
        this.avgPrice = avgPrice;
    }

    public BigDecimal getOrigQty() {
        return origQty;
    }

    public void setOrigQty(BigDecimal origQty) {
        this.origQty = origQty;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getReduceOnly() {
        return reduceOnly;
    }

    public void setReduceOnly(Boolean reduceOnly) {
        this.reduceOnly = reduceOnly;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getPositionSide() {
        return positionSide;
    }

    public void setPositionSide(String positionSide) {
        this.positionSide = positionSide;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getStopPrice() {
        return stopPrice;
    }

    public void setStopPrice(BigDecimal stopPrice) {
        this.stopPrice = stopPrice;
    }

    public Boolean getClosePosition() {
        return closePosition;
    }

    public void setClosePosition(Boolean closePosition) {
        this.closePosition = closePosition;
    }

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

    public String getTimeInForce() {
        return timeInForce;
    }

    public void setTimeInForce(String timeInForce) {
        this.timeInForce = timeInForce;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrigType() {
        return origType;
    }

    public void setOrigType(String origType) {
        this.origType = origType;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getWorkingType() {
        return workingType;
    }

    public void setWorkingType(String workingType) {
        this.workingType = workingType;
    }

    public Boolean getPriceProtect() {
        return priceProtect;
    }

    public void setPriceProtect(Boolean priceProtect) {
        this.priceProtect = priceProtect;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("clientOrderId", clientOrderId).append("cumQty", cumQty)
                .append("cumBase", cumBase).append("executedQty", executedQty)
                .append("orderId", orderId).append("avgPrice", avgPrice)
                .append("origQty", origQty).append("price", price)
                .append("reduceOnly", reduceOnly).append("side", side)
                .append("positionSide", positionSide).append("status", status)
                .append("stopPrice", stopPrice).append("symbol", symbol)
                .append("pair", pair).append("timeInForce", timeInForce)
                .append("type", type).append("origType", origType)
                .append("updateTime", updateTime).append("workingType", workingType)
                .append("priceProtect", priceProtect).toString();
    }
}
