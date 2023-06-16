package MaiClass._2023_05_23;

public class PrimitiveComparing {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 5;

        boolean result = a == b;
        System.out.println("Результат сравнения  a и b: " + result);

        result = a == c;
        System.out.println("Результат сравнения  a и c: " + result);

        Integer i = 5;
        result = a == i;
        System.out.println("Результат сравнения  int и Integer: " + result);

        Integer i1 = 5;
        result = i1 == i;
        System.out.println("Результат сравнения 2-х Integer: " + result);

        String s1 = "Hello";
        String s2 = "Hello"; // ссылка на тот же объект (Java не создает новый объект для экономии памяти)
        String s3 = new String("Hello"); //новый, другой объект


        result = s1 == s2;
        System.out.println("Результат сравнения s1 s2: " + result);
        result = s1 == s3;
        System.out.println("Результат сравнения s1 s3: " + result);

    }
}
