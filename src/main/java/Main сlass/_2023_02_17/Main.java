package _2023_02_17;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.method();
        b.method();
        c.method();

        A r; // Объявление ссылки на объект типа A

        r = a; // r ссылается на объект типа A

        r.method(); // вызов метода method() объекта, на который ссылается r

        r = b ; // r ссылается на объект типа B

        r.method(); // вызов метода method() объекта, на который ссылается r

        r = c; // r ссылается на объект типа C

        r.method(); // вызов метода method() объекта, на который ссылается r

        D d = new D();

//        r = d; // ошибка. Нельзя присвоить ссылке на объект типа A ссылку на объект типа D Нет наследования


        demo(a);
        demo(b);
        demo(c);

        int[] array = {1, 2, 3, 4, 5};
        // C[] array2 = {a, b, c}; // ошибка. Нельзя присвоить ссылке на массив типа C ссылку на массив типа A Нет наследования
        A[] array3 = {a, b, c};
        for (int i = 0; i < array3.length; i++) {
            array3[i].method();
        }
    }


    private static void demo(A a) {
        a.method();
    }
}
