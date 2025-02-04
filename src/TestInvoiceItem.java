public class TestInvoiceItem {
    public static void main(String[] args) {

        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(inv1); 

        inv1.setQty(999);
        inv1.setUnitPrice(0.99);
        System.out.println(inv1);
        System.out.println("\nl'id est: " + inv1.getId());
        System.out.println("la description est: " + inv1.getDesc());
        System.out.println("la quantité est: " + inv1.getQty());
        System.out.println("le prix unitaire est: " + inv1.getUnitPrice());

        System.out.println("le total est: " + inv1.getTotal());
    }
}
