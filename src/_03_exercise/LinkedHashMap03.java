package _03_exercise;

import java.util.LinkedHashMap;

public class LinkedHashMap03 {

    static LinkedHashMap<String, String> contact;

    public static void main(String[] args) {
       getLinkedHashMap();
        showResult();
        Change();
        showResult();
    }

    private static void getLinkedHashMap(){
        contact = new LinkedHashMap<>();
        contact.put("Андрей","andrey0765@gmail.com");
        contact.put("Илья","ilya4950@gmail.com");
        contact.put("Антон","anton4367@gmail.com");
        contact.put("Кирилл","kiril4971@gmail.com");
    }

    private static void showResult(){
        System.out.println("---------------");
        contact.forEach((key, value) -> System.out.println(key + " " + value));
    }

    private static void Change (){
        contact.replace("Илья","iillyaleon@gmail.com");
    }
}
