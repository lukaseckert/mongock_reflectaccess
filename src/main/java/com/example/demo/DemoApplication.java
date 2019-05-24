package com.example.demo;

import com.github.cloudyrock.mongock.Mongock;
import com.github.cloudyrock.mongock.SpringMongockBuilder;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    private static final String MONGO_URI = "mongodb://root:root@localhost:37017";


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public Mongock mongock() {
        MongoClient mongoclient = new MongoClient(new MongoClientURI(MONGO_URI));

        return new SpringMongockBuilder(
            mongoclient, "sampleDatabase", SampleChangeLog.class.getPackageName()).build();
    }


}
