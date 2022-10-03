package training.weirdshop;

//parent class
public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public boolean premium;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.premium = this.name.contains("Premium");

    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }


    public void increaseQuality() {
        int multiplier = this.premium ? 2 : 1;
        for (int i = 1; i <= multiplier; i++){
            if (this.quality < 50) {
                ++this.quality;
            }
        }
    }
    public void decreaseQuality() {
        int multiplier = this.premium ? 2 : 1;
        for (int i = 1; i <= multiplier; i++) {
            if (this.quality > 0) {
                --this.quality;
            }
        }
    }






}

