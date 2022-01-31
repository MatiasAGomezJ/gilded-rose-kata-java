package edu.poniperro.gildedrose.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NormalItemTest {
    @Test
    public void toStringTest() {
        String[][] dexVest = Tests.dexVest;
        NormalItem item1 = new NormalItem(dexVest[0][0], dexVest[0][1], dexVest[0][2]);
        assertEquals(item1.toString(), "Paco, 15, 20");
    }
}
