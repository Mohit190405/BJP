public class Array {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {
                1,0,2,3,4,5,5,6,7,8,9
        };

        // Print the elements of the array
        System.out.println("Elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
