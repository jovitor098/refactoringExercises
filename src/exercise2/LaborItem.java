package exercise2;

public class LaborItem extends JobItem {

    private Employee employee;

    public LaborItem(int quantity, Employee employee) {
        super(quantity);
        this.employee = employee;
    }

    @Override
    protected int getUnitPrice() {
        return employee.getRate();
    }

    public Employee getEmployee() {
        return employee;
    }
}