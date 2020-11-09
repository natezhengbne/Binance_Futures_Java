package com.binance.client.impl;

import com.binance.client.impl.utils.JsonWrapper;
import com.fasterxml.jackson.core.JsonProcessingException;

@FunctionalInterface
public interface RestApiJsonParser<T> {

  T parseJson(JsonWrapper json) throws JsonProcessingException;
}
