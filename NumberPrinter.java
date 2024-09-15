public class NumberPrinter {
    public static void main(String[] args) {
        // Using a for loop
        System.out.println("Printing numbers from 1 to 10 using a for loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Using a while loop
        System.out.println("\nPrinting numbers from 1 to 10 using a while loop:");
        int j = 1;
        while (j <= 10) {
            System.out.println(j);
            j++;
        }

        // Using a do-while loop
        System.out.println("\nPrinting numbers from 1 to 10 using a do-while loop:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 10);
    }
}