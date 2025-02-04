public class Livre {
    private String name;
    private float price;
    private int quantity;

    public Livre(String name, float price, int quantity) {
        this.name = name;
        this.price = price;       
        this.quantity = quantity;       
    }
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int qty) {
        this.quantity = qty;
    }
    public String toString() {
        return "Nom : " + name + ", Prix : " + price + "€, Quantité : " + quantity;
    }
}

