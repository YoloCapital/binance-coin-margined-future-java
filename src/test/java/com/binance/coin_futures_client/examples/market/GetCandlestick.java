package com.binance.coin_futures_client.examples.market;

import com.binance.coin_futures_client.model.enums.CandlestickInterval;

import com.binance.coin_futures_client.RequestOptions;
import com.binance.coin_futures_client.SyncRequestClient;

import com.binance.coin_futures_client.examples.constants.PrivateConfig;

public class GetCandlestick {
    public static void main(String[] args) {
        RequestOptions options = new RequestOptions();
        SyncRequestClient syncRequestClient = SyncRequestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
                options);
        System.out.println(syncRequestClient.getCandlestick("BTCUSD_PERP", CandlestickInterval.ONE_MINUTE, null, null, 5));
    }
}
