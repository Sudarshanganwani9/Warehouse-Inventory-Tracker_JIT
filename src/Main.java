import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AlertService alertService = new StockAlertService();
        Warehouse warehouse = new Warehouse(alertService);

        System.out.println("===== 🏭 Warehouse Inventory Tracker =====");

        boolean running = true;
        while (running) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Product");
            System.out.println("2. Receive Shipment (Increase Stock)");
            System.out.println("3. Fulfill Order (Decrease Stock)");
            System.out.println("4. View Inventory");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Initial Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Enter Reorder Threshold: ");
                    int threshold = sc.nextInt();
                    warehouse.addProduct(id, name, qty, threshold);
                    break;

                case 2:
                    System.out.print("Enter Product ID: ");
                    String sid = sc.nextLine();
                    System.out.print("Enter Shipment Quantity: ");
                    int addQty = sc.nextInt();
                    warehouse.receiveShipment(sid, addQty);
                    break;

                case 3:
                    System.out.print("Enter Product ID: ");
                    String fid = sc.nextLine();
                    System.out.print("Enter Order Quantity: ");
                    int orderQty = sc.nextInt();
                    warehouse.fulfillOrder(fid, orderQty);
                    break;

                case 4:
                    warehouse.listProducts();
                    break;

                case 5:
                    running = false;
                    System.out.println("👋 Exiting Warehouse Tracker. Goodbye!");
                    break;

                default:
                    System.out.println("❌ Invalid choice! Try again.");
            }
        }
        sc.close();
    }
}
