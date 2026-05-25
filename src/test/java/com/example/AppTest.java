package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    App app = new App();

    @Test
    public void testAdd() {
        assertEquals(15, app.add(10, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(5, app.subtract(10, 5));
    }
}
