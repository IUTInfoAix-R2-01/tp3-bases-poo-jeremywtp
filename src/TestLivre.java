public class TestLivre {
    public static void main(String[] args) {
        Livre livre1 = new Livre("Kirikou et la Sorcière", 5.9f, 50);

        System.out.println("Informations du livre :");
        System.out.println(livre1);
        
        livre1.setQuantity(100);
        System.out.println("\nQuantité mise à jour :");
        System.out.println(livre1);
        
        System.out.println("\nDétails du livre :");
        System.out.println("Nom du livre : " + livre1.getName());
        System.out.println("Prix du livre : " + livre1.getPrice() + "€");
        System.out.println("Quantité disponible : " + livre1.getQuantity());
    }
}


