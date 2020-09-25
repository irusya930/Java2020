package ru.sbt;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @org.junit.jupiter.api.Test
    void openAccount() {
        Customer customer = new Customer("George", "Floyd");
        boolean actual = customer.openAccount(21343140L);
        assertEquals(true,actual);
        actual = customer.openAccount(21343140L);
        assertEquals(false,actual);
    }

    @org.junit.jupiter.api.Test
    void closeAccount() {
        Customer customer = new Customer("George", "Floyd");
        boolean actual = customer.closeAccount();
        assertEquals(false, actual);

        customer.openAccount(21343140L);
        actual = customer.closeAccount();
        assertEquals(false, actual);
    }

    @org.junit.jupiter.api.Test
    void fullName() {
        Customer customer = new Customer("George", "Floyd");
        String name = customer.fullName();
        assertEquals("George Floyd", name);
    }

    @org.junit.jupiter.api.Test
    void addMoneyToCurrentAccount() {
        Customer customer = new Customer("George", "Floyd");
        boolean actual;
        int i;
        for (i = -1000; i < 1000; i += 50){
            actual = customer.addMoneyToCurrentAccount(i);
            assertEquals(false, actual);
        }
        customer.openAccount(213123L);

        for (i = -1000; i < 0; i += 50) {
            actual = customer.addMoneyToCurrentAccount(i);
            assertEquals(false, actual);
        }

        for (i = 0; i < 1000; i += 50) {
            actual = customer.addMoneyToCurrentAccount(i);
            assertEquals(true, actual);
        }
    }

    @org.junit.jupiter.api.Test
    void withdrawFromCurrentAccount() {
        Customer customer = new Customer("George", "Floyd");
        boolean actual;

        int i;
        for (i = -1000; i < 1000; i += 50){
            actual = customer.withdrawFromCurrentAccount(i);
            assertEquals(false, actual);
        }

        customer.openAccount(213123L);

        customer.addMoneyToCurrentAccount(500);

        actual = customer.withdrawFromCurrentAccount(-1);
        assertEquals(false, actual);

        actual = customer.withdrawFromCurrentAccount(100);
        assertEquals(true, actual);

        actual = customer.withdrawFromCurrentAccount(400);
        assertEquals(true, actual);

        actual = customer.withdrawFromCurrentAccount(0);
        assertEquals(true, actual);

        actual = customer.withdrawFromCurrentAccount(100);
        assertEquals(false, actual);

    }


}