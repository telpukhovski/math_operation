import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;


public class MathOpeartionTest {
    private HashSet<String> firstHashSet;
    private HashSet<String> secondHashSet;

    @Before
    public void setUp() {
        firstHashSet = new HashSet<>();
        firstHashSet.add("A");
        firstHashSet.add("B");

        secondHashSet = new HashSet<>();
        secondHashSet.add("B");
        secondHashSet.add("C");
    }

    @Test
    public void testUnion() {
        HashSet expected = MathOpeartion.union(firstHashSet, secondHashSet);
        HashSet<String> actual = new HashSet<>();
        actual.add("A");
        actual.add("B");
        actual.add("C");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIntersection() {
        HashSet expected = MathOpeartion.intersection(firstHashSet, secondHashSet);
        HashSet<String> actual = new HashSet<>();
        actual.add("B");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMinus() {
        HashSet expected = MathOpeartion.minus(firstHashSet, secondHashSet);
        HashSet<String> actual = new HashSet<>();
        actual.add("A");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDifference() {
        HashSet expected = MathOpeartion.difference(firstHashSet, secondHashSet);
        HashSet<String> actual = new HashSet<>();
        actual.add("A");
        actual.add("C");

        Assert.assertEquals(expected, actual);
    }

}



