public class FurnitureItem implements Funiture {
    private final String type;

    public FurnitureItem(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void accept(ShippingCostCalculator visitor) {
        visitor.visit(this);
    }
}
