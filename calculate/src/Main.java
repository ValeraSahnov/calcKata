

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static String finalOtvet = "";

    public static void main(String[] args) throws IOException {
        Scanner vvod = new Scanner(System.in);
        String input = vvod.nextLine();
        calc(input);
        System.out.println(finalOtvet);

    }

    public static String calc(String input) throws IOException {

        String example = input;
        int length = example.length();

        String a = "";
        String b = "";
        String otvetRom = "";
        char plus = '+';
        char minus = '-';
        char umn = '*';
        char del = '/';
        char znak = Character.MIN_VALUE;
        String[] rom = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] romOtvet = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV",
                "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII",
                "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII",
                "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII",
                "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII",
                "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV",
                "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        boolean one1 = false;
        boolean two1 = false;
        int aA = -1;
        int bB = -1;
        int otvet = 0;
        int nomer = 0;
        for (int i = 0; i < length; i++) {
            if (example.charAt(i) == plus) {
                znak = plus;
                nomer = i;
                break;
            } else if (example.charAt(i) == minus) {
                znak = minus;
                nomer = i;
                break;
            } else if (example.charAt(i) == del) {
                znak = del;
                nomer = i;
                break;
            } else if (example.charAt(i) == umn) {
                znak = umn;
                nomer = i;
                break;
            }
        }
        if (nomer == 0) {
            throw new IOException();
        }
        int doubleNomer = nomer + 1;

        for (int i = doubleNomer; i < length; i++) {
            if (example.charAt(i) == plus) {
                throw new IOException();
            } else if (example.charAt(i) == minus) {
                throw new IOException();
            } else if (example.charAt(i) == umn) {
                throw new IOException();
            } else if (example.charAt(i) == del) {
                throw new IOException();
            }
        }
        if ((nomer == 1) && (length == 3)) {
            char one = example.charAt(0);
            char two = example.charAt(2);
            a = "" + one;
            b = "" + two;
        } else if ((nomer == 2) && (length == 4)) {
            char oneone = example.charAt(0);
            char oneTwo = example.charAt(1);
            char two = example.charAt(3);
            a = "" + oneone + oneTwo;
            b = "" + two;
        } else if ((nomer == 1) && (length == 4)) {
            char one = example.charAt(0);
            char twoOne = example.charAt(2);
            char twoTwo = example.charAt(3);
            a = "" + one;
            b = "" + twoOne + twoTwo;
        } else if ((nomer == 2) && (length == 5)) {
            char one = example.charAt(0);
            char oneOne = example.charAt(1);
            char two = example.charAt(3);
            char twoTwo = example.charAt(4);
            a = "" + one + oneOne;
            b = "" + two + twoTwo;
        } else if ((nomer == 3) && (length == 5)) {
            char one = example.charAt(0);
            char oneOne = example.charAt(1);
            char oneTwo = example.charAt(2);
            char two = example.charAt(4);
            a = "" + one + oneOne + oneTwo;
            b = "" + two;
        } else if ((nomer == 3) && (length == 6)) {
            char one = example.charAt(0);
            char oneOne = example.charAt(1);
            char oneTwo = example.charAt(2);
            char two = example.charAt(4);
            char twoOne = example.charAt(5);
            a = "" + one + oneOne + oneTwo;
            b = "" + two + twoOne;
        } else if ((nomer == 3) && (length == 7)) {
            char one = example.charAt(0);
            char oneOne = example.charAt(1);
            char oneTwo = example.charAt(2);
            char two = example.charAt(4);
            char twoOne = example.charAt(5);
            char twoTwo = example.charAt(6);
            a = "" + one + oneOne + oneTwo;
            b = "" + two + twoOne + twoTwo;
        } else if ((nomer == 3) && (length == 8)) {
            char one =example.charAt(0);
            char oneOne = example.charAt(1);
            char oneTwo = example.charAt(2);
            char two = example.charAt(4);
            char twoOne = example.charAt(5);
            char twoTwo = example.charAt(6);
            char twoThree = example.charAt(7);
            a = "" + one + oneOne + oneTwo;
            b = "" + two + twoOne + twoTwo + twoThree;
        } else if ((nomer == 4) && (length == 6)) {
            char one = example.charAt(0);
            char oneOne = example.charAt(1);
            char oneTwo = example.charAt(2);
            char oneThree = example.charAt(3);
            char two = example.charAt(5);

            a = "" + one + oneOne + oneTwo + oneThree;
            b = "" + two;
        } else if ((nomer == 4) && (length == 7)) {
            char one = example.charAt(0);
            char oneOne = example.charAt(1);
            char oneTwo = example.charAt(2);
            char oneThree = example.charAt(3);
            char two = example.charAt(5);
            char twoOne = example.charAt(6);

            a = "" + one + oneOne + oneTwo + oneThree;
            b = "" + two + twoOne;
        } else if ((nomer == 4) && (length == 8)) {
            char one = example.charAt(0);
            char oneOne = example.charAt(1);
            char oneTwo = example.charAt(2);
            char oneThree = example.charAt(3);
            char two = example.charAt(5);
            char twoOne = example.charAt(6);
            char twoTwo = example.charAt(7);

            a = "" + one + oneOne + oneTwo + oneThree;
            b = "" + two + twoOne + twoTwo;
        } else if ((nomer == 4) && (length == 9)) {
            char one = example.charAt(0);
            char oneOne = example.charAt(1);
            char oneTwo = example.charAt(2);
            char oneThree = example.charAt(3);
            char two = example.charAt(5);
            char twoOne = example.charAt(6);
            char twoTwo = example.charAt(7);
            char twoThree = example.charAt(8);

            a = "" + one + oneOne + oneTwo + oneThree;
            b = "" + two + twoOne + twoTwo + twoThree;
        } else if ((nomer == 3) && (length == 8)) {
            char one = example.charAt(0);
            char oneOne = example.charAt(1);
            char oneTwo = example.charAt(2);

            char two = example.charAt(4);
            char twoOne = example.charAt(5);
            char twoTwo = example.charAt(6);
            char twoThree = example.charAt(7);

            a = "" + one + oneOne + oneTwo;
            b = "" + two + twoOne + twoTwo + twoThree;
        } else if ((nomer == 2) && (length == 7)) {
            char one = example.charAt(0);
            char oneOne = example.charAt(1);

            char two = example.charAt(3);
            char twoOne = example.charAt(4);
            char twoTwo = example.charAt(5);
            char twoThree = example.charAt(6);

            a = "" + one + oneOne;
            b = "" + two + twoOne + twoTwo + twoThree;
        } else if ((nomer == 1) && (length == 6)) {
            char one = example.charAt(0);

            char two = example.charAt(2);
            char twoOne = example.charAt(3);
            char twoTwo = example.charAt(4);
            char twoThree = example.charAt(5);

            a = "" + one;
            b = "" + two + twoOne + twoTwo + twoThree;
        }

        for (int i = 0; i < 10; i++)
            if (a.equals(rom[i])) {
                one1 = true;
                aA = i + 1;

            }
        for (int i = 0; i < 10; i++)
            if (b.equals(romOtvet[i])) {
                two1 = true;
                bB = i + 1;

            }
        if ((one1 == false) & (two1 == false)) {
            aA = Integer.parseInt(a);
            bB = Integer.parseInt(b);
        }
        switch (znak) {
            case '+':
                otvet = aA + bB;
                break;
            case '-':
                otvet = aA - bB;
                break;
            case '*':
                otvet = aA * bB;
                break;
            case '/':
                otvet = aA / bB;
                break;
        }
        if (aA < 0 || bB < 0) {
            throw new IOException();
        }
        if ((aA > 10) || (bB > 10)) {
            throw new IOException();
        }
        if (one1 && two1 & (otvet < 1)) {
            throw new IOException();
        } else if ((one1 && (two1 == false)) || ((one1 == false) && two1)) {
            throw new IOException();

        }


        if (one1 && two1) {
            finalOtvet = romOtvet[otvet - 1];

            return finalOtvet;

        } else {
            finalOtvet = Integer.toString(otvet);
            return finalOtvet;
        }


    }
}