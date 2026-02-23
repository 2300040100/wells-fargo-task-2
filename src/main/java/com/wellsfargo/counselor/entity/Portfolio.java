package com.wellsfargo.counselor.entity;

import java.util.List;

public class Portfolio {

    private int portfolioId;
    private List<Security> securities;

    public Portfolio(int portfolioId, List<Security> securities) {
        this.portfolioId = portfolioId;
        this.securities = securities;
    }

    public int getPortfolioId() {
        return portfolioId;
    }

    public List<Security> getSecurities() {
        return securities;
    }
}