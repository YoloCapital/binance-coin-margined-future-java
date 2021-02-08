package com.binance.coin_futures_client.examples.trade;

import com.binance.coin_futures_client.RequestOptions;
import com.binance.coin_futures_client.SyncRequestClient;

import com.binance.coin_futures_client.examples.constants.PrivateConfig;

public class GetAllOrders {
    public static void main(String[] args) {
        RequestOptions options = new RequestOptions();
        SyncRequestClient syncRequestClient = SyncRequestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
                options);
        System.out.println(syncRequestClient.getAllOrders("BTCUSDT", null, null, null, 10));
        // System.out.println(syncRequestClient.getAllOrders("BTCUSDT", null, null, null, null));
    }
}