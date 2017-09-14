package com.supere77.springboot.domain;


import com.supere77.springboot.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Calendar;

@Component
public class DemoData {

    @Autowired
    private MessageRepository repo;

    @PostConstruct
    public void setupDemoData(){

        Message m = new Message();
        m.setDate(Calendar.getInstance());
        m.setSender("Ernie");
        m.setMessage("My first message");
        repo.save(m);


    }
}
