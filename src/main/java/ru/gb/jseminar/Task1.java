package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {

    // Дана последовательность чисел. Необходимо вернуть число совпадающих пар в этой последовательности
    // Пример 1:     In: arr = [1, 2]  Out: 0
    // Пример 2:     In: arr = [1, 1, 2]  Out: 1
    // Пример 3:     In: arr = [1, 1, 1, 2, 2]  Out: 4
    // 1 1 1 1 -> 6
    // 1 1 1 1 1 -> 10
    // 1 1 1 1 1 1 -> 15
    public static void main(final String[] args) {
        Task1 t1 = new Task1();
        List<Integer> listInt = new ArrayList<>(List.of(1, 1, 1, 2,2));
        System.out.println(t1.getNumberOfCouples(listInt));
    }

    public Integer getNumberOfCouples(final List<Integer> list){
        Map<Integer,Integer> checkMap = new HashMap<>();
        for (int item : list){
            checkMap.put(item, 1 + checkMap.getOrDefault(item, 0));
        }
        System.out.println(checkMap);
        int result = 0;
        for (int item : checkMap.values())
            if (item > 1)
                result+=item;
        return result;
    }

}
