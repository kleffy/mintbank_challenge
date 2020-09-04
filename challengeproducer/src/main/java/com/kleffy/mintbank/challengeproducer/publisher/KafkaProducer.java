package com.kleffy.mintbank.challengeproducer.publisher;

import com.kleffy.mintbank.challengeproducer.domain.performance.VerifiedCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;
    @Value("${challenge.queue.topic}")
    private String topic;

    public void produce(Object message){
        kafkaTemplate.send(topic, message);
    }
}
