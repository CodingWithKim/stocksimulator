package org.example.stocksimulator;

public class Stock {
    private String symbol;
    private double openPrice;
    private double closePrice;
    private double highPrice;
    private double lowPrice;
    private int volume;

    public Stock(String symbol, double openPrice, double closePrice, double highPrice, double lowPrice, int volume) {
        this.symbol = symbol;
        this.openPrice = openPrice;
        this.closePrice = closePrice;
        this.highPrice = highPrice;
        this.lowPrice = lowPrice;
        this.volume = volume;
    }

    // Getters
    public String getSymbol() { return symbol; }
    public double getOpenPrice() { return openPrice; }
    public double getClosePrice() { return closePrice; }
    public double getHighPrice() { return highPrice; }
    public double getLowPrice() { return lowPrice; }
    public int getVolume() { return volume; }
}


