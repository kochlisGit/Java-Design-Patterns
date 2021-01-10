package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Computer
{
    private final List<Item> itemList;

    public Computer() {
        itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public double computePrice() {
        double priceSum = 0;

        for (Item item : itemList)
            priceSum += item.getPrice();

        return priceSum;
    }

    public void preview() {
        for (Item item: itemList)
            System.out.println( item.preview() );
    }
}
