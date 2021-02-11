package com.binance.coin_futures_client.model.trade;

import com.binance.coin_futures_client.constant.BinanceApiConstants;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;
import java.math.BigDecimal;

public class AccountInformation {

    private Boolean canDeposit;

    private Boolean canTrade;

    private Boolean canWithdraw;

    private BigDecimal feeTier;

    private Long updateTime;

    private List<Asset> assets;

    private List<Position> positions;

    public Boolean getCanDeposit() {
        return canDeposit;
    }

    public void setCanDeposit(Boolean canDeposit) {
        this.canDeposit = canDeposit;
    }

    public Boolean getCanTrade() {
        return canTrade;
    }

    public void setCanTrade(Boolean canTrade) {
        this.canTrade = canTrade;
    }

    public Boolean getCanWithdraw() {
        return canWithdraw;
    }

    public void setCanWithdraw(Boolean canWithdraw) {
        this.canWithdraw = canWithdraw;
    }

    public BigDecimal getFeeTier() {
        return feeTier;
    }

    public void setFeeTier(BigDecimal feeTier) {
        this.feeTier = feeTier;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE).append("canDeposit", canDeposit)
                .append("canTrade", canTrade).append("canWithdraw", canWithdraw).append("feeTier", feeTier)
                .append("updateTime", updateTime).append("assets", assets).append("positions", positions).toString();
    }
}
