public class TestEmployee {
    public static void main(String[] args) {
    	
        Employee e1 = new Employee(8, "Jeremy", "LeGoat", 5000);
        System.out.println(e1); 

        e1.setSalary(5000);
        System.out.println(e1); 
        System.out.println("l'id est: " + e1.getId());
        System.out.println("le prenom est: " + e1.getFirstName());
        System.out.println("le nom est: " + e1.getLastName());
        System.out.println("le salaire est: " + e1.getSalary() + "€");

        System.out.println("le salaire annuel est: " + e1.getAnnualSalary() + "€");
        System.out.println("le nouveau salaire après augmentation est: " + e1.raiseSalary(10) + "€");
        System.out.println(e1);
    }
}
