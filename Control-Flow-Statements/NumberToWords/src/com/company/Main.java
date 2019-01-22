package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));
//        System.out.println(reverse(-121));
//        System.out.println(reverse(1212));
//        System.out.println(reverse(1234));
//        System.out.println(reverse(100));
//        numberToWords(123);
//        numberToWords(1010);
//        System.out.println("break");
//        numberToWords(100);
//        System.out.println("break");
//        numberToWords(1000);
//        System.out.println("break");
//        numberToWords(10);
//        System.out.println("break");
//        numberToWords(12345);
//        numberToWords(-12);
    }

    public static int reverse(int number) {

        int reverse=0;
        int lastDigit =0;
        int original = number;
        // make given negative positive to pass condition
        if(number < 0) {
            number *= -1;
        }
        while(number > 0) {
            lastDigit = number % 10;
            // move lastDigit up one place
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        // if number was negative change reverse to negative
        if(original < 0) {
            reverse*=-1;
        }
        return reverse;
    }

    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        } else {
            int lastDigit = 0;
            int reverse = reverse(number);
            int zeroes = reverse; // store value of number after zeroes are dropped

            while(reverse > 0) {
                lastDigit = reverse % 10;

                switch (lastDigit) {

                    case 1: {
                        System.out.println("One");
                        break;
                    }
                    case 2: {
                        System.out.println("Two");
                        break;
                    }
                    case 3: {
                        System.out.println("Three");
                        break;
                    }
                    case 4: {
                        System.out.println("Four");
                        break;
                    }
                    case 5: {
                        System.out.println("Five");
                        break;
                    }
                    case 6: {
                        System.out.println("Six");
                        break;
                    }
                    case 7: {
                        System.out.println("Seven");
                        break;
                    }
                    case 8: {
                        System.out.println("Eight");
                        break;
                    }
                    case 9: {
                        System.out.println("Nine");
                        break;
                    }
                    default: {
                        System.out.println("Zero");
                        break;
                    }
                }
                reverse /= 10;
            }

            // loop to add dropped zeroes
            for(int i=getDigitCount(zeroes); i < getDigitCount(number); i++) {
                System.out.println("Zero");
            }
        }
    }

    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        } else {

            int count =0;
            if(number == 0) {
                count = 1;
            } else {
                while (number > 0) {
                    // removes one digit each iteration
                    number = number / 10;
                    count++;
                }
            }
            return count;
        }
    }
}
