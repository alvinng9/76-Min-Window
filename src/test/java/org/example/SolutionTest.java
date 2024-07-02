package org.example;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void minWindowTest() {
        Solution solution = new Solution();
        Assert.assertEquals("BANC", solution.minWindow("ADOBECODEBANC", "ABC"));
        Assert.assertEquals("a", solution.minWindow("a", "a"));
        Assert.assertEquals("", solution.minWindow("a", "aa"));
    }

}