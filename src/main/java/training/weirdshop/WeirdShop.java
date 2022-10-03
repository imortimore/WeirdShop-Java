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
            if (items[i].quality > 0 && !specialItems.contains(items[i].name)) {
                items[i].quality = items[i].quality - 1;//reduce quality of normal items
            } else {//adds quality if not at max for backstage & brie
                items[i].quality =items[i].quality<50?items[i].quality+1:items[i].quality;
                //increase quality of backstage pass based on days remaining
                if (items[i].name.equals("Backstage Pass")) {
                    if (items[i].sellIn < 12) {
                        items[i].quality =items[i].quality<50?items[i].quality+1:items[i].quality;
                    }
                    if (items[i].sellIn < 7) {
                        items[i].quality =items[i].quality<50?items[i].quality+1:items[i].quality;
                    }
                }
            }
            //reduces sell-in value of everything except gold coins
            if (!items[i].name.equals("Gold Coin")) {items[i].sellIn = items[i].sellIn - 1;}

            //handle expired items
            if (items[i].sellIn<0){
                if (!specialItems.contains(items[i].name)){
                    items[i].quality = items[i].quality - 1;
                }else if(items[i].name.equals("Aged Brie")){
                    items[i].quality =items[i].quality<50?items[i].quality+1:items[i].quality;
                } else if (items[i].name.equals("Backstage Pass")) {
                    items[i].quality = 0;
                }
            }
            //old code
            /*if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage Pass")) {
                        if (items[i].quality > 0&&!items[i].name.equals("Gold Coin")) {
                            items[i].quality = items[i].quality - 1;//reducing value if no special ruling
                        }
                        //sets backstage pass value to 0 if sellIn = 0
                    } else {
                        items[i].quality = 0;
                    }
                    //validating not at max quality
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }*/
        }
    }
}