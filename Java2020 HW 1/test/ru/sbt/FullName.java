package ru.sbt;

import org.junit.jupiter.api.Test;

import java.lang.management.GarbageCollectorMXBean;
import java.nio.charset.Charset;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class FullName {

    @Test
    void fullName() {
        String name = "George";
        String surname = "Floyd";
        Customer customer = new Customer(name, surname);
        assertTrue(customer.fullName().equals(name + " " + surname));
    }
}