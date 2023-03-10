package com.apache.demo.kafka;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.RecordMetadata;

@Data
@AllArgsConstructor
public class EmployeePOJO {

    private String id;
    private String name;
;

}
