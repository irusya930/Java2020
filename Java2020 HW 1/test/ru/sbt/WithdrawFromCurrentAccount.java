package ru.sbt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithdrawFromCurrentAccount {

    @Test
    void withdrawFromCurrentAccount() {
        Customer customer = new Customer("George", "Floyd");
        boolean actual;
        int i;
        for (i = -1000; i < 1000; i += 50){
            actual = customer.withdrawFromCurrentAccount(i);
            assertFalse(actual);
        }
        customer.openAccount(213123L);
        customer.addMoneyToCurrentAccount(500);
        actual = customer.withdrawFromCurrentAccount(-1);
        assertFalse(actual);
        actual = customer.withdrawFromCurrentAccount(100);
        assertTrue(actual);
        actual = customer.withdrawFromCurrentAccount(400);
        assertFalse(actual);
        actual = customer.withdrawFromCurrentAccount(399.999999);
        assertTrue(actual);
        actual = customer.withdrawFromCurrentAccount(0);
        assertTrue(actual);
        actual = customer.withdrawFromCurrentAccount(100);
        assertFalse(actual);
    }
}