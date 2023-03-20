public class Customer{

    public String customerName;
    public String customerAddress;
    private int age;

    public Customer(String customerName, String customerAddress, int age) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.age = age;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
