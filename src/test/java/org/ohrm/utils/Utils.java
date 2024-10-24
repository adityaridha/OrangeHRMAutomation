package org.ohrm.utils;

public class Utils {
    public static int extractInteger(String input) {
        // Split the input string by space to isolate the numeric part
        String[] parts = input.split(" ");

        // Parse the first part as a double and then cast to an integer
        double value = Double.parseDouble(parts[0]);

        // Return the integer value by casting
        return (int) value;
    }
}
