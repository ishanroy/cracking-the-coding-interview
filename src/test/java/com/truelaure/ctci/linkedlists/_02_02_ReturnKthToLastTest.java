package com.truelaure.ctci.linkedlists;

import org.junit.Test;

import static com.truelaure.ctci.linkedlists.LinkedListNode.of;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class _02_02_ReturnKthToLastTest {

    private _02_02_ReturnKthToLast s = new _02_02_ReturnKthToLast();

    @Test
    public void withOutOfScopeK() {
        assertNull(s.kthToLast(of(1, 2, 3), 3));
    }

    @Test
    public void withZero() {
        assertEquals(3, s.kthToLast(of(1, 2, 3), 0).val);
    }

    @Test
    public void withNoneZero() {
        assertEquals(2, s.kthToLast(of(1, 2, 3), 1).val);
    }


}