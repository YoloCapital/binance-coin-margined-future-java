package com.binance.coin_futures_client.examples.market;

import com.binance.coin_futures_client.RequestOptions;
import com.binance.coin_futures_client.SyncRequestClient;
import com.binance.coin_futures_client.examples.constants.PrivateConfig;
import com.binance.coin_futures_client.model.enums.PeriodType;

public class GetTopTraderAccountRatio {
    public static void main(String[] args) {
        RequestOptions options = new RequestOptions();
        SyncRequestClient syncRequestClient = SyncRequestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
                options);
        System.out.println(syncRequestClient.getTopTraderAccountRatio("BTCUSDT", PeriodType._5m,null,null,10));


    }
}
