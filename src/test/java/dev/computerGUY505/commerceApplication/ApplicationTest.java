package dev.computerGUY505.commerceApplication;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;


public class ApplicationTest {
    private Application app;
    
    @Before
    public void setup() {
        app = new Application();
    }
    
    
    @Test
    public void testWordCountString() {
        int count = app.countwords("this is a test");
        assertEquals(4, count);
    }

    @Test
    public void testWordCountEmpty() {
        int count = app.countwords("");
        assertEquals(0, count);
    }

    @Test
    public void testWordCountNull() {
        int count = app.countwords(null);
        assertEquals(0, count);
    }

    @Test
    @Ignore
    public void testWordCountMore() {
        int count = app.countwords("this will be skipped");
        assertEquals(3, count);
    }

    @Test
    public void testWordCountSingle() {
        int count = app.countwords("test");
        assertEquals(1, count);
    }
}