package com.wellsfargo.counselor.entity;

import java.util.List;

public class Client {

    private int clientId;
    private String firstName;
    private String lastName;
    private List<Portfolio> portfolios;

    public Client(int clientId, String firstName, String lastName, List<Portfolio> portfolios) {
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.portfolios = portfolios;
    }

    public int getClientId() {
        return clientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Portfolio> getPortfolios() {
        return portfolios;
    }
}