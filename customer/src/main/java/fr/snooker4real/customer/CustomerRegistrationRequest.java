package fr.snooker4real.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {

}
