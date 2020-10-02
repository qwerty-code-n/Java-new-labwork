package com.company;

public class Primes {
    // Вывод простых чисел от 1 до 100 :
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++)
        { isPrime(i);}
    }

    public static boolean isPrime(int n)
    {
        for (int i = 2; i < n; i++)
        {
            if (n % i == 0) { return false; }
        }
        System.out.print(n + " "); return true;
    }
}

