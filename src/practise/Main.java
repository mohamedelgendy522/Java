package practise;

import java.util.Scanner;

public class Main {
    static int add(int a , int b){
        return a + b;
    }
    static double add(double a , double b){
        return a + b;
    }
    static float add(float a,float b){
        return a + b;
    }






    static boolean isEven(int a){
        return a % 2 == 0;
    }

    static boolean isPrime(int a){
        if (a <= 1)
            return false;

        for (int i = 2 ; i < a ; i++){
            if(a % i == 0)
                return false;
        }
        return true;
    }

    static long factorial(int a){
        int counter = 1 ;
        for (int i = 2 ; i <= a ;i++){
            counter = counter * i;
        }
        return counter;
    }


    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                if(arr[i][j] % 2 ==0){
                    System.out.println(arr[i][j]);
                }
            }
        }
      }
}
