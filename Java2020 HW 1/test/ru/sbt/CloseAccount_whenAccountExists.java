package ru.sbt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CloseAccount_whenAccountExists {

    @Test
    void closeAccount() {
        Customer customer = new Customer("George", "Floyd");
        customer.openAccount(21343140L);
        boolean actual = customer.closeAccount();
        assertTrue(actual);
    }
}