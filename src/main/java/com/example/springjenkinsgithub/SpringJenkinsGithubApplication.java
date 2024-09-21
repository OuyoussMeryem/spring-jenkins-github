package com.example.springjenkinsgithub;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsGithubApplication {
    public static Logger logger= LoggerFactory.getLogger(SpringJenkinsGithubApplication.class);

    @PostConstruct
    public void intt(){
        logger.info("Application  started.....");
    }

    public static void main(String[] args) {

        logger.info("Application  executed.....");
        SpringApplication.run(SpringJenkinsGithubApplication.class, args);

    }

}
