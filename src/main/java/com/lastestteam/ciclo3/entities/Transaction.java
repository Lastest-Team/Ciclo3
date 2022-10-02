package com.lastestteam.ciclo3.entities;

public class Transaction {
    private int id;
    private String concept;
    private double amount;
    private User user;
    private Enterprise enterprise;

    public Transaction(int id, String concept, double amount , User user, Enterprise enterprise) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        this.user = new User(user.getId(),user.getName(),user.getUsername(),user.getEmail(),user.getPassword());
        this.enterprise = enterprise;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Enterprise getEnterprise() { return enterprise; }

    public void setEnterprise(Enterprise enterprise) { this.enterprise = enterprise; }

    public void showMovementMoney(){
        System.out.println("ID");
        System.out.println(getId());
        System.out.println("Concept");
        System.out.println(getConcept());
        System.out.println("Amount");
        System.out.println(getAmount());
        user.printUser();
        System.out.println("-------------");
    }
}
