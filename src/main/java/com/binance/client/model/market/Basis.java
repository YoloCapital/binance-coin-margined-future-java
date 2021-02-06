package com.binance.client.model.market;

import com.binance.client.constant.BinanceApiConstants;
import com.binance.client.model.enums.ContractType;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;

public class Basis {

    private String pair;

    private String contractType;

    private BigDecimal futuresPrice;

    private BigDecimal indexPrice;

    private BigDecimal basis;

    private BigDecimal basisRate;

    private Long timestamp;

    public String getPair() {
        return pair;
    }

    public void setPair(String pair) {
        this.pair = pair;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public BigDecimal getFuturesPrice() {
        return futuresPrice;
    }

    public void setFuturesPrice(BigDecimal futuresPrice) {
        this.futuresPrice = futuresPrice;
    }

    public BigDecimal getIndexPrice() {
        return indexPrice;
    }

    public void setIndexPrice(BigDecimal indexPrice) {
        this.indexPrice = indexPrice;
    }

    public BigDecimal getBasis() {
        return basis;
    }

    public void setBasis(BigDecimal basis) {
        this.basis = basis;
    }

    public BigDecimal getBasisRate() {
        return basisRate;
    }

    public void setBasisRate(BigDecimal basisRate) {
        this.basisRate = basisRate;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("symbol", pair).append("contractType", contractType)
                .append("futuresPrice", futuresPrice).append("indexPrice", indexPrice)
                .append("basis", basis).append("basisRate", basisRate)
                .append("timestamp", timestamp).toString();
    }
}
