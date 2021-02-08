package com.binance.coin_futures_client.impl.utils;

@FunctionalInterface
public interface Handler<T> {

  void handle(T t);
}
