package com.husamcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication //It is a shortcut for the three annotations below
// //{Start
//@ComponentScan(basePackages =  "com.husamcode")
//@EnableAutoConfiguration
//@Configuration
// // End}
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
// Getting Started (AmigosCode Tutorial)

    @GetMapping("/greet")
    public GreetResponse great(){

        GreetResponse response = new GreetResponse(
                "Hello",
                List.of("java", "Golang", "javascript"),
                new Person("Alex", 28, 30_000)
        );
        return response;
    }

    record Person(String name, int age, double savings){}

    record GreetResponse(
            String greet,
            List<String> favProgrammingLanguages,
            Person person
    ){} // A shortcut for the following class
// //{Start
//    class GreetResponse{
//        private final String greet;
//
//        GreetResponse(String greet) {
//            this.greet = greet;
//        }
//
//        public String getGreet() {
//            return greet;
//        }
//
//        @Override
//        public String toString() {
//            return "GreetResponse{" +
//                    "greet='" + greet + '\'' +
//                    '}';
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            GreetResponse that = (GreetResponse) o;
//            return Objects.equals(greet, that.greet);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(greet);
//        }
//    }
// // End}

}
