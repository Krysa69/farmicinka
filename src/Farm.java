import java.util.ArrayList;

public class Farm {
ArrayList<Flower> zahrada = new ArrayList<>(5);
    private double neededAreaCounter;

    public void zasaditRostlinu(Flower fl) {
        if (neededAreaCounter + fl.neededArea <= 100){
            zahrada.add(fl);
            neededAreaCounter += fl.getNeededArea();
        }else{
            System.out.println("Not enought space for planting a new flower");
        }
    }

    public void vztrhnoutRostlinu(int index) {
        zahrada.remove(zahrada.get(index));
        neededAreaCounter -= zahrada.get(index).neededArea;
    }

    public void zalevani(int index) {
        zahrada.get(index).setChanceOfGrowth(zahrada.get(index).getChanceOfGrowth()*0.5);
    }

}
