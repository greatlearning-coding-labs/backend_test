package com.gl.todoManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.gl.todoManager.App;

public class AppTest {
    @Test
    public void testSum() {
        App demo = new App();
        int result = demo.sum(2, 3);
        assertEquals(5, result);
    }
}

