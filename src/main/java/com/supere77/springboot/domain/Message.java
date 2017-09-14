package com.supere77.springboot.domain;

import lombok.*;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Calendar;

@Entity
public @Data class Message {

    @Id
    @GeneratedValue
    private Long id;

    private String message;

    private String sender;

    private Calendar date;

}
