package com.supere77.springboot.domain;


import com.supere77.springboot.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Calendar;

/**
 * Inserts some demo data into the H2 DB
 * @author superernie77
 *
 */
@Component
public class DemoData {

	/**
	 * Message Repo
	 */
    @Autowired
    private MessageRepository repo;

    /**
     * Setup demo data
     */
    @PostConstruct
    public void setupDemoData(){

        Message m = new Message();
        m.setDate(Calendar.getInstance());
        m.setSender("Ernie");
        m.setMessage("My first message");
        repo.save(m);
    }
}
