package com.ics95191.demo;

import com.ics95191.demo.Model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class Sampleclass implements CommandLineRunner {
    public FeignRestClient feignRestClient;

    public Sampleclass(FeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }


    @Override
    public void run(String... args) throws Exception {
        Student student=feignRestClient.registerStudent(new Student(1,95191,"Stanley"));

    }
}
