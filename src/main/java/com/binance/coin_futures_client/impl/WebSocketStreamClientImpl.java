package com.binance.coin_futures_client.impl;

import com.binance.coin_futures_client.SubscriptionClient;
import com.binance.coin_futures_client.SubscriptionErrorHandler;
import com.binance.coin_futures_client.SubscriptionListener;
import com.binance.coin_futures_client.SubscriptionOptions;
import com.binance.coin_futures_client.model.enums.CandlestickInterval;
import com.binance.coin_futures_client.model.enums.ContractType;
import com.binance.coin_futures_client.model.event.AggregateTradeEvent;
import com.binance.coin_futures_client.model.event.CandlestickEvent;
import com.binance.coin_futures_client.model.event.LiquidationOrderEvent;
import com.binance.coin_futures_client.model.event.MarkPriceEvent;
import com.binance.coin_futures_client.model.event.OrderBookEvent;
import com.binance.coin_futures_client.model.event.SymbolBookTickerEvent;
import com.binance.coin_futures_client.model.event.SymbolMiniTickerEvent;
import com.binance.coin_futures_client.model.event.SymbolTickerEvent;
import com.binance.coin_futures_client.model.user.UserDataUpdateEvent;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class WebSocketStreamClientImpl implements SubscriptionClient {

    private final SubscriptionOptions options;
    private WebSocketWatchDog watchDog;

    private final WebsocketRequestImpl requestImpl;

    private final Map<Integer, WebSocketConnection> connections = new ConcurrentHashMap<>();

    private final String apiKey;

    private final String secretKey;

    WebSocketStreamClientImpl(String apiKey, String secretKey, SubscriptionOptions options) {
        this.apiKey = apiKey;
        this.secretKey = secretKey;
        this.watchDog = null;
        this.options = Objects.requireNonNull(options);

        this.requestImpl = new WebsocketRequestImpl();
    }

    private <T> int createConnection(WebsocketRequest<T> request, boolean autoClose) {
        if (watchDog == null) {
            watchDog = new WebSocketWatchDog(options);
        }
        WebSocketConnection connection = new WebSocketConnection(apiKey, secretKey, options, request, watchDog,
                autoClose);
        if (autoClose == false) {
            connections.put(connection.getConnectionId(), connection);
        }
        connection.connect();
        return connection.getConnectionId();
    }

    private <T> int createConnection(WebsocketRequest<T> request) {
        return createConnection(request, false);
    }

    @Override
    public void unsubscribeAll() {
        for (WebSocketConnection connection : connections.values()) {
            watchDog.onClosedNormally(connection);
            connection.close();
        }
        connections.clear();
    }

    @Override
    public void unsubscribe(int connectionId) {
        if (connections.containsKey(connectionId)) {
            WebSocketConnection connection = connections.get(connectionId);

            watchDog.onClosedNormally(connection);
            connection.close();
            connections.remove(connectionId);
        }
    }

    @Override
    public int subscribeAggregateTradeEvent(String symbol,
            SubscriptionListener<AggregateTradeEvent> subscriptionListener, 
            SubscriptionErrorHandler errorHandler) {
        return createConnection(
                requestImpl.subscribeAggregateTradeEvent(symbol, subscriptionListener, errorHandler));
    }

    @Override
    public int subscribeMarkPriceEvent(String symbol,
            SubscriptionListener<MarkPriceEvent> subscriptionListener, 
            SubscriptionErrorHandler errorHandler) {
        return createConnection(
                requestImpl.subscribeMarkPriceEvent(symbol, subscriptionListener, errorHandler));
    }

    @Override
    public int subscribeCandlestickEvent(String symbol, CandlestickInterval interval,
            SubscriptionListener<CandlestickEvent> subscriptionListener, 
            SubscriptionErrorHandler errorHandler) {
        return createConnection(
                requestImpl.subscribeCandlestickEvent(symbol, interval, subscriptionListener, errorHandler));
    }

    @Override
    public int subscribeContinuousCandlestickEvent(String pair, ContractType contractType,
                                                    CandlestickInterval interval,
                                                    SubscriptionListener<CandlestickEvent> subscriptionListener,
                                                    SubscriptionErrorHandler errorHandler) {
        return createConnection(
                requestImpl.subscribeContinuousCandlestickEvent(pair, contractType, interval, subscriptionListener, errorHandler));
    }

    @Override
    public int subscribeIndexPriceCandlestickEvent(String pair, CandlestickInterval interval,
                                                    SubscriptionListener<CandlestickEvent> subscriptionListener,
                                                    SubscriptionErrorHandler errorHandler) {
        return createConnection(
                requestImpl.subscribeIndexPriceCandlestickEvent(pair, interval, subscriptionListener, errorHandler));
    }

    @Override
    public int subscribeMarkPriceCandlestickEvent(String symbol, CandlestickInterval interval,
                                                   SubscriptionListener<CandlestickEvent> subscriptionListener,
                                                   SubscriptionErrorHandler errorHandler) {
        return createConnection(
                requestImpl.subscribeMarkPriceCandlestickEvent(symbol, interval, subscriptionListener, errorHandler));
    }

    @Override
    public int subscribeSymbolMiniTickerEvent(String symbol,
            SubscriptionListener<SymbolMiniTickerEvent> subscriptionListener, 
            SubscriptionErrorHandler errorHandler) {
        return createConnection(
                requestImpl.subscribeSymbolMiniTickerEvent(symbol, subscriptionListener, errorHandler));
    }

    @Override
    public int subscribeAllMiniTickerEvent(SubscriptionListener<List<SymbolMiniTickerEvent>> subscriptionListener,
            SubscriptionErrorHandler errorHandler) {
        return createConnection(
                requestImpl.subscribeAllMiniTickerEvent(subscriptionListener, errorHandler));
    }

    @Override
    public int subscribeSymbolTickerEvent(String symbol,
            SubscriptionListener<SymbolTickerEvent> subscriptionListener, 
            SubscriptionErrorHandler errorHandler) {
        return createConnection(
                requestImpl.subscribeSymbolTickerEvent(symbol, subscriptionListener, errorHandler));
    }

    @Override
    public int subscribeAllTickerEvent(SubscriptionListener<List<SymbolTickerEvent>> subscriptionListener,
            SubscriptionErrorHandler errorHandler) {
        return createConnection(
                requestImpl.subscribeAllTickerEvent(subscriptionListener, errorHandler));
    }

    @Override
    public int subscribeSymbolBookTickerEvent(String symbol,
            SubscriptionListener<SymbolBookTickerEvent> subscriptionListener, 
            SubscriptionErrorHandler errorHandler) {
        return createConnection(
                requestImpl.subscribeSymbolBookTickerEvent(symbol, subscriptionListener, errorHandler));
    }

    @Override
    public int subscribeAllBookTickerEvent(SubscriptionListener<SymbolBookTickerEvent> subscriptionListener,
            SubscriptionErrorHandler errorHandler) {
        return createConnection(
                requestImpl.subscribeAllBookTickerEvent(subscriptionListener, errorHandler));
    }

    @Override
    public int subscribeSymbolLiquidationOrderEvent(String symbol,
            SubscriptionListener<LiquidationOrderEvent> subscriptionListener, 
            SubscriptionErrorHandler errorHandler) {
        return createConnection(
                requestImpl.subscribeSymbolLiquidationOrderEvent(symbol, subscriptionListener, errorHandler));
    }

    @Override
    public int subscribeAllLiquidationOrderEvent(SubscriptionListener<LiquidationOrderEvent> subscriptionListener,
            SubscriptionErrorHandler errorHandler) {
        return createConnection(
                requestImpl.subscribeAllLiquidationOrderEvent(subscriptionListener, errorHandler));
    }

    @Override
    public int subscribeBookDepthEvent(String symbol, Integer limit,
            SubscriptionListener<OrderBookEvent> subscriptionListener, 
            SubscriptionErrorHandler errorHandler) {
        return createConnection(
                requestImpl.subscribeBookDepthEvent(symbol, limit, subscriptionListener, errorHandler));
    }

    @Override
    public int subscribeDiffDepthEvent(String symbol,
            SubscriptionListener<OrderBookEvent> subscriptionListener, 
            SubscriptionErrorHandler errorHandler) {
        return createConnection(
                requestImpl.subscribeDiffDepthEvent(symbol, subscriptionListener, errorHandler));
    }

    @Override
    public int subscribeUserDataEvent(String listenKey,
            SubscriptionListener<UserDataUpdateEvent> subscriptionListener, 
            SubscriptionErrorHandler errorHandler) {
        return createConnection(
                requestImpl.subscribeUserDataEvent(listenKey, subscriptionListener, errorHandler));
    }


}
