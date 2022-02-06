package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class GreetingTest {
    @Test
    void shouldGetGreetingMessage() {
        String message = "some message";
        Greeting greeting = new Greeting(message);

        assertEquals(greeting.getMessage(), message);
    }
}