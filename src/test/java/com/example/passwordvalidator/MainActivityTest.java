package com.example.passwordvalidator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {
    @Test
    public void checkLength(){
        MainActivity m = new MainActivity();
        Assert.assertTrue(m.tooLong("12345678901"));
    }

    @Test
    public void checkUpperCase(){
        MainActivity m = new MainActivity();
        Assert.assertTrue(m.needUpperCase("asdfg"));
    }

    @Test
    public void notPassword(){
        MainActivity m = new MainActivity();
        Assert.assertTrue(m.needUpperCase("password"));
    }

    @Test
    public void needInteger(){
        MainActivity m = new MainActivity();
        Assert.assertTrue(m.needUpperCase("qwerty"));
    }

    @Test
    public void length(){
        MainActivity m = new MainActivity();
        Assert.assertTrue(m.needUpperCase("a"));
    }



}


