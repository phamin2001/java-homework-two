package com.ga;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class TreeTest {

    @Test
    public void testIfInsertCorrect() {
        Tree tree = new Tree();
        assertTrue( tree.insert(4));
    }

    @Test
    public void testIfTraverseInOrderCorrect() {
        Tree tree = new Tree();
        tree.insert(56);
        assertTrue(tree.traverseInOrder());
    }
}
