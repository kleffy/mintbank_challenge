package com.kleffy.mintbank.challengeconsumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumer {
    private final static String TOPIC = "com.ng.vela.even.card_verified";
    private final static String GROUP_ID = "test";

    @KafkaListener(topics = TOPIC, groupId = GROUP_ID)
    public void listen(String message){
        log.info("{}", message);
    }
}
