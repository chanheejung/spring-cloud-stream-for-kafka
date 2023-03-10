package kr.pe.chani.springcloudstreampub.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;
import java.util.function.Supplier;

@Slf4j
@Configuration
public class KafkaConfig {

    @Bean
    public Supplier<Integer> basicProducer() {
        return () -> 100;
    }

    @Bean
    public Consumer<String> basicConsumer() {
        return number -> log.info("message = {}", number);
    }
}