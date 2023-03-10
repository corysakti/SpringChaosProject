//package com.apache.demo.kafka;
//
//import org.apache.kafka.clients.producer.KafkaProducer;
//import org.apache.kafka.clients.producer.ProducerConfig;
//import org.apache.kafka.clients.producer.ProducerRecord;
//import org.apache.kafka.common.serialization.StringSerializer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.Properties;
//
//@Configuration
//public class ContohProducer {
//
//    @Bean
//    public void producerKafkaConfig(){
//        Properties properties = new Properties();
//        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
//        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
//
//        KafkaProducer<String, String> producer = new KafkaProducer<>(properties);
////        EmployeePOJO employees = new EmployeePOJO("1", "raiz");
////        KafkaProducer<String, Object> testProducer = new KafkaProducer<>(properties);
//
////        ProducerRecord<String, Object> testRecord = new ProducerRecord<>("employee", employees);
////        producer.send(testRecord);
//
//        for (int i = 0; i < 10; i++){
//            ProducerRecord<String, String> record = new ProducerRecord<>("topic-java","Data ke-"+i);
//            producer.send(record);
//
//            System.out.println(i);
//        }
//        producer.close();
//    }
//}
