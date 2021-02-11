package com.binance.coin_futures_client.examples.trade;

import com.binance.coin_futures_client.RequestOptions;
import com.binance.coin_futures_client.SyncRequestClient;
import com.binance.coin_futures_client.examples.constants.PrivateConfig;
import com.binance.coin_futures_client.model.enums.PositionSide;

/**
 * @author : wangwanlu
 * @since : 2020/4/23, Thu
 **/
public class AddIsolatedPositionMargin {

    static int INCREASE_MARGIN_TYPE = 1;
    static int DECREASE_MARGIN_TYPE = 2;

    public static void main(String[] args) {
        RequestOptions options = new RequestOptions();
        SyncRequestClient syncRequestClient = SyncRequestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
                options);

        System.out.println(syncRequestClient.addIsolatedPositionMargin("BTCUSD_PERP", INCREASE_MARGIN_TYPE, "100", PositionSide.BOTH));
    }
}
