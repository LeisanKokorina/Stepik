package org.stepik;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
        Scanner sc =new Scanner(System.in);
        while (true){
            int a = sc.nextInt();
            int bitCount = Integer.bitCount(Math.abs(a));//переводит число в двоичный код, выдает сколько единиц
            if(bitCount==1){
                System.out.println("заданное число является результатом возведения двойки в степень,");
                System.out.println(" так как в двоичном представлении единиц - " + bitCount);
            }else{
                System.out.println("Число не является результатом возведения двойки в степень");
                System.out.println("Введите другое число: ");
            }
        }
    }
}
