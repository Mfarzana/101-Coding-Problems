/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockmarketSolution;

/**
 *
 * @author Farzana
 */
public class Trade {
    private Double buy;
    private Double sell;
    public Trade(Double buy, Double sell){
        this.buy=buy;
        this.sell=sell;
    }

    public Double getBuy() {
        return buy;
    }

    public void setBuy(Double buy) {
        this.buy = buy;
    }

    public Double getSell() {
        return sell;
    }

    public void setSell(Double sell) {
        this.sell = sell;
    }

    @Override
    public String toString() {
        return "Trade{" + "buy=" + buy + ", sell=" + sell + '}';
    }
    
    
}
