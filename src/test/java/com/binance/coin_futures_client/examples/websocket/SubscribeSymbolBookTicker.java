package com.binance.coin_futures_client.examples.websocket;

import com.binance.coin_futures_client.SubscriptionClient;
import com.binance.coin_futures_client.examples.constants.PrivateConfig;

public class SubscribeSymbolBookTicker {

    public static void main(String[] args) {

        SubscriptionClient client = SubscriptionClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
   
        client.subscribeSymbolBookTickerEvent("btcusd_perp", ((event) -> {
            System.out.println(event);
            client.unsubscribeAll();
        }), null);

    }

}
