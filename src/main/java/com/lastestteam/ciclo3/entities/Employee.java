package com.lastestteam.ciclo3.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;

/*import javax.management.relation.Role;*/
//import java.util.List;

@Entity
@Table(name = "Employee")
@ToString @EqualsAndHashCode
public class Employee {
    @Id
    @Getter @Setter @Column (name = "id")
    private Long id;
    @Getter @Setter @Column (name = "name")
    private String name;

    @Getter @Setter @Column (name = "email")
    private String email;

    @Getter @Setter @Column (name = "role")
    private String role;

    @Getter @Setter @Column (name = "enterprise")
    private String enterprise;

    @Getter @Setter @Column (name = "profile")
    private String profile;

    @Getter @Setter @Column (name = "password")
    private String password;
    //@Getter @Setter

  //  private List<Transaction> transaction;

/*
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Employee employee = (Employee) o;
        return id != null && Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

    //public void add(Employee employee) {
//    }
//}