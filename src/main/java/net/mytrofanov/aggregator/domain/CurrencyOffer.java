package net.mytrofanov.aggregator.domain;

public class CurrencyOffer extends ID {

    private Currency currencyType;
    private Double buy;
    private Double sale;

    public CurrencyOffer(Long id, Currency currencyType, Double buy, Double sale) {
        super(id);
        this.currencyType = currencyType;
        this.buy = buy;
        this.sale = sale;
    }

    public Currency getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(Currency currencyType) {
        this.currencyType = currencyType;
    }

    public Double getBuy() {
        return buy;
    }

    public void setBuy(Double buy) {
        this.buy = buy;
    }

    public Double getSale() {
        return sale;
    }

    public void setSale(Double sale) {
        this.sale = sale;
    }
}
