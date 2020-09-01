package com.binance.client.examples.trade;

import com.binance.client.RequestOptions;
import com.binance.client.SyncRequestClient;

import com.binance.client.examples.constants.PrivateConfig;

public class ChangeInitialLeverage {


    public static void main(String[] args) {
        String apiKey = "io8vSxPobscpT9FGzuNRK3JHLTcn0ER9qGW1vct9r8RUJ1czUkdq897MIDQFwhEU";
        String secretKey = "iBCR1hVRSer2KcIy2ULizrEBZqJeHjgX8nJN5O4xWtmYPau8rMV1s6IwJkOMs8uL";
        RequestOptions options = new RequestOptions();
        SyncRequestClient syncRequestClient = SyncRequestClient.create(apiKey, secretKey,
                options);
        System.out.println(syncRequestClient.changeInitialLeverage("BTCUSDT", 1));
    }
}