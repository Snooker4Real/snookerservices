package fr.snooker4real.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService() {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
                // TODO : check if email is valid
                // TODO : check if email is not taken
                // TODO : store customer in db
    }
}
