package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 0;
        for (int i=0; i < 10; i++) {
            x++;
            System.out.println(x);
        }
        String[] fruits = {"Apple", "Mango", "Grapes"};
        for (int y=0; y < fruits.length; y++) {
            System.out.println(fruits[y]);
        }
        //OR
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
