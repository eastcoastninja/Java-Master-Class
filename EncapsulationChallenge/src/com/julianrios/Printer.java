package com.julianrios;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel >= 0 && tonerLevel < 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int print(int pages) {
        int pagesToPrint = pages;
        if(this.duplex) {
            pagesToPrint = (pages / 2) + (pages % 2); // prints double the pages (both sides)
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint; //  stores current number of pages printed + total number of pages printed
        return pagesToPrint; // current number of pages printed
    }

    public int fillToner(int toner) {
        if(this.tonerLevel == -1) {
            System.out.println("Error");
            return -1;
        } else {
            if (this.tonerLevel >= 0 && this.tonerLevel < 100) {
                // checks if tonerLevel is between 0 and 99
                this.tonerLevel += toner;
                if (this.tonerLevel > 100) {
                    toner = this.tonerLevel % 100; // remaining toner
                    this.tonerLevel = 100; // toner is set to full
                    System.out.println("Filling toner");
                } else {
                    toner = 0;
                }
            } else {
                System.out.println("Toner is full");
            }
            System.out.println("Remaining toner: " + toner + "%");
            System.out.println("Current toner level: " + tonerLevel + "%");
        }
        return toner;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
