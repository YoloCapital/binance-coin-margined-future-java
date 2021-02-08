package com.binance.coin_futures_client.impl;

import com.binance.coin_futures_client.impl.utils.JsonWrapper;

@FunctionalInterface
public interface RestApiJsonParser<T> {

  T parseJson(JsonWrapper json);
}
