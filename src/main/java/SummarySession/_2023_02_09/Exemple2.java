package SummarySession._2023_02_09;

public class Exemple2 {
public static void main(String[] args) {
}

class Fruit {
    public Fruit(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;

}
    private String name;
    private String color;
    private int weight;
}

class Apple extends Fruit {
    public Apple(String name, String color, int weight) {
        super(name, color, weight);
    }
}
}
