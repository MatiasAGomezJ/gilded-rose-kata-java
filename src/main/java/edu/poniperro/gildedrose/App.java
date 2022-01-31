package edu.poniperro.gildedrose;

import edu.poniperro.gildedrose.domain.*;

public class App {
    public static void main(String[] args){
        GildedRose shop = new GildedRose();
        System.out.println(shop.toString());
        NormalItem item1 = new NormalItem("Paco", 15, 20);
        System.out.println(item1.toString());
    }
}
