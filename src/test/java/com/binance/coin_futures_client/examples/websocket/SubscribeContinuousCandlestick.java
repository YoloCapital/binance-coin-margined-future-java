package com.binance.coin_futures_client.examples.websocket;

import com.binance.coin_futures_client.SubscriptionClient;
import com.binance.coin_futures_client.examples.constants.PrivateConfig;
import com.binance.coin_futures_client.model.enums.CandlestickInterval;
import com.binance.coin_futures_client.model.enums.ContractType;

public class SubscribeContinuousCandlestick {

    public static void main(String[] args) {

        SubscriptionClient client = SubscriptionClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
   
        client.subscribeContinuousCandlestickEvent("btcusd", ContractType.CURRENT_QUARTER, CandlestickInterval.ONE_MINUTE, ((event) -> {
            System.out.println(event);
            client.unsubscribeAll();
        }), null);

    }

}
