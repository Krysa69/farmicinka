import java.util.ArrayList;

public class Farm {
    ArrayList<Flower> zahrada = new ArrayList<>(5);
    ArrayList<Animal> stodola = new ArrayList<>();
    private int usedBIGS = 0;
    private int usedSMALLS = 0;
    private double neededAreaCounter;
    private double bankovniUcet = 500;

    public void koupeniZvirete(Animal animal) {
        if (animal.getSize() == Size.BIG && usedBIGS <= 10) {
            stodola.add(animal);
            usedBIGS++;
            bankovniUcet -= animal.getValue();
        } else if (animal.getSize() == Size.SMALL && usedSMALLS <= 10) {
            stodola.add(animal);
            usedSMALLS++;
            bankovniUcet -= animal.getValue();
        } else {
            System.out.println("Stodola je plná");
        }
    }

    public void prodaniZvirete(int index) {
        if (stodola.get(index).getSize() == Size.BIG) {
            stodola.remove(index);
            usedBIGS--;
            bankovniUcet += stodola.get(index).getValue();
        } else if (stodola.get(index).getSize() == Size.SMALL) {
            stodola.remove(index);
            usedSMALLS--;
            bankovniUcet += stodola.get(index).getValue();
        } else {
            System.out.println("Index nenalezen");
        }
    }

    public void pohladitZvire(int index) {
        System.out.println(stodola.get(index).getName() + ": :):):)");
    }

    public void vypis() {
        System.out.println(zahrada);
    }

    public void zasaditRostlinu(Flower fl) {
        if (neededAreaCounter + fl.neededArea <= 100) {
            zahrada.add(fl);
            neededAreaCounter += fl.getNeededArea();
        } else {
            System.out.println("Not enought space for planting a new flower");
        }
    }

    public void vztrhnoutRostlinu(int index) {
        zahrada.remove(zahrada.get(index));
        neededAreaCounter -= zahrada.get(index).neededArea;
    }

    public void zalevani(int index) {
        zahrada.get(index).setChanceOfGrowth(zahrada.get(index).getChanceOfGrowth() * 1.5);
        if (zahrada.get(index).getChanceOfGrowth() > 100) {
            zahrada.get(index).setChanceOfGrowth(100);
        }
    }

    @Override
    public String toString() {
        return "Farm{" +
                "zahrada=" + zahrada +
                ", neededAreaCounter=" + neededAreaCounter +
                '}';
    }
}
