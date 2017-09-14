package com.supere77.springboot.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Calendar;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Message {

    @Id
    private Long id;

    private String message;

    private String sender;

    private Calendar date;

}
