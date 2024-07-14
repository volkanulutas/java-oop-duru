package com.durutiryaki.week5.datastructure_arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int [] numberArray = new int[4];
        numberArray[0] = 0;
        numberArray[1] = 1;
        numberArray[2] = 2;
        numberArray[3] = 3;
        // numberArray[1] = 5;
        // int besinciSayi = numberArray[1]; .length
        for (int num: numberArray){
            System.out.print(num + ", ");
        }
        System.out.println("");
        for (int i=0; i<numberArray.length; i++){
            System.out.print(numberArray[i] + ", ");
        }
        System.out.println("--- Arraylist");
        // ArrayList
        ArrayList<Integer> numberList = new ArrayList<>();
        // note that: Best practise: List<Integer> numberList2 = new ArrayList<>();
        numberList.add(0);
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        // System.out.println(numberList.get(1));
        for (Integer num: numberList){
            System.out.print(num + ", ");
        }
        System.out.println("");
        for (int i=0; i<numberList.size(); i++){
            System.out.print(numberList.get(i) + ", ");
        }
        System.out.println("-----");
        System.out.println(numberList.get(1));
        System.out.println(numberArray[1]);

        // Map -> HashMap
    }
}
