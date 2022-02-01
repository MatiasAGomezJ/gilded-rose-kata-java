package edu.poniperro.gildedrose.domain;

public class NormalItem implements Updateable {

    private Item item;

    public NormalItem(String name, int sellIn, int quality) {
        item = new Item(name, sellIn, quality);
    }
    public void updateQuality() {
        reduceSellIn();
        changQuality();
        checkQualityinRange();
    }

    private void reduceSellIn() {
        setSellIn(getSellIn() - 1);
    }

    private void changQuality() {
        int qModifier = 1;
        if (getSellIn() < 0) {
            qModifier *= 2;
        }
        setQuality(getQuality() + qModifier * (-1));
    }

    private void checkQualityinRange() {
        if (getQuality() <= 0) {
            setQuality(0);
        }
        if (getQuality() >= 50) {
            setQuality(50);
        }
    }

    public String toString() {
        return item.toString();
    }

    public int getSellIn() {
        return item.sellIn;
    }

    public int getQuality() {
        return item.quality;
    }

    public void setSellIn(int sellIn) {
        item.sellIn = sellIn;
    }

    public void setQuality(int quality) {
        item.quality = quality;
    }
}
