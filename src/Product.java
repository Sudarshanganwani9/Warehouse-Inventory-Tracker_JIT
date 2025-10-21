public class Product {
    private String id;
    private String name;
    private int quantity;
    private int reorderThreshold;

    public Product(String id, String name, int quantity, int reorderThreshold) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.reorderThreshold = reorderThreshold;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getReorderThreshold() {
        return reorderThreshold;
    }

    public void increaseStock(int amount) {
        if (amount > 0) {
            quantity += amount;
        }
    }

    public void decreaseStock(int amount) {
        if (amount > 0 && amount <= quantity) {
            quantity -= amount;
        } else {
            System.out.println("❌ Error: Insufficient stock for " + name);
        }
    }

    public boolean needsRestock() {
        return quantity <= reorderThreshold;
    }

    @Override
    public String toString() {
        return String.format("Product[ID=%s, Name=%s, Qty=%d, Threshold=%d]",
                id, name, quantity, reorderThreshold);
    }
}
