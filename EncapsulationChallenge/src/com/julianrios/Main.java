package com.julianrios;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);


        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.print(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count = " + printer.getPagesPrinted());
        pagesPrinted = printer.print(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count = " + printer.getPagesPrinted());
//
//        printer.fillToner(100);
    }
}
