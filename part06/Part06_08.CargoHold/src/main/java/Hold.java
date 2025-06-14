import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = 0;
        for (Suitcase currentSuitcase : suitcases) {
            totalWeight += currentSuitcase.totalWeight();
        }
        if ((totalWeight + suitcase.totalWeight()) <= maxWeight) {
            suitcases.add(suitcase);
        }
    }

    public String toString() {
        int totalWeight = 0;
        int count = 0;
        for (Suitcase currentSuitcase : suitcases) {
            totalWeight += currentSuitcase.totalWeight();
            count++;
        }
        return count + " suitcases (" + totalWeight + " kg)";
    }

    public void printItems() {
        System.out.println("The suitcases in the hold contain the following items:");
        for (Suitcase currentSuitcase : suitcases) {
            currentSuitcase.printItems();
        }
    }
}
