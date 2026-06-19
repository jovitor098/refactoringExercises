package exercise2;

public class MaterialItem extends JobItem {

    private int unitPrice;

    public MaterialItem(int quantity, int unitPrice) {
        super(quantity);
        this.unitPrice = unitPrice;
    }

    @Override
    protected int getUnitPrice() {
        return unitPrice;
    }
}
