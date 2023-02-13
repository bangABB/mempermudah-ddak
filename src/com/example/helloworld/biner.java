package com.example.helloworld;

import java.util.Objects;
import java.util.Scanner;

// Java program to demonstrate above steps of
// binary fractional to decimal conversion


class GFG {

    // Function to convert binary fractional to
// decimal
    static double binaryToDecimal(String binary,
                                  int len) {

        // Fetch the radix point
        int point = binary.indexOf('.');

        // Update point if not found
        if (point == -1)
            point = len;

        double intDecimal = 0,
                fracDecimal = 0,
                twos = 1;

        // Convert integral part of binary to decimal
        // equivalent
        for (int i = point - 1; i >= 0; i--) {
            intDecimal += (binary.charAt(i) - '0') * twos;
            twos *= 2;
        }

        // Convert fractional part of binary to
        // decimal equivalent
        twos = 2;
        for (int i = point + 1; i < len; i++) {
            fracDecimal += (binary.charAt(i) - '0') / twos;
            twos *= 2.0;
        }

        // Add both integral and fractional part
        return intDecimal + fracDecimal;
    }

    static double ternaryToDecimal(String binary,
                                   int len) {

        // Fetch the radix point
        int point = binary.indexOf('.');

        // Update point if not found
        if (point == -1)
            point = len;

        double intDecimal = 0,
                fracDecimal = 0,
                twos = 1;

        // Convert integral part of binary to decimal
        // equivalent
        for (int i = point - 1; i >= 0; i--) {
            intDecimal += (binary.charAt(i) - '0') * twos;
            twos *= 3;
        }

        // Convert fractional part of binary to
        // decimal equivalent
        twos = 3;
        for (int i = point + 1; i < len; i++) {
            fracDecimal += (binary.charAt(i) - '0') / twos;
            twos *= 3.0;
        }

        // Add both integral and fractional part
        return intDecimal + fracDecimal;
    }

    static double nonaryToDecimal(String binary,
                                   int len) {

        // Fetch the radix point
        int point = binary.indexOf('.');

        // Update point if not found
        if (point == -1)
            point = len;

        double intDecimal = 0,
                fracDecimal = 0,
                twos = 1;

        // Convert integral part of binary to decimal
        // equivalent
        for (int i = point - 1; i >= 0; i--) {
            intDecimal += (binary.charAt(i) - '0') * twos;
            twos *= 9;
        }

        // Convert fractional part of binary to
        // decimal equivalent
        twos = 9;
        for (int i = point + 1; i < len; i++) {
            fracDecimal += (binary.charAt(i) - '0') / twos;
            twos *= 9.0;
        }

        // Add both integral and fractional part
        return intDecimal + fracDecimal;
    }

    static double hexaToDecimal(String binary,
                                  int len) {

        // Fetch the radix point
        int point = binary.indexOf('.');

        // Update point if not found
        if (point == -1)
            point = len;

        double intDecimal = 0,
                fracDecimal = 0,
                twos = 1;

        // Convert integral part of binary to decimal
        // equivalent
        for (int i = point - 1; i >= 0; i--) {
            intDecimal += (binary.charAt(i) - '0') * twos;
            twos *= 16;
        }

        // Convert fractional part of binary to
        // decimal equivalent
        twos = 16;
        for (int i = point + 1; i < len; i++) {
            fracDecimal += (binary.charAt(i) - '0') / twos;
            twos *= 16.0;
        }

        // Add both integral and fractional part
        return intDecimal + fracDecimal;
    }

    public static String Reverse(String str) {
        int len = str.length();
        String rev = "";

        for (int i = 0; i < len; i++) {
            rev = str.charAt(i) + rev;
        }
        return rev;
    }

    static String decimalToBinary(double num, int k_prec) {
        String binary = "";

        // Fetch the integral part of decimal number
        int Integral = (int) num;

        // Fetch the fractional part decimal number
        double fractional = num - Integral;

        // Conversion of integral part to
        // binary equivalent
        while (Integral > 0) {
            int rem = Integral % 2;

            // Append 0 in binary
            binary += ((char) (rem + '0'));

            Integral /= 2;
        }

        // Reverse string to get original binary
        // equivalent
        binary = Reverse(binary);

        // Append point before conversion of
        // fractional part
        binary += ('.');

        // Conversion of fractional part to
        // binary equivalent
        while (k_prec-- > 0) {
            // Find next bit in fraction
            fractional *= 2;
            int fract_bit = (int) fractional;

            if (fract_bit == 1) {
                fractional -= fract_bit;
                binary += (char) (1 + '0');
            } else {
                binary += (char) (0 + '0');
            }
        }

        return binary;
    }

    static String decimalToTernary(double num, int k_prec) {
        String binary = "";

        // Fetch the integral part of decimal number
        int Integral = (int) num;

        // Fetch the fractional part decimal number
        double fractional = num - Integral;

        // Conversion of integral part to
        // binary equivalent
        while (Integral > 0) {
            int rem = Integral % 3;

            // Append 0 in binary
            binary += ((char) (rem + '0'));

            Integral /= 3;
        }

        // Reverse string to get original binary
        // equivalent
        binary = Reverse(binary);

        // Append point before conversion of
        // fractional part
        binary += ('.');

        // Conversion of fractional part to
        // binary equivalent
        while (k_prec-- > 0) {
            // Find next bit in fraction
            fractional *= 3;
            int fract_bit = (int) fractional;

            if (fract_bit == 1) {
                fractional -= fract_bit;
                binary += (char) (1 + '0');
            } else {
                binary += (char) (0 + '0');
            }
        }

        return binary;
    }

    static String decimalToHexadecimal(double num, int k_prec) {
        String binary = "";

        // Fetch the integral part of decimal number
        int Integral = (int) num;

        // Fetch the fractional part decimal number
        double fractional = num - Integral;

        // Conversion of integral part to
        // binary equivalent
        while (Integral > 0) {
            int rem = Integral % 3;

            // Append 0 in binary
            binary += ((char) (rem + '0'));

            Integral /= 16;
        }

        // Reverse string to get original binary
        // equivalent
        binary = Reverse(binary);

        // Append point before conversion of
        // fractional part
        binary += ('.');

        // Conversion of fractional part to
        // binary equivalent
        while (k_prec-- > 0) {
            // Find next bit in fraction
            fractional *= 16;
            int fract_bit = (int) fractional;

            if (fract_bit == 1) {
                fractional -= fract_bit;
                binary += (char) (1 + '0');
            } else {
                binary += (char) (0 + '0');
            }
        }

        return binary;
    }

    static String decimalToNonary(double num, int k_prec) {
        String binary = "";

        // Fetch the integral part of decimal number
        int Integral = (int) num;

        // Fetch the fractional part decimal number
        double fractional = num - Integral;

        // Conversion of integral part to
        // binary equivalent
        while (Integral > 0) {
            int rem = Integral % 9;

            // Append 0 in binary
            binary += ((char) (rem + '0'));

            Integral /= 9;
        }

        // Reverse string to get original binary
        // equivalent
        binary = Reverse(binary);

        // Append point before conversion of
        // fractional part
        binary += ('.');

        // Conversion of fractional part to
        // binary equivalent
        while (k_prec-- > 0) {
            // Find next bit in fraction
            fractional *= 9;
            int fract_bit = (int) fractional;

            if (fract_bit == 1) {
                fractional -= fract_bit;
                binary += (char) (1 + '0');
            } else {
                binary += (char) (0 + '0');
            }
        }

        return binary;
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("masukan input (dtb,dtt,dtn,btd,ttd,ntd) : ");
            String choice = in.next();
            while (!Objects.equals(choice, "STOP")){
            switch (choice) {
                case "dtb": {
                    System.out.print("Masukkan string decimal ke binary : ");
                    double c = input.nextDouble();
                    System.out.println("masukkan berapa pembulatan : ");
                    int k = input.nextInt();
                    System.out.print(
                            decimalToBinary(c, k));
                    System.out.println(" ");
                    break;
                }

                case "btd": {
                    System.out.print("Masukan string binary to decimal : ");
                    String n = input.nextLine();
                    System.out.println(
                            binaryToDecimal(n, n.length()));
                    break;
                }

                case "ttd": {
                    System.out.print("Masukan string ternary to decimal : ");
                    String n = input.nextLine();
                    System.out.println(
                            ternaryToDecimal(n, n.length()));
                    break;
                }
                case "dtt": {
                    System.out.print("Masukkan string decimal ke ternary : ");
                    double c = input.nextDouble();
                    System.out.println("masukkan berapa pembulatan : ");
                    int k = input.nextInt();
                    System.out.print(
                            decimalToTernary(c, k));
                    System.out.println(" ");
                    break;
                }

                case "dtn": {
                    System.out.print("Masukkan string decimal ke nonary : ");
                    double c = input.nextDouble();
                    System.out.println("masukkan berapa pembulatan : ");
                    int k = input.nextInt();
                    System.out.print(
                            decimalToNonary(c, k));
                    System.out.println(" ");
                    break;
                }
                case "dth": {
                    System.out.print("Masukkan string decimal ke hexadecimal : ");
                    double c = input.nextDouble();
                    System.out.println("masukkan berapa pembulatan : ");
                    int k = input.nextInt();
                    System.out.print(
                            decimalToHexadecimal(c, k));
                    System.out.println(" ");
                    break;
                }

                case "ntd": {
                    System.out.print("Masukan string Nonary to decimal : ");
                    String n = input.nextLine();
                    System.out.println(
                            nonaryToDecimal(n, n.length()));
                    break;
                }

                case "htd": {
                    System.out.print("Masukan string Hexa to decimal : ");
                    String n = input.nextLine();
                    System.out.println(
                            hexaToDecimal(n, n.length()));
                    break;
                }

            }
            System.out.println("input (dtb,dtt,dtn,btd,ttd,ntd) : ");
            choice = in.next();
            }
        }
    }
}

// This code is contributed by dheeraj_2801

