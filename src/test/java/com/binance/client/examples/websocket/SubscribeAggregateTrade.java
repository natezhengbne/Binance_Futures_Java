package com.binance.client.examples.websocket;

import com.binance.client.SubscriptionClient;
import com.binance.client.examples.constants.PrivateConfig;

public class SubscribeAggregateTrade {

    public static void main(String[] args) {

        SubscriptionClient client = SubscriptionClient.create();
   
        client.subscribeAggregateTradeEvent("btcusdt", ((event) -> {
            System.out.println(event);
            client.unsubscribeAll();
        }), null);

//        client.subscribeTradeEvent("ethusdt", ((event) -> {
//            System.out.println(event);
//        }), null);

    }

}
