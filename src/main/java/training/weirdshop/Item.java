package training.weirdshop;

//parent class
public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }


    public void increaseQuality(){
        if (this.quality<50){
            ++this.quality;
        }
    }
    public void decreaseQuality(){
        if (this.quality>0){
            --this.quality;
        }
    }






}

