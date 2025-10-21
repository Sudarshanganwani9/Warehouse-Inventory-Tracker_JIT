import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private Map<String, Product> inventory;
    private AlertService alertService;

    public Warehouse(AlertService alertService) {
        this.inventory = new HashMap<>();
        this.alertService = alertService;
    }

    public void addProduct(String id, String name, int quantity, int threshold) {
        if (inventory.containsKey(id)) {
            System.out.println("❌ Product ID already exists.");
        } else {
            Product p = new Product(id, name, quantity, threshold);
            inventory.put(id, p);
            System.out.println("✅ Added product: " + p);
        }
    }

    public void receiveShipment(String id, int quantity) {
        Product p = inventory.get(id);
        if (p != null) {
            p.increaseStock(quantity);
            System.out.println("📦 Shipment received: " + quantity + " units added for " + p.getName());
        } else {
            System.out.println("❌ Invalid Product ID!");
        }
    }

    public void fulfillOrder(String id, int quantity) {
        Product p = inventory.get(id);
        if (p != null) {
            if (quantity > p.getQuantity()) {
                System.out.println("❌ Not enough stock to fulfill order for " + p.getName());
                return;
            }
            p.decreaseStock(quantity);
            System.out.println("🛒 Fulfilled order: " + quantity + " units of " + p.getName());
            if (p.needsRestock()) {
                alertService.onLowStock(p);
            }
        } else {
            System.out.println("❌ Invalid Product ID!");
        }
    }

    public void listProducts() {
        System.out.println("\n📦 Current Inventory:");
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
}
