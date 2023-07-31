package Algorithms._2023_06_25;

import java.util.Stack;
import java.lang.Integer;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int numberOfRings = 3;

        Stack<Integer> tower1 = new Stack<>();
        Stack<Integer> tower2 = new Stack<>();
        Stack<Integer> tower3 = new Stack<>();

        for (int i = numberOfRings; i > 0; i--)
            tower1.push(i);
        System.out.println(tower1);
    }
}
