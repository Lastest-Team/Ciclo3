package com.lastestteam.ciclo3.entities;

public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private String password;

    public User(int id, String name, String username, String email, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void printUser(){
        System.out.println("Id del usuario:");
        System.out.println(getId());
        System.out.println("Nombre:");
        System.out.println(getName());
        System.out.println("Usuario:");
        System.out.println(getUsername());
        System.out.println("Correo");
        System.out.println(getEmail());
        System.out.println("Contraseña");
        System.out.println(getPassword());
    }
}
