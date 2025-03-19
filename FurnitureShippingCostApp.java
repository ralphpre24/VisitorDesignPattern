public class FunitureShippingCostApp {
    public static void main(String[] args) {
        ShippingCostCalculator calculator = new FurnitureShipping();

        System.out.println("============================================");
        System.out.println(" Welcome to the Furniture Shipping Cost App");
        System.out.println("============================================\n");

        // Creating multiple furniture items dynamically
        FurnitureItem[] furnitureItems = {
            new FurnitureItem("Chair"),
            new FurnitureItem("Table"),
            new FurnitureItem("Sofa"),
            new FurnitureItem("Bed"),
            new FurnitureItem("Cabinet")
        };

        for (FurnitureItem item : furnitureItems) {
            double cost = calculator.visit(item);
            System.out.println("Shipping cost for " + item.getType() + ": $" + cost);
        }

        System.out.println();
        
    }
}
