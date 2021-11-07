package com.nafisulbari.datatable.person;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Ahmed Nafisul Bari
 */
@Data
@Entity
@Table(name = "PERSON_TABLE")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ADDRESS")
    private String address;
}
