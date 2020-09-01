package com.binance.client.examples.websocket;

import com.alibaba.fastjson.JSON;
import com.binance.client.SubscriptionClient;
import com.binance.client.examples.constants.PrivateConfig;

public class SubscribeSymbolTicker {

    public static void main(String[] args) {

        SubscriptionClient client = SubscriptionClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
   
        client.subscribeSymbolTickerEvent("btcusdt,ehtusdt,linkusdt", ((event) -> {
            System.out.println(JSON.toJSONString(event));
            client.unsubscribeAll();
        }), null);

    }

}
