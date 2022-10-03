package training.weirdshop;

class WeirdShop {
    private Item[] items;

    public WeirdShop(Item[] items) {
        this.items = items;
    }










    void updateQuality() {
        items.stream().forEach(items->items.updateQuality);
















        //iterates through list to reduce quality of normal items
//        for (int i = 0; i < items.length; i++) {
//            if (!items[i].name.equals("Aged Brie") && !items[i].name.equals("Backstage Pass")) {
//                if (items[i].quality > 0) {
//                    if (!items[i].name.equals("Gold Coin")) {items[i].quality = items[i].quality - 1;}
//                }
//                //adds quality if not at max for backstage & brie
//            } else {
//                if (items[i].quality < 50) {items[i].quality = items[i].quality + 1;
//                    //increase quality of backstage pass based on days remaining
//                    if (items[i].name.equals("Backstage Pass")) {
//                        if (items[i].sellIn < 12) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//
//                        if (items[i].sellIn < 7) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//                    }
//                }
//            }
//            //reduces sell in value of everything except gold coins
//            if (!items[i].name.equals("Gold Coin")) {items[i].sellIn = items[i].sellIn - 1;}
//            //reducing value if no special ruling
//            if (items[i].sellIn < 0) {
//                if (!items[i].name.equals("Aged Brie")) {
//                    if (!items[i].name.equals("Backstage Pass")) {
//                        if (items[i].quality > 0) {
//                            if (!items[i].name.equals("Gold Coin")) {
//                                items[i].quality = items[i].quality - 1;
//                            }
//                        }
//                        //sets backstage pass value to 0 if sellIn = 0
//                    } else {
//                        items[i].quality = items[i].quality - items[i].quality;
//                    }
//                    //validating not at max quality
//                } else {
//                    if (items[i].quality < 50) {
//                        items[i].quality = items[i].quality + 1;
//                    }
//                }
//            }
//        }
    }
}