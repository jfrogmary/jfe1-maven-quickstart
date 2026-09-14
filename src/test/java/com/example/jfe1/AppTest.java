package com.example.jfe1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void shouldReturnGreeting() {
        assertEquals(
            "Hello from the JFE1 Maven quick-start project!",
            App.getGreeting()
        );
    }
}
