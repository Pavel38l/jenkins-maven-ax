package ru.vsu;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void sum() {
        Assert.assertEquals(4, Point.sum(2, 2));
    }
}