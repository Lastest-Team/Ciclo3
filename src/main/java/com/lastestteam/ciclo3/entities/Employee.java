package com.lastestteam.ciclo3.entities;

/*import javax.management.relation.Role;*/
import java.util.ArrayList;
import java.util.List;

public class Employee {
    private long id;

    private String email;
    private Profile profile;
    private RoleName role;

    private String name;
    private Enterprise enterprise;
    private List<Transaction> transaction;

    public Employee(long id, String name, Profile profile, List<Transaction> transaction, RoleName role, String email, Enterprise enterprise) {
        this.id = id;
        this.name = name;
        this.profile = new Profile(profile.getImg(), profile.getPhone(),profile.getUser());
        this.transaction = new ArrayList<Transaction>(transaction);
        this.role = role;
        this.email = email;
        this.enterprise = enterprise;
    }
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Enterprise getEnterprise() { return enterprise; }

    public void setEnterprise(Enterprise enterprise) { this.enterprise = enterprise; }

    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }

    public RoleName getRole() {
        return role;
    }

    public void setRole(RoleName role) {
        this.role = role;

    }

    public void showEmployee(){
        System.out.println("ID");
        System.out.println(getId());
        System.out.println("Name");
        System.out.println(getName());
        System.out.println("Email");
        System.out.println(getEmail());
        System.out.println("Enterprise");
        System.out.println(getEnterprise());
        System.out.println("Role");
        System.out.println(getRole());
        /*user.printUser();
        System.out.println("-------------");*/


    }

}