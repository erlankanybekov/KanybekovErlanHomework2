package com.company;

public class Main {

    public static void main(String[] args) {
        int random = generateRandomAge(0,107);
        System.out.println("Случайный возраст: "+random);
    }
    public static  int generateRandomAge(int dia1, int dia2){
        int randAge = dia1 + (int) (Math.random() * dia2);
        return randAge;
    }

}



