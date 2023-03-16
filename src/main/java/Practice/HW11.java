package Practice;

import java.util.*;


public class HW11 {
    static Random r = new Random();

    public static void main(String[] args) {


        String s = "abcdefghijklmnopqrstuvwxyz"; // создаем строку из букв англ алфавита

        ArrayList<String> list = new ArrayList<>(1000); // создаем список из 1000 слов длинной 5 символов

        ArrayList<String> list1 = getWords(list, s);

        for (int i = 0; i < list1.size(); i++) {
            String a = list1.get(i);
            if (isPalindrome(a))
                System.out.println(" Is Palindrome " + a); // проверяем является ли слово палиндромом
            //else
               // System.out.println(" No Palindrome " + a); // если нет, то выводим сообщение
        }
    }


    public static boolean isPalindrome(String a) {

        List<Character> characters = new LinkedList<>(); // создаем список из символов строки a
        for (char c : a.toCharArray()) { // заполняем список символами из строки a
            characters.add(c); // добавляем символы в список
        }
        int start = 0; // индекс первого элемента
        int end = characters.size() - 1; // индекс последнего элемента
        while (start < end) { // пока индекс первого элемента меньше индекса последнего элемента
            if (characters.get(start) != characters.get(end)) { // если символы не равны
                return false; // возвращаем false
            }
            start++; // увеличиваем индекс первого элемента
            end--; // уменьшаем индекс последнего элемента
        }
        return true; // возвращаем true, если все элементы совпадают

    }


    public static ArrayList<String> getWords(ArrayList<String> List, String s) { // метод для заполнения списка словами длинной 5 символов из строки s
        for (int i = 0; i < 1000; i++) {
            List.add(randomChar(s));
        }
        return List;
    }

    public static String randomChar(String s) {
        char[] word = new char[5]; // создаем массив из 5 символов
        String c = null; // создаем строку для записи массива
        for (int i = 0; i < 5; i++) {
            word[i] = s.charAt(r.nextInt(s.length())); // записываем в массив случайные символы из строки s длинной 5 символов
        }
        c = String.valueOf(word).toUpperCase(); // преобразуем массив в строку и записываем в переменную c в верхнем регистре
        return c;
    }
}
