import java.util.*;

public class FurnitureShipping implements ShippingCostCalculator {
    private static final Map<String, Double> shippingRates = new HashMap<>();

    static {
        shippingRates.put("Chair", 10.0);  // Flat rate for chairs
        shippingRates.put("Table", 25.0 * 0.5); // Weight-based rate for tables
        shippingRates.put("Sofa", 100.0 * 1.5 * 0.2); // Volume & distance-based rate for sofas
        shippingRates.put("Bed", 200.0 * 0.15); // Volume and size-based rate for beds
        shippingRates.put("Cabinet", 150.0 * 0.12); // Volume and material-based rate for cabinets
    }

    @Override
    public double visit(FurnitureItem item) {
        return shippingRates.getOrDefault(item.getType(), 0.0);
    }
}
