import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        int currentWeight = this.totalWeight();
        if ((currentWeight + item.getWeight()) <= maxWeight) {
            items.add(item);
        }
    }

    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        if (items.size() == 1) {
            return "1 item (" + this.items.get(0).getWeight() + " kg)";
        }
        int count = 0;
        int totalWeight = 0;
        for (Item currentItem : items) {
            totalWeight += currentItem.getWeight();
            count++;
        }
        return count + " items (" + totalWeight + " kg)";
    }

    public void printItems() {
        System.out.println("The suitcase contains the following items:");
        for (Item currentItem : items) {
            System.out.println(currentItem.toString());
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item currentItem : items) {
            totalWeight += currentItem.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item heaviestItem = items.get(0);
        for (Item currentItem : items) {
            if (currentItem.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = currentItem;
            }
        }
        return heaviestItem;
    }
}
