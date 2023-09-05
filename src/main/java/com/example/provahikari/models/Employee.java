package com.example.provahikari.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name")
    private String name;

    private LocalDateTime birthDate;

    private String nickname;

    private String nif;

    public Employee() {
    }

    public Employee( String name, LocalDateTime birthDate ) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Employee( String name, String nickname, String nif ) {
        this.name = name;
        this.nickname = nickname;
        this.nif = nif;
    }

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate( LocalDateTime birthDate ) {
        this.birthDate = birthDate;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname( String nickname ) {
        this.nickname = nickname;
    }

    public String getNif() {
        return nif;
    }

    public void setNif( String nif ) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
