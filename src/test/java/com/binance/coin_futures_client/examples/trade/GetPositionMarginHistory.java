package com.binance.coin_futures_client.examples.trade;

import com.binance.coin_futures_client.RequestOptions;
import com.binance.coin_futures_client.SyncRequestClient;
import com.binance.coin_futures_client.examples.constants.PrivateConfig;

/**
 * @author : wangwanlu
 * @since : 2020/4/23, Thu
 **/
public class GetPositionMarginHistory {

    static int INCREASE_MARGIN_TYPE = 1;
    static int DECREASE_MARGIN_TYPE = 2;

    public static void main(String[] args) {
        RequestOptions options = new RequestOptions();
        SyncRequestClient syncRequestClient = SyncRequestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
                options);

        long endTime = System.currentTimeMillis();
        long startTime = endTime - (24 * 60 * 60 * 1000);
        int limit = 500;
        System.out.println(syncRequestClient.getPositionMarginHistory("BTCUSD_PERP", INCREASE_MARGIN_TYPE, startTime, endTime, limit));
    }
}
