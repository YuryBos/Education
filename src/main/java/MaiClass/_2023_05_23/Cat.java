package MaiClass._2023_05_23;

import java.util.Objects;

public class Cat implements Comparable<Cat> {

    private int age;
    private String color;
    private double weight;

    public Cat(int age, String color, double weight) {
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) { // не сравнивается ли объект сам с собой
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (!this.getClass().equals(obj.getClass())){ // проверка, что обекты находятся в одном классе
//            return false;
//        }
//
//        Cat cat = (Cat) obj; // приведение объекта к нужному классу
//
//        // равны ли все характеристики объекта
//        return this.age == cat.age && this.color.equals(cat.color) && Double.compare(this.weight, cat.weight) ==0; // c double сравниваем так из-за возможного неверного округления при прямом сравнении
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Double.compare(cat.weight, weight) == 0 && color.equals(cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, color, weight);
    }

    @Override
    public int compareTo(Cat o) {
        return Double.compare(this.getWeight(), o.getWeight());
    }

    @Override
    public String toString() {
        return String.format("Cat: age - %d, color - %s, weight - %.2f", age, color, weight);
    }
}
