package com.javamultiplex.principle.kiss;

/**
 * @author Rohit Agarwal on 22/08/20 1:41 pm
 * @copyright www.javamultiplex.com
 */
//Check whether given input is number or not.
public class Example3 {
    public boolean isNumber1(final String input) {
        int length = input.length();
        char ch = '\u0000';
        boolean result = true;
        for (int i = 0; i < length; i++) {
            ch = input.charAt(i);
            if (!Character.isDigit(ch)) {
                result = false;
                break;
            }
        }
        return result;
    }

    public boolean isNumber2(final String input) {
        boolean result = true;
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException exception) {
            System.out.format("Input %s is not a number", input);
            result = false;
        }
        return result;
    }

    public boolean isNumber3(final String input) {
        return input.matches("^\\d+$");
    }
}
