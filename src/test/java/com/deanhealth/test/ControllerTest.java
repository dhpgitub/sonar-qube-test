package com.deanhealth.test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ControllerTest {

    @Test
    public void helloWorldTest() {
        Controller controller = new Controller();

        System.out.println("Jamie: Running tests");
        assertEquals("Hello World", controller.helloWorld());
    }
}