package edu.poniperro.gildedrose.domain;

public class NormalItem extends Item implements Updateable {

    private String name;
    private int sellIn;
    private int quality;

    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        reduceSellIn();
        changQuality();
        checkQualityinRange();
    }

    private void reduceSellIn() {
        sellIn --;
    }

    private void changQuality() {
        int qModifier = 1;
        if (sellIn < 0) {
            qModifier *= 2;
        }
        quality += (qModifier * (-1));
    }

    private void checkQualityinRange() {
        if (quality <= 0) {
            quality = 0;
        }
        if (quality >= 50) {
            quality = 50;
        }
    }
}
