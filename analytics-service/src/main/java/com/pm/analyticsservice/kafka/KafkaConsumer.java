package com.pm.analyticsservice.kafka;

import com.google.protobuf.InvalidProtocolBufferException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.KafkaListeners;
import org.springframework.stereotype.Service;
import patient.events.PatientEvent;

@Service
public class KafkaConsumer {

    private static final Log log = LogFactory.getLog(KafkaConsumer.class);

    @KafkaListener(topics = "patient", groupId = "analytics-service")
    public void consumeEvent(byte[] event) {
        // Logic to process the incoming event bytes
        // For example, deserialize the bytes and update analytics data
        try {
            PatientEvent patientEvent = PatientEvent.parseFrom(event);
            log.info("Received PatientEvent: " + patientEvent);
        } catch (InvalidProtocolBufferException e) {
            log.error("Error deserializing PatientEvent: {}" + e.getMessage());
        }
    }

}
