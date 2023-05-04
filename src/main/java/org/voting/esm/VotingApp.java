package org.voting.esm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.voting.esm")
public class VotingApp {
    public static void main(String[] args) {
        SpringApplication.run(VotingApp.class, args);
    }
}