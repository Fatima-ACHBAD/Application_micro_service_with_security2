package ma.enset.customerfrontthymeleafapp;

import ma.enset.customerfrontthymeleafapp.entities.Customer;
import ma.enset.customerfrontthymeleafapp.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThymeleafAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymeleafAppApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("Fatima").email("Fatima@gmail.com").build());
            customerRepository.save(Customer.builder().name("Soukaina").email("Soukaina@gmail.com").build());
            customerRepository.save(Customer.builder().name("Saadia").email("Saadia@gmail.com").build());
        };
    }
}
