package exercise2;

public abstract class JobItem {

    private int quantity;

    public JobItem(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalPrice() {
        return quantity * getUnitPrice();
    }

    protected abstract int getUnitPrice();
}