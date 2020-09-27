package ru.sbt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OpenAccount_whenAccountExists {

    @Test
    void openAccount() {
        Customer customer = new Customer("George", "Floyd");
        customer.openAccount(21343140L);
        boolean actual = customer.openAccount(21343140L);
        assertFalse(actual);
    }
}