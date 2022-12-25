package _02_exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap02 {

    static Map<String, Integer> flower;

    public static void main(String[] args) {
        getMap();
        showResult(doInput());
    }

    private static void getMap() {
        flower = new HashMap<>();
        flower.put("Розы", 2);
        flower.put("Ромашки", 3);
        flower.put("Гвоздики", 4);
    }

    private static String doInput() {
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название цветов: ");
        input = scanner.nextLine().trim();
        scanner.close();
        return input;
    }

    private static void showResult(String name) {

        boolean hasContain = flower.containsKey(name);

        if (hasContain) {
            Integer number = flower.get(name);
            System.out.println(name + " " + number);
        } else
            System.out.println(name + " not found!");
    }
}
