package net.bounlerth.orderservice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Value("${spring.kafka.topic.name}")
    private String topicName;

    // spring bean for kafka topic
    @Bean
    public NewTopic topic(){
        return TopicBuilder.name(topicName)
                .build();
    }
}

//@Bean
//public NewTopic topic1() {
//    return TopicBuilder.name("thing1")
//            .partitions(10)
//            .replicas(3)
//            .compact()
//            .build();
//}
//
//@Bean
//public NewTopic topic2() {
//    return TopicBuilder.name("thing2")
//            .partitions(10)
//            .replicas(3)
//            .config(TopicConfig.COMPRESSION_TYPE_CONFIG, "zstd")
//            .build();
//}
