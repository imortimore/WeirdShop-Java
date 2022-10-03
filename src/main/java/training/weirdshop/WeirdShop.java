package training.weirdshop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class WeirdShop {
    private Item[] items;
    ArrayList<String> specialItems = new ArrayList<>(Arrays.asList("Aged Brie","Backstage Pass","Gold Coin"));
    public WeirdShop(Item[] items) {
        this.items = items;
    }

    void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!specialItems.contains(items[i].name)) {
                items[i].decreaseQuality();//reduce quality of normal items
            }else{//adds quality if not at max for backstage & brie
                items[i].increaseQuality();
                //increase quality of backstage pass based on days remaining
                if (items[i].name.equals("Backstage Pass")&&items[i].sellIn < 12) {
                    items[i].increaseQuality();
                    if (items[i].sellIn < 7) {
                        items[i].increaseQuality();
                    }
                }
            }
            //reduces sell-in value of everything except gold coins
            if (!items[i].name.equals("Gold Coin")) {items[i].sellIn = items[i].sellIn - 1;}
            //handle expired items
            if (items[i].sellIn<0){
                if (!specialItems.contains(items[i].name)){
                    items[i].decreaseQuality();
                }else if(items[i].name.equals("Aged Brie")){
                    items[i].increaseQuality();
                } else if (items[i].name.equals("Backstage Pass")) {
                    items[i].quality = 0;
                }
            }
        }
    }
}