package com.binance.client.model.event;



import java.math.BigDecimal;


public class TradeEvent {

    private String eventType;

    private Long eventTime;

    private String symbol;

    private Long id;

    private BigDecimal price;

    private BigDecimal qty;

    private Long buyOrderId;

    private Long sellOrderId;

    private Long exchangeTIme;

    private boolean isMarket;

    public boolean isMarket() {
        return isMarket;
    }

    public void setMarket(boolean market) {
        isMarket = market;
    }

    public Long getExchangeTIme() {
        return exchangeTIme;
    }

    public void setExchangeTIme(Long exchangeTIme) {
        this.exchangeTIme = exchangeTIme;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public Long getBuyOrderId() {
        return buyOrderId;
    }

    public void setBuyOrderId(Long buyOrderId) {
        this.buyOrderId = buyOrderId;
    }

    public Long getSellOrderId() {
        return sellOrderId;
    }

    public void setSellOrderId(Long sellOrderId) {
        this.sellOrderId = sellOrderId;
    }
//    private Long time;





}
