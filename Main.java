import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\t************************************************");
        System.out.println("\t              WELCOME TO JAVA DRINKS            ");
        System.out.println("\t************************************************");

        Item[][] items = new Item[][] {
                { new Item("Pepsi", 1.99, 3), new Item("Fresca", 1.49, 3), new Item("Brisk", 1.00, 3) },
                { new Item("Fanta", 1.99, 2), new Item("Tea", 1.49, 2), new Item("Miranda", 1.00, 2) },
                { new Item("Crush", 1.99, 2), new Item("Coffee", 1.49, 2), new Item("Berry", 1.00, 2) }
        };
        Machine machine = new Machine(items);
        System.out.println(machine);
        while (true) {
            System.out.print("Pick a row: ");
            int row = scan.nextInt();

            System.out.print("Pick a spot in the row: ");
            int spot = scan.nextInt();

            boolean dispensed = machine.despense(row, spot);
            System.out.println("\n" + machine);
            if (dispensed == true) {

                System.out.print("\nEnjoy your drink! Press 1 to purchase another: ");
            } else {
                System.out.println("\nSorry, we're out of this item. Press 1 to purchase another: ");
            }
            if (scan.nextInt() != 1) {
                break;
            }
        }
        scan.close();
    }
}