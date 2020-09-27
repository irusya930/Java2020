package ru.sbt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OpenAccount_whenAccountNotExist {
    @Test
    void openAccount() {
        Customer customer = new Customer("George", "Floyd");
        boolean actual = customer.openAccount(21343140L);
        assertTrue(actual);
    }
}