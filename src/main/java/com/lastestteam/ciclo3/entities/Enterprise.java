package com.lastestteam.ciclo3.entities;


/*import java.management.relation.Role;*/
import java.util.ArrayList;
import java.util.List;



public class Enterprise {
    private int id;
    private String name;
    private String document;
    private String phone;
    private String address;
    private List<Transaction> transaction;

    private List<User> enterpriseslist;


    public Enterprise(int id, String name, String document, String phone, String address,/*List<User> userlist,*/ List<Transaction> transaction) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.address = address;
        /*this.user = user;*/
        /*this.user = new User(user.getId(),user.getName(),user.getUsername(),user.getEmail(),user.getPassword());*/

        /*this.transactions = transactions;*/
        /*this.profile = new Profile(profile.getImg(), profile.getPhone(),profile.getUser());*/
        this.transaction = new ArrayList<Transaction>(transaction);

        this.enterpriseslist = new ArrayList<User>();
        //this.setName(name);

    }


    //  public Enterprise(String name){
    //    this.setName(name);

    //this.enterprises = new ArrayList<User>();
    //public Enterprise(String name){
    //this.setName(name);


    //public void addUser(User user) {
    //    this.enterpriseslist.add(user);
    //}

    //public List<User> getEnterpriseslist() {
    //    return this.enterpriseslist;


    //}


///////

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

///////////////////




/*    public void addUser(User user){
        this.userlist.add(user);
    }

    public List<User> getUserList() {
        return this.userlist;
    }

*/
///////////////////


    /* public void setUser(List<User> user) {
         this.user = user;
     }
 */
    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }

    public void showEnterprise() {
        System.out.println("ID");
        System.out.println(getId());
        System.out.println("Name");
        System.out.println(getName());
        System.out.println("Address");
        System.out.println(getAddress());
        System.out.println("Phone");
        System.out.println(getPhone());
        System.out.println("Document");
        System.out.println(getDocument());
        /*user.printUser();
        System.out.println("-------------");*/
    }



/*
    public void showMovementMoney(){
        System.out.println("ID");
        System.out.println(getId());
        System.out.println("Concept");
        System.out.println(getConcept());
        System.out.println("Amount");
        System.out.println(getAmount());
        user.printUser();
        System.out.println("-------------");
    }*/


   // public void addUser(User user1) {
    //    this.enterprises.add(user1);

    }

    //public List<User> getEnterprises() {
    //    return this.enterprises;

