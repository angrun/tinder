package com.tinder.backend.models;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.security.Timestamp;
import java.util.Date;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user", schema = "public")
public class User {

    @Id
    @GeneratedValue
    Long id;

    @Column
    String name;

    @Column
    String surname;

    @Column
    String password;

    @Column
    String password2;

    @Column
    String city;

    @Column
    String country;

    @Column
    String gender;

    @Column
    String birth;

    @Column
    Integer likes;

//    @Column
//    String hobby [];


}
