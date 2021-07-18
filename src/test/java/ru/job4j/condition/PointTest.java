package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void testDistance3d() {
        Point a = new Point(0, 2, 4);
        Point b = new Point(1, 3, 5);
        double dist = a.distance3d(b);
        assertThat(dist, closeTo(1.732, 0.0001));
    }
}