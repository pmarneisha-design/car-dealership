import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    // creates empty list so new dealership starts with an empty inventory
    private List<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
    this.name = name;
    this.address = address;
    this.phone = phone;
    this.inventory = new ArrayList<>();
}
// getter method allows code outside the class to read
    public String getName() {
        return name;
    }
// setter method allows you to replace
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Vehicle> getInventory() {
        return inventory;
    }

    public void setInventory(List<Vehicle> inventory) {
        this.inventory = inventory;
    }
}