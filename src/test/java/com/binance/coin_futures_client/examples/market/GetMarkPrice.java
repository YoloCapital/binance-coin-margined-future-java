package com.binance.coin_futures_client.examples.market;

import com.binance.coin_futures_client.RequestOptions;
import com.binance.coin_futures_client.SyncRequestClient;

import com.binance.coin_futures_client.examples.constants.PrivateConfig;

public class GetMarkPrice {
    public static void main(String[] args) {
        RequestOptions options = new RequestOptions();
        SyncRequestClient syncRequestClient = SyncRequestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
                options);
//        System.out.println(syncRequestClient.getMarkPrice("BTCUSD_PERP", null));
        System.out.println(syncRequestClient.getMarkPrice(null, null));
    }
}
