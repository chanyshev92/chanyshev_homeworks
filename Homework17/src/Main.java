import java.util.*;

public class Main {

    public static void putStringsIntoMap(String[] words, Map<String, Integer> map) {
        for (String x: words) {

            // проверяем содержит ли map слово x
            if(map.containsKey(x)){

                //перезаписываем слово x увеличивая уже имеющееся количество вхождений
                map.put(x, map.get(x)+1);

            }else{

                //записываем слово с количеством=1
                map.put(x,1);

            }

        }

    }
    public static void printingByMarsel(Map<String,Integer> map){

        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {

            System.out.println("Слово: " + entry.getKey() + ", Количество раз: " + entry.getValue());

        }
    }


    public static void main(String[] args) {

        String string = "Длинная строка с разными словами строка упоминается дважды С разными значениями";
        System.out.println(string);

        String[] strings = string.split(" ");
        Map<String,Integer> map = new HashMap<>();

        putStringsIntoMap(strings,map);

        //System.out.println(map);
        printingByMarsel(map);

    }


}
