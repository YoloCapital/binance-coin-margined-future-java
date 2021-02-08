package com.binance.coin_futures_client.examples.trade;

import com.binance.coin_futures_client.RequestOptions;
import com.binance.coin_futures_client.SyncRequestClient;
import com.binance.coin_futures_client.examples.constants.PrivateConfig;

/**
 * @author : wangwanlu
 * @since : 2020/4/23, Thu
 **/
public class ChangeMarginType {

    public static void main(String[] args) {
        RequestOptions options = new RequestOptions();
        SyncRequestClient syncRequestClient = SyncRequestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
                options);

        // margin type: ISOLATED, CROSSED
        System.out.println(syncRequestClient.changeMarginType("BTCUSDT", "ISOLATED"));
    }
}
