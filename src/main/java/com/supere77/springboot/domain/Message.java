package com.supere77.springboot.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Calendar;

/**
 * JPA Entity for the REST-enpdoint
 * @author superernie77
 *
 */
@Entity
public @Data class Message {

    @Id
    @GeneratedValue
    private Long id;

    private String message;

    private String sender;

    private Calendar date;

}
