package com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
    
    @Test
    public void testApp() {
        System.out.println("\n\ttestApp()");
        Assert.assertTrue(true);
    }

    @Test
    public void testApp2() {
        System.out.println("\n\ttestApp2()");
        Assert.assertTrue(true);
    }

}
