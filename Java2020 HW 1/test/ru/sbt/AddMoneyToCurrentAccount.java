package ru.sbt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddMoneyToCurrentAccount {

    @Test
    void addMoneyToCurrentAccount() {
        Customer customer = new Customer("George", "Floyd");
        boolean actual;
        int i;
        for (i = -1000; i < 1000; i += 50){
            actual = customer.addMoneyToCurrentAccount(i);
            assertFalse(actual);
        }
        customer.openAccount(213123L);
        for (i = -1000; i < 0; i += 50) {
            actual = customer.addMoneyToCurrentAccount(i);
            assertFalse(actual);
        }
        for (i = 0; i < 1000; i += 50) {
            actual = customer.addMoneyToCurrentAccount(i);
            assertTrue(actual);
        }
    }
}