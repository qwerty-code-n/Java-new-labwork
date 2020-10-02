package com.company;
import java.util.Scanner;

public class Palindrome {


    public static void main(String[] args)
    {
        Scanner vvod = new Scanner(System.in);
        String stroka = vvod.nextLine();
        System.out.println(Polindrome(stroka));
    }


    public static boolean Polindrome(String text)
    {
        String stroka = text.toUpperCase().replaceAll("[^A-Za-z]", "");
        /* toUpperCase - нужен для перевода всех символов в одинаковый, верхний регистр
         *  replaceAll  - принимает два параметра, 1 параметр отвечает за регулярное выражение, то есть шаблон для поиска строки в тексте. В
         *  В моем случае регулярным выражением являются только буквенные значения латинского языка, не зависимо от регистра.
         *  2 параметр необходим для присваивания нового значения тем символам в строке, которые не соответствуют требованиям параметра ReGex.
         */

        StringBuffer reversestroka = new StringBuffer(stroka).reverse();

        /* Класс StringBuffer я использую потому что он расширяет возможности для изменения последовательности символов.
         *  Метод у StringBuffer'a - reverse, мне нужен так как, надо получить перевернутую копию строки.
         */

        boolean answer = true;
        // В качестве результата программы будет выведен true или false.


        for (int i = 0; i< stroka.length(); i++) //Счетчик от 0 до конца длины строки.
        {
            if (stroka.charAt(i) != reversestroka.charAt(i)) //Проверка: Если в первой строке, символ под индексом i не ровняется символу с во второй строке выолнить:
            {                                                //Если условие выполнится хотя бы один раз. Тогда можно завершать выполнение программы.
                answer = false;
                break;
            }
        }
        return answer;
    }
}





