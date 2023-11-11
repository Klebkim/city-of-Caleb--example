package VendingMachine;

public class Drink {
    private String drinkname;
    private int drinkquantity;
    private double drinkprice;
    public String getName() {
        return drinkname;
    }

    public void setName(String name) {
        this.drinkname = name;
    }

    public int getQuantity() {
        return drinkquantity;
    }

    public void setQuantity(int quantity) {
        this.drinkquantity = quantity;
    }

    public double getPrice() {
        return drinkprice;
    }

    public void setPrice(double price) {
        this.drinkprice = price;
    }



}
