import java.util.ArrayList;

public abstract class Flower {
    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;
    private double neededAreaCounter;

    public Flower(String name, double price, double neededArea, double chanceOfGrowth) {
        this.name = name;
        this.price = price;
        this.neededArea = neededArea;
        this.chanceOfGrowth = chanceOfGrowth;
    }

    public void zasaditRostlinu(ArrayList<Flower> zahrada, Flower fl) {
        if (neededAreaCounter + fl.neededArea < 100){
            zahrada.add(fl);
            neededAreaCounter += fl.neededAreaCounter;
        }
    }

    public void vztrhnoutRostlinu(ArrayList<Flower> fl, int index) {
        fl.remove(fl.get(index));
        neededAreaCounter -= fl.get(index).neededArea;
    }

    public void zalevani(ArrayList<Flower> fl, int index) {
        fl.get(index).setChanceOfGrowth(fl.get(index).getChanceOfGrowth()*0.5);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getNeededArea() {
        return neededArea;
    }

    public void setNeededArea(double neededArea) {
        this.neededArea = neededArea;
    }

    public double getChanceOfGrowth() {
        return chanceOfGrowth;
    }

    public void setChanceOfGrowth(double chanceOfGrowth) {
        this.chanceOfGrowth = chanceOfGrowth;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }

}
