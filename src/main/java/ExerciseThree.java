public class ExerciseThree {
    public static void main(String[] args) {
            // Item 1: Apples
            String item1Name = "Apple";
            int item1Qty = 2;
            double item1Price = 15.00;
git
            // Item 2: Milk
            String item2Name = "Milk";
            int item2Qty = 1;
            double item2Price = 22.50;

            // Item 3: Bread
            String item3Name = "Bread";
            int item3Qty = 3;
            double item3Price = 18.00;

            // Calculate individual totals
            double item1Total = item1Qty * item1Price;
            double item2Total = item2Qty * item2Price;
            double item3Total = item3Qty * item3Price;
// Calculate grand total
        double grandTotal = item1Total + item2Total + item3Total;

        // Print the formatted receipt
        System.out.println("==============================");
        System.out.printf("%18s%n", "Receipt");
        System.out.println("==============================");

        // %-12s = string left-aligned (12 spaces)
        // %d    = integer (quantity)
        // %.2f  = double formatted to 2 decimal places
        System.out.printf("%-12s %d x %5.2f = %5.2f SEK%n", item1Name, item1Qty, item1Price, item1Total);
        System.out.printf("%-12s %d x %5.2f = %5.2f SEK%n", item2Name, item2Qty, item2Price, item2Total);
        System.out.printf("%-12s %d x %5.2f = %5.2f SEK%n", item3Name, item3Qty, item3Price, item3Total);

        System.out.println("------------------------------");
        System.out.printf("Grand Total:           %6.2f SEK%n", grandTotal);
        System.out.println("==============================");
    }
        }
