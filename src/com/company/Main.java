package com.company;

import java.util.*;

public class Main {

public static void main(String[] args) {
   List<Integer> nums = new ArrayList<>(List.of(1, 8, 2, 3, 4, 4, 5, 9, 6, 7));
   //Task1
        for (Integer num : nums) {
        if (Objects.nonNull(num)&& num %2 !=0){
        System.out.print(num);
        }
        }
        System.out.println();
        //Task2
   List<Integer> num = new ArrayList<>(List.of(1, 8, 2, 3, 4, 4, 5, 9, 6, 7));
   Set<Integer> set = new TreeSet<>();
    for (Integer i : num) {
        if (i % 2 == 0) {
            set.add(i);
        }
    }
    for (Integer i:set ){
        System.out.print(i);
    }
    System.out.println();
//Task3
List<String> words = new ArrayList<>(List.of("tree", "grass", "tree","grass","honey", "honey"));
    System.out.println(new HashSet<>(words));
    //Task4
List<String> word = new ArrayList<>(List.of("tree", "grass", "tree","grass","honey", "honey"));
Map<String, Integer> countWord= new HashMap<>();
for (String e:word){
    if (countWord.containsKey(e)){
    countWord.put(e, countWord.get(e)+1) ;
    }else{
    countWord.put(e, 1);
    }
}
    System.out.println(countWord);
}
}



