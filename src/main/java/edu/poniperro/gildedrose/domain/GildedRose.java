package edu.poniperro.gildedrose.domain;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {

    private List<Updateable> stock = new ArrayList<>();

    public GildedRose(){

    }
    public GildedRose(List<Updateable> items) {
        stock = items;
    }

    public List<Updateable> stock() {
        return this.stock;
    }

    public void updateQuality() {
        for (Updateable item :
                stock()) {
            item.updateQuality();
        }
    }

    public void addItem(Updateable item) {
        stock.add(item);
    }

    @Override
    public String toString() {
        String result = "";
        for (Updateable item :
                stock) {
            result = result + item;
            if (stock.indexOf(item) != stock.size()-1) {
                result += ", ";
            }
        }
        return result;
        // Deberia devolver la lista de items
    }
}
