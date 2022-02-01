package edu.poniperro.gildedrose.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NormalItemTest {
    @Test
    public void toStringTest() {
        String[][] dexVest = Tests.dexVest;
        NormalItem item1 = new NormalItem(dexVest[0][0], Integer.parseInt(dexVest[0][1]), Integer.parseInt(dexVest[0][2]));
        assertEquals(item1.toString(), "+5 Dexterity Vest, 10, 20");
    }

    @Test
    public void updateQualityTest() {
        String[][] dexVest = Tests.dexVest;
        NormalItem item1 = new NormalItem(dexVest[0][0], Integer.parseInt(dexVest[0][1]), Integer.parseInt(dexVest[0][2]));
        for (int i = 0; i < dexVest.length; i++) {
            assertEquals(item1.toString(), dexVest[i][0] + ", " + dexVest[i][1] + ", " + dexVest[i][2]);
            item1.updateQuality();
        }
    }
}
