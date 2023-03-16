public class MethodExample {
    public static void main(String[] args) {

//        double diameter = 6;
//        CircleSquare square = new CircleSquare(diameter);
        // using .getResult method
//        System.out.println(square.getResult(6));


//        CircleSquareVoid squareVoid = new CircleSquareVoid(diameter);
//        squareVoid.getResult(6);

        Person p = new Person(
                "Bob",
                "Morley",
                "compliance dprt.",
                "backend engineer",
                100000,
                false,
                "+49555011111111",
                "+49555011111112312"
        );

        System.out.println(p.getPhone());
        System.out.println(p.getName());


    }
}
