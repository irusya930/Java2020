package ru.sbt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CloseAccount_whenAccountNotExist {

    @Test
    void closeAccount() {
        Customer customer = new Customer("George", "Floyd");
        boolean actual = customer.closeAccount();
        assertFalse(actual);
    }
}