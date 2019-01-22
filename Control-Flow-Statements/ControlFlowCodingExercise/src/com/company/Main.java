package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println(canPack(1,0,4));
//        System.out.println(canPack(1,0,5));
//        System.out.println(canPack(0,5,4));
//        System.out.println(canPack(2,2,12));
//        System.out.println(canPack(-3,2,12));
//        System.out.println(canPack(5,3,24));
//        System.out.println(canPack(2,1,5));
        System.out.println(canPack(1,1,4));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }

        bigCount *=5; // 5 kilos each
        int sum = bigCount + smallCount;
        boolean pack = false;

        while(sum >= goal) {
            if(sum % goal ==0) {
                sum %= goal; // changes value of sum to remaining to exit loop
                pack = true;
            }
            else if(smallCount > goal) {
                    sum %= goal; // changes value of sum to remaining to exit loop
                    pack = true;
            }
            else if(bigCount > goal) {
                sum %= goal; // changes value of sum to remaining to exit loop
                pack = true;
            }
            else {
                if(smallCount > (goal%bigCount)){
                    pack = true;
                } else {
                    pack = false;
                }
                sum%=goal; // changes value of sum to remaining to exit loop
            }
        }
        return pack;
    }
}
