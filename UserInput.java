/*Madison Stevens
9/12/17*/
package project1;

import java.util.Scanner;

public class UserInput {

    public static int getInt() {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        return i;
    }

    public static char getChar() {
        Scanner input = new Scanner(System.in);
        char c = input.next().charAt(0);
        return c;
    }

    public static double getDouble() {
        Scanner input = new Scanner(System.in);
        double d = input.nextDouble();
        return d;
    }

    public static String getString() {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        return s;
    }

    public static int getInt(int min, int max) {
        int i = getInt();
        while (true) {
            if (i >= min && i <= max) {
                break;
            } else {
                System.out.println("Invalid entry, try again");
                i = getInt();
            }
        }
        return i;
    }

    public static char getChar(char min, char max) {
        char c = getChar();
        while (true) {
            if (c >= min && c <= max) {
                break;
            } else {
                System.out.println("Invalid entry, try again please.");
                c = getChar();
            }
        }
        return c;
    }

    public static double getDouble(double min, double max) {
        double d = getDouble();
        while (true) {
            if (min >= 0 && max <= 1000) {
                break;
            } else {
                System.out.println("You have entered an invalid input, please try again.");
                d = getDouble();
            }
        }
        return d;
    }

    public static String getString(int min, int max) {
        String s = getString();
        int length = s.length();
        while (true) {
            if (length >= min && length <= max) {
                break;
            } else {
                System.out.println("Invalid entry, try again please.");
                s = getString();
            }
        }
        return s;
    }
}
