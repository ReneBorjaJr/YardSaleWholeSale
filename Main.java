package experiment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        yardSaleWholeSale("Rice", 5.0, 20);
    }

    public static void yardSaleWholeSale(String productName, double price, int quantity){
        double total = price * quantity;

        System.out.println("==========================================");
        System.out.printf("%s %6s %10s %10s", "Name", "Qty", "Price", "Total\n");
        System.out.printf("%s %6s %10s %12s", "----", "---", "-----", "-------\n");
        System.out.printf("%s\t%d\t\t $%.1f\t   $%.2f\n", productName, quantity, price, total);

        System.out.println("\n\tThank you. Come again!!!\n");
        System.out.println("Purchased on: " + LocalDate.now().format(DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy")));
        System.out.println("==========================================");
    }
}
