package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
    //Проверка есть ли значение в map
	Map<String,String> map = new HashMap<>();
	//Обычный вариант
	if(map.get("name")==null){
	    map.put("name","John");
    }
        System.out.println(map);
	//Новый вариант
    Map<String,String> map1 = new HashMap<>();
	map1.putIfAbsent("name","John");
        System.out.println(map1);
    //ComputeIfPresent, проверяет значение по ключу и выводит значение/null
    Map<String,String> map3 = new HashMap<>();
    map3.put("name", "John");
    map3.computeIfPresent("name",(k,v) -> k+ ", "+ v);
        System.out.println(map3.get("name"));
    //ComputeIfAbsent, если нет значения, выводит заданный текст
    Map<String,String> map4 = new HashMap<>();
    map4.put("name","Mary");
    map4.computeIfAbsent("name1",key-> key +" is " + "null");
        System.out.println(map4.get("name1"));
    //Remove если ключ совпадает
    Map<String, String> map5 = new HashMap<>();
    map5.put("surname","Savelev");
    map5.remove("surname");
        System.out.println(map5.get("surname"));
    //GetOrDefault(); Если с таким ключём нет значения, возвращает заданное значение
    Map<String,Integer> map6 = new HashMap<>();
    map6.put("Mandarin", 500);

    Integer value = map6.getOrDefault("Mandarin", 0);
        System.out.println(value);

    Integer valOrDefault = map6.getOrDefault("i forgot my key", 0);
        System.out.println(valOrDefault);

    //Merge(); объединяет значения
    Map<String,String> map7 = new HashMap<>();
    map7.put("question", "bla?");

    map7.merge("question","what?",(oldVal,newVal) -> oldVal + newVal);

        System.out.println(map7.get("question"));
    //Если такого значение в Map нет, то оно создатся само

    map7.merge("what?","question?", (oldV,newV) -> oldV + newV);

        System.out.println(map7.get("what?"));
    }
}
