package src.main.java.me.dio.bankAccount.model;

import java.math.BigDecimal;

import src.main.java.me.dio.bankAccount.resources.Colors;

public class Account {

    private int number;
    private String agency;
    private String client;
    private BigDecimal balance;

    public Account() {

    }

    public Account(int number, String agency, String client, BigDecimal balance) {
        this.number = number;
        this.agency = agency;
        this.client = client;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void success() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Olá ");
        buffer.append(Colors.ANSI_GREEN);
        buffer.append(client);
        buffer.append(Colors.ANSI_RESET);
        buffer.append(", obrigado por criar uma conta em nosso banco, sua agência é ");
        buffer.append(Colors.ANSI_GREEN);
        buffer.append(agency);
        buffer.append(Colors.ANSI_RESET);
        buffer.append(", conta ");
        buffer.append(Colors.ANSI_GREEN);
        buffer.append(number);
        buffer.append(Colors.ANSI_RESET);
        buffer.append(" e seu saldo é de R$ ");
        buffer.append(Colors.ANSI_GREEN);
        buffer.append(balance);
        buffer.append(Colors.ANSI_RESET);
        buffer.append(" já está disponível para saque.");
        
        System.out.println(buffer);

    }

    @Override
    public String toString() {
        return "Account [number=" + number + ", agency=" + agency + ", client=" + client + ", balance=" + balance + "]";
    }
    
}
