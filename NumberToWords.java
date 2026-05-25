//42. Write a Java program to convert numbers into words.

import java.util.*;

public class NumberToWords {

    static String one[] = {"", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine"};

    static String two[] = {"", "ten", "twenty", "thirty", "forty",
            "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) {

        int n = 2917;

        int thousand = n / 1000;
        int hundred = (n % 1000) / 100;
        int ten = (n % 100) / 10;
        int unit = n % 10;

        System.out.println(one[thousand] + " thousand "
                + one[hundred] + " hundred "
                + two[ten] + " "
                + one[unit]);

        // two thousand nine hundred seventeen
    }
}