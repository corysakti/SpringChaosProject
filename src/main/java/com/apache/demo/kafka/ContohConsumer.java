//package com.apache.demo.kafka;
//
//import org.apache.kafka.clients.consumer.ConsumerConfig;
//import org.apache.kafka.clients.consumer.ConsumerRecord;
//import org.apache.kafka.clients.consumer.ConsumerRecords;
//import org.apache.kafka.clients.consumer.KafkaConsumer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.Duration;
//import java.util.Arrays;
//import java.util.Properties;
//
//@Configuration
//public class ContohConsumer {
//
//    @Bean
//    public void consumerKafkaconfig(){
//        Properties properties = new Properties();
//        properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//        properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, "test");
//        properties.setProperty(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
//        properties.setProperty("auto.commit.interval.ms", "1000");
//        properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
//        properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, " org.apache.kafka.common.serialization.StringDeserializer");
//
//        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(properties);
//        consumer.subscribe(Arrays.asList("topic-java"));
//
//        while (true){
//            ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
//            for (ConsumerRecord<String, String> record : records) {
//                System.out.println("Receive data : "+record.value());
//            }
//        }
//    }
//}
