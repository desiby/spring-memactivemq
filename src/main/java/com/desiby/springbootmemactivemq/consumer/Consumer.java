package com.desiby.springbootmemactivemq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @JmsListener(destination = "inmemory.queue")
    public void listener(String message){
        System.out.println("Receive Message: -> " +message);
    }
}
