package _01_exercise;

import java.util.HashMap;
import java.util.Map;

public class HashMap01 {

    static HashMap<String, Integer> hashMap;

    public static void main(String[] args) {
        getHashMap();
        replacement();
        addProduct();
        showResult();
    }

        private static void  getHashMap() {
            hashMap = new HashMap<>();
            hashMap.put("Банан",1000);
            hashMap.put("Мандарин",1001);
            hashMap.put("Огурец", 1002);
            System.out.println("\nНачальный перечень: " +hashMap);
        }

        private static void replacement(){
            hashMap.replace("Мандарин",1004);

            for (Map.Entry<String, Integer> hashMap1 : hashMap.entrySet()) {
                System.out.println(hashMap1.getKey() + " " + hashMap1.getValue());
            }
        }

        private static void showResult(){
            for (Map.Entry<String, Integer> hashMap1 : hashMap.entrySet()) {
                System.out.println(hashMap1.getKey() + " " + hashMap1.getValue());
            }
        }

        private static void addProduct(){
            hashMap.putIfAbsent("Рис",1003);
            System.out.println("\nВызов метода putIfAbsent():");
        }


}
