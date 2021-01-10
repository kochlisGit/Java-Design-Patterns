package behavioral.chainofresponsibility;

public abstract class ItemBuilder {
    private ItemBuilder nextBuilder;
    private final String itemType;
    private final double price;

    public ItemBuilder(String itemType, double price) {
        this.itemType = itemType;
        this.price = price;
    }

    public void setNextBuilder(ItemBuilder nextBuilder) {
        this.nextBuilder = nextBuilder;
    }

    public void build()
    {
        System.out.println("Building " + itemType + " with Cost: " + price);
        if (nextBuilder != null)
            nextBuilder.build();
    }
}
