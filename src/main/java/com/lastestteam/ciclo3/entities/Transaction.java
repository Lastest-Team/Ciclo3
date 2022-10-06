package com.lastestteam.ciclo3.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Transaction")
@ToString
public class Transaction {
    @Id
    @Getter
    @Setter
    @Column(name = "id")
    private Long id;
    @Getter
    @Setter
    @Column(name = "concept")
    private String concept;
    @Getter
    @Setter
    @Column(name = "amount")
    private String amount;
    @Getter
    @Setter
    @Column(name = "employee_id")
    private String employee;
    @Getter
    @Setter
    @Column(name = "enterprise_id")
    private String enterprise;
    @Getter
    @Setter
    @Column(name = "created_at")
    private String created;
    @Getter
    @Setter
    @Column(name = "updated_at")
    private String updated;

/*
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

        /*
 */
    }
//}
