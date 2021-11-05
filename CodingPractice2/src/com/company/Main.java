package com.company;

public class Main {

    public static void main(String[] args) {

    }

    //코딩 연습 2
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes<0) {
            System.out.println("Invalid Value");
        } else {
            int mb = kiloBytes/1024;
            int kb = kiloBytes%1024;

            System.out.println(kiloBytes+" KB = "+mb+" MB and "+kb+" KB");
        }
    }

    //코딩 연습 3
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay<0 || hourOfDay>23){
            return false;
        }
        if (barking) {
            if (hourOfDay < 8 || hourOfDay > 22) {
                return true;
            }
        }
        return false;
    }

    //코딩 연습 4
    public static boolean isLeapYear(int year){
        if (year>=1 && year<=9999){
            if (year%4 == 0){
                if (year%100==0){
                    if (year%400==0){
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    //코딩 연습 5
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        int tempA = (int) (a*1000);
        int tempB = (int) (b*1000);
        if ((float)tempA/1000 == (float)tempB/1000) {
            return true;
        }
        return false;
    }

    //코딩 연습  6
    public static boolean hasEqualSum(int a, int b, int c){
        if ((a+b)==c){
            return true;
        }
        return false;
    }

    //코딩 연습 7
    public static boolean hasTeen(int a, int b, int c){
        if ((a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19)){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int a){
        if(a>=13 && a<=19){
            return true;
        }
        return false;
    }

}
