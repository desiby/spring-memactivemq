package com.desiby.springbootmemactivemq.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

import javax.jms.Queue;


@RestController
@RequestMapping("publish")
public class Producer {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private Queue queue;

    @GetMapping("/{message}")
    public String publishString(@PathVariable("message") final String message){
        jmsTemplate.convertAndSend(queue, message);
        return "published succesfully";
    }

}
