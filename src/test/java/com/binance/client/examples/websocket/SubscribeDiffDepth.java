package com.binance.client.examples.websocket;

import com.binance.client.SubscriptionClient;
import com.binance.client.SubscriptionOptions;
import com.binance.client.examples.constants.PrivateConfig;

public class SubscribeDiffDepth {

    public static void main(String[] args) {

        SubscriptionOptions options = new SubscriptionOptions();
        options.setUri("wss://stream.binance.com:9443/ws");
        SubscriptionClient client = SubscriptionClient.create(null,null,options);


        client.onSymbolMarketTickersEvent("btcusdt", ((event) -> {
            System.out.println(event);
//            client.unsubscribeAll();
        }), null);

    }

}
