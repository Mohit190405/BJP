public class StringOperations {
    public static void main(String[] args) {
        // Declare and initialize two strings
        String str1 = "Hello";
        String str2 = "World";

        // Concatenate the two strings
        String concatenatedString = str1 + " " + str2;
        System.out.println("Concatenated String: " + concatenatedString);

        // Find the length of the concatenated string
        int length = concatenatedString.length();
        System.out.println("Length of the Concatenated String: " + length);

        // Convert the concatenated string to uppercase
        String upperCaseString = concatenatedString.toUpperCase();
        System.out.println("Uppercase String: " + upperCaseString);
    }
}