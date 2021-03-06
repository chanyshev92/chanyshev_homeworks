import java.util.*;

public class Main {

    public static String prepareString(String string){

        string=string.toLowerCase().replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "");
        return string;

    }

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
    public static void printMap (Map<String,Integer> map){

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            System.out.println("Слово: " + entry.getKey() + ", Количество раз: " + entry.getValue());

        }
    }


    public static void main(String[] args) {

        String string = "1) Длинная строка с #разными# словами, %строка% упоминается дважды. 2) С разными значениями";
        System.out.println(string);

        string=prepareString(string);

        String[] words = string.split(" ");
        Map<String,Integer> map = new HashMap<>();

        putStringsIntoMap(words,map);

        //System.out.println(map);
        printMap(map);

    }


}
